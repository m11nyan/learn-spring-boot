# Projet Spring Boot avec Thymeleaf

## Description
Ce projet est une application web développée avec Spring Boot et Thymeleaf. Il s'agit d'une application d'apprentissage qui démontre l'utilisation de Spring Boot avec le moteur de template Thymeleaf pour créer des applications web Java modernes.

## Prérequis
- Java 11 ou supérieur
- Maven 3.6.x ou supérieur
- IDE de votre choix (IntelliJ IDEA, Eclipse, VS Code)
- Git (optionnel, pour le versionnement)

## Installation et Configuration

1. Cloner le projet (si vous utilisez Git)
   ```
   git clone [URL_DU_REPOSITORY]
   cd learn-spring-boot
   ```

2. Construire le projet avec Maven
   ```
   mvn clean install
   ```

3. Exécuter l'application
   ```
   mvn spring-boot:run
   ```
   Ou exécutez la classe principale `Application.java` depuis votre IDE.

4. Accéder à l'application
   Ouvrez votre navigateur et accédez à : http://localhost:8080

## Structure du Projet
```
learn-spring-boot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── learnspringboot/
│   │   │               ├── controllers/
│   │   │               ├── models/
│   │   │               ├── repositories/
│   │   │               ├── services/
│   │   │               └── Application.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   ├── js/
│   │   │   │   └── images/
│   │   │   ├── templates/
│   │   │   ├── application.properties
│   │   │   └── messages.properties
│   └── test/
├── pom.xml
└── README.txt
```

## Configuration
La configuration principale se trouve dans le fichier `application.properties`. Vous pouvez y modifier:
- Le port du serveur
- La configuration de la base de données
- Les paramètres de logging
- Et d'autres configurations spécifiques à Spring

## Fonctionnalités
- Interface utilisateur basée sur Thymeleaf
- Gestion de données avec Spring Data JPA (si applicable)
- Validation des formulaires
- Internationalisation
- Gestion des erreurs personnalisées

## Technologies Utilisées
- Spring Boot
- Thymeleaf
- Spring Data JPA (optionnel)
- Spring Security (optionnel)
- HTML5, CSS3, Bootstrap
- Maven

## Développement
Pour contribuer au développement:
1. Créez une branche pour votre fonctionnalité
2. Développez et testez votre code
3. Soumettez une pull request

## Auteur
[Farid-Efrei]

## Licence
Ce projet est fait pour monter en compétences. 
