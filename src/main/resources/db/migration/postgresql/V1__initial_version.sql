CREATE SEQUENCE todoitem_id_seq 
  START WITH 1 
  INCREMENT BY 1 
  NO MINVALUE 
  NO MAXVALUE 
  CACHE 1; 

create table if not exists todoitem
(
    id          bigint  not null DEFAULT nextval('todoitem_id_seq')
        primary key, 
    title varchar(255) not null,
    description varchar not null,
    completed boolean not null,
    uuid varchar(255)
);

alter table todoitem
    owner to vicensfayos;

CREATE SEQUENCE enduser_id_seq 
  START WITH 1 
  INCREMENT BY 1 
  NO MINVALUE 
  NO MAXVALUE 
  CACHE 1; 

create table if not exists enduser
(
    id          bigint  not null DEFAULT nextval('enduser_id_seq')
        primary key, 
    user_name varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255)
);

alter table enduser
    owner to vicensfayos;

CREATE SEQUENCE setting_id_seq 
  START WITH 1 
  INCREMENT BY 1 
  NO MINVALUE 
  NO MAXVALUE 
  CACHE 1; 

create table if not exists setting
(
    id          bigint  not null DEFAULT nextval('setting_id_seq')
        primary key,
    linkedin_cookie  varchar(255) not null,
    dropcontact_api_key varchar(255) not null,
    zoho_api_key varchar(255) not null,
    openai_api_key varchar(255) not null,
    openai_organization_id varchar(255) not null,
    email_bounce_address varchar(255) not null,
    email_domain varchar(255) not null,
    email_sender varchar(255) not null,
    email_test_sender varchar(255) not null,
    email_test_recipient varchar(255) not null,
    test_mode boolean not null,
    enduser_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255),
    CONSTRAINT fk_user FOREIGN KEY(enduser_id) REFERENCES enduser(id)
);

alter table setting
    owner to vicensfayos;


CREATE SEQUENCE campaign_id_seq 
  START WITH 1 
  INCREMENT BY 1 
  NO MINVALUE 
  NO MAXVALUE 
  CACHE 1; 

create table if not exists campaign
(
     id          bigint  not null DEFAULT nextval('campaign_id_seq')
        primary key, 
    campaignName varchar(512) not null,
    linkedin_leads_url varchar(255) not null,
    email_template_subject varchar(4096) not null,
    email_template_text varchar not null,
    crawling_status integer not null,
    email_finding_status integer not null,
    excerpt_generation_status integer not null,
    campaign_status integer not null,
    enduser_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255),
    CONSTRAINT fk_user FOREIGN KEY(enduser_id) REFERENCES enduser(id)
);

alter table campaign
    owner to vicensfayos;

CREATE SEQUENCE lead_id_seq 
  START WITH 1 
  INCREMENT BY 1 
  NO MINVALUE 
  NO MAXVALUE 
  CACHE 1; 

create table if not exists lead
(
    id          bigint  not null DEFAULT nextval('campaign_id_seq')
        primary key,
    full_name varchar(255) not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null,
    company varchar(255) not null,
    company_description varchar not null,
    english_intro varchar not null,
    german_intro varchar not null,
    campaign_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255),
    CONSTRAINT fk_campaign FOREIGN KEY(campaign_id) REFERENCES campaign(id)
);

alter table lead
    owner to vicensfayos;

create index index_id_on_settings on setting (id);
create index index_id_on_enduser on enduser (id);
create index index_id_on_campaign on campaign (id);
create index index_id_on_leads on lead (id);


