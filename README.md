# spring-boot-swagger-config

Integration de swagger dans spring boot 3.0.5

Il y a des conflits de version entre spring boot et swagger, 
Avec maven : il faut juste ajouter 2 dependances dans le fichier pom.xml
  - springdoc-openapi-starter-webmvc-ui, org.springdoc, la version 2.0.4
  - hibernate-validator, org.hibernate.validator, la version 8.0.0
 
 Ouvrez votre navigateur et taper 
  - http://server:port/context-path/swagger-ui.html
  - context-path est vide par defaut.
  
 Vous pouvez retrouver le code de ces dépendances dans maven repository : https://mvnrepository.com/
 Je n'ai pas tester avec gradle mais vous pouvez le faire et partager dans votre github.
