# TODO

- [ ] (Understand JPA) - https://spring.academy/courses/building-a-rest-api-with-spring-boot/lessons/spring-data-lab/lab
- [ ] Add CrudRepository SettingsCRUD and make it work
- [ ] Connect Settings to Settins CRUD and also the controller
- [ ] Add again the Settings_.java and understand the record in Settings. 
## DATABASE DRAFT


Settings
  linkedin_cookie [XYZ]
  dropcontact_api_key [ABC]
  zoho_api_key [123456]
  email_bounce_address [no_reply@hello.com]
  email_domain [hello.com]
  email_sender [vicens@hello.com]
  email_test_sender [datracka@gmail.com]
  email_test_recipient [Vicens Fayos]

User
  id
  name
  email
  password

Process
  linkedin_leads_url  
  test_mode
  crawling_status [IDLE, INPROCESS, DONE] <-- job?
  email_finding_status [IDLE, INPROCESS, DONE]   <-- job?
  campaign_status [IDLE, INPROCESS, DONE]
  email_id
  user_id

(*) hou can create a status table for each process

Email
   id
   email_subject
   email_template_text

Prospects
  id
  full_name
  first_name
  last_name
  company
  email
  process_id

### Database persistance

https://www.youtube.com/watch?v=A8qZUF-GcKo

### You know, record does not work!

[todo](https://www.youtube.com/watch?v=dyA-4QPSowA)

package com.oman.todoitem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public record TodoItem(
        @Id @GeneratedValue Long id,
        String title,
        String description,
        boolean completed) {

    public TodoItem {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
    }
}
  