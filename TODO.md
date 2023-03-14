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
  