package com.example.learn.learn_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.learn.learn_spring_boot.model.Product;
import com.example.learn.learn_spring_boot.model.ProductType;
import com.example.learn.learn_spring_boot.repository.ProductRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor // This annotation generates a constructor with required arguments (final fields) automatically
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "index"; // This will resolve to src/main/resources/templates/index.html
    }

    @GetMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product()); // Assuming you have a Product class to bind the form data
        model.addAttribute("types", ProductType.values());
        return "newProduct"; // This will resolve to src/main/resources/templates/new_product.html
    }

    @PostMapping("/product")
    public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("types", ProductType.values()); // Add types to the model for the form
            return "newProduct"; // Return to the form if there are validation errors
        }
        productRepository.save(product); // Save the product to the database
        return "redirect:/"; // Redirect to the index page after saving
    }

    @GetMapping("/product/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model){
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("product", product); // Assuming you have a Product class to bind the form data
        model.addAttribute("types", ProductType.values());
        return "editProduct"; // This will resolve to src/main/resources/templates/edit_product.html
    }

    @PostMapping("/product/{id}")
    public String updateProduct(@PathVariable Long id, @Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("types", ProductType.values());
            return "editProduct"; // Return to the form if there are validation errors
        }
        product.setId(id); // Set the ID of the product to update
        productRepository.save(product); // Save the updated product to the database
        return "redirect:/"; // Redirect to the index page after saving
    }
    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id); // Delete the product by ID
        return "redirect:/"; // Redirect to the index page after deleting
    }


}
