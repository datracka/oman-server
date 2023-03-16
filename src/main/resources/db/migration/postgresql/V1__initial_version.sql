create table if not exists settings
(
    id          bigint  not null
        primary key,
    linkedin_cookie  varchar(255) not null,
    dropcontact_api_key varchar(255) not null,
    zoho_api_key varchar(255) not null,
    email_bounce_address varchar(255) not null,
    email_domain varchar(255) not null,
    email_sender varchar(255) not null,
    email_test_sender varchar(255) not null,
    email_test_recipient varchar(255) not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255) not null,
);

create table if not exists user
(
    id          bigint  not null
        primary key, 
    name varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255) not null,
)


create table if not exists campaign
(
    linkedin_leads_url varchar(255) not null,
    email_subject varchar(4096) not null,
    email_template_text varchar not null,
    crawling_status integer not null,
    email_finding_status integer not null,
    campaign_status integer not null,
    created_at timestamp not null,
    updated_at timestamp not null,
    uuid varchar(255) not null,
)

create table if not exists leads
(
    // pending
)


alter table settings
    owner to vicensfayos;
