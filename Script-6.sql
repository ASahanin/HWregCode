create table UserLogs(
id serial primary key,
user_login varchar references users(login) not null,
lastLogin timestamp not null,
loginSuccess boolean not null
);

create table Users(
id serial primary key,
login varchar(50) not null,
email varchar(50) unique not null,
password varchar not null,
date_of_registration date not null
);

drop table userlogs;