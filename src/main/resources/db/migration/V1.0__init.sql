create table if not exists user (
    id varchar(255) primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null
)