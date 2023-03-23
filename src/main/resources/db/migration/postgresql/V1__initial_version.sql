create table if not exists enduser
(
    id          bigint  not null
        primary key, 
    user_name varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255) not null
);

alter table enduser
    owner to vicensfayos;

create table if not exists setting
(
    id          bigint  not null
        primary key,
    linkedin_cookie  varchar(255),
    dropcontact_api_key varchar(255),
    zoho_api_key varchar(255),
    openai_api_key varchar(255),
    openai_organization_id varchar(255),
    email_bounce_address varchar(255) not null,
    email_domain varchar(255) not null,
    email_sender varchar(255) not null,
    email_test_sender varchar(255) not null,
    email_test_recipient varchar(255) not null,
    test_mode boolean not null,
    enduser_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255) not null,
    CONSTRAINT fk_user FOREIGN KEY(enduser_id) REFERENCES enduser(id)
);

alter table setting
    owner to vicensfayos;


create table if not exists campaign
(
     id          bigint  not null
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
    uuid varchar(255) not null,
    CONSTRAINT fk_user FOREIGN KEY(enduser_id) REFERENCES enduser(id)
);

alter table campaign
    owner to vicensfayos;

create table if not exists lead
(
    id          bigint  not null
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
    uuid varchar(255) not null,
    CONSTRAINT fk_campaign FOREIGN KEY(campaign_id) REFERENCES campaign(id)
);

alter table lead
    owner to vicensfayos;

create index index_id_on_settings on setting (id);
create index index_id_on_enduser on enduser (id);
create index index_id_on_campaign on campaign (id);
create index index_id_on_leads on lead (id);


