# TODO

## Next

- [ ] In Api Setting when retrieving a setting in DTO cast to get the userID returns an error. 
If we add in DTO `public Enduser user` it should be mapped properly from the entity. Maybe check the [mapperModel](https://modelmapper.org/getting-started/) or how to create yours.
- [ ] In Api Post method, enduser / createAt and updateAt are not set from the DTO to the entity.
- [ ] Define API Users.
- [ ] - [ ] replace @NonNull from `springframework.lang.NonNull` with @NotNull from `spring-boot-starter-validation` (add dependency)

### Interesting lectures

Packt lectures: 

https://subscription.packtpub.com/

To create DTOs

https://subscription.packtpub.com/book/web-development/9781803243214/7/ch07lvl1sec37/adding-models

API Error handling

https://subscription.packtpub.com/book/application-development/9781788475891/10/ch10lvl1sec43/building-a-rest-client

Also I think I need to understand EntityManager to save entities properly: https://www.javaguides.net/2018/12/different-ways-to-update-jpa-entity-objects-into-database.html 

https://www.digitalocean.com/community/tutorials/jpa-entitymanager-hibernate

for Api reference https://github.com/khoubyari/spring-boot-rest-example/tree/master

also, interesting how it works with 

- Controllers
- Services
- Dtos -> maybe a bit of refresh about DTOs in Java :) 

Collio: 

https://github.com/hellokoding/hellokoding-courses/tree/master/springboot-examples/springboot-restapi-testing-all-layers/src/main/java/com/hellokoding/springboot/restful/product

https://hellokoding.com/restful-api-example-with-spring-boot-spring-data-rest-one-to-many-relationship-and-mysql/

Spring Boot microservices lecture: 

https://codeburst.io/spring-boot-rest-microservices-best-practices-2a6e50797115

# Nice to Have
- Learn how to generate a UUID automatically (by now I removed the not null constraint in the sql script)
- learn HAL and define api with swagger to define the API.
- Shape API for our needs
- Auth in Spring (API based)

## interesting articles

- [How to add one to many relation](https://www.geeksforgeeks.org/how-to-implement-one-to-many-mapping-in-spring-boot/)
- [Understand EntityManager](https://www.bezkoder.com/jpa-entitymanager-spring-boot/)
- [JPA annotations](https://www.digitalocean.com/community/tutorials/jpa-hibernate-annotations)
- [Java Persistance specification](https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html)

## More Things TODO 

- [ ] Add Lombok https://www.baeldung.com/java-record-vs-lombok or check here an example https://springframework.guru/one-to-one-relationship-in-jpa/
- [ ] (Understand JPA) - https://spring.academy/courses/building-a-rest-api-with-spring-boot/lessons/spring-data-lab/lab
- [ ] Connect Settings to Settins CRUD and also the controller
### Database persistance

https://www.youtube.com/watch?v=A8qZUF-GcKo

# info swagger

http://localhost:8080/swagger-ui

## add test data

```sql
INSERT INTO 
  public.enduser(user_name, email, password, created_at, updated_at)
VALUES 
('pepe', 'aaa@aaa.es', 'secret', current_timestamp, current_timestamp);

INSERT INTO public.setting(
  linkedin_cookie, dropcontact_api_key, zoho_api_key, openai_api_key, openai_organization_id, email_bounce_address, email_domain, email_sender, email_test_sender, email_test_recipient, test_mode, enduser_id, created_at, updated_at)
VALUES ('X11', 'Y22', 'Z11', 'AX22', 'AY33', 'AZ22', 'BX333', 'B55Y', 'BZ22', 'CX33', false, 2, current_timestamp, current_timestamp);
```
