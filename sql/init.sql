create schema if not exists test;

create table if not exists test(
    id int primary key auto_increment,
    key_id int not null ,
    time bigint(19),
    unique index uk_key_id(key_id asc)
)