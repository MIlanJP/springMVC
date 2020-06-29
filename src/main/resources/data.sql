create table bridgelabz.registration_details(
username varchar(255) not null ,
firstname varchar(255) not null,
secondname varchar(255) not null,
contactno varchar(255) not null,
password varchar(255) not null,
email varchar(255) not null,
primary key (username)
);

Insert into bridgelabz.registration_details (
username,firstname,secondname,contactno,password,email
) values ('auror','Arvind','singh','12345678','auror@123','auror@gmail.com');

Insert into bridgelabz.registration_details (
    username,firstname,secondname,contactno,password,email
) values ('jdabhi','Abhilash','singh','4561327','jd@1234','jd@gmail.com');

Insert into bridgelabz.registration_details (
    username,firstname,secondname,contactno,password,email
) values ('rahul','Rahul','singh','78945610','rahul@123','rahul@gmail.com');

Insert into bridgelabz.registration_details (
    username,firstname,secondname,contactno,password,email
) values ('govinda','Govinda','singh','15678','gov@123','govinda@gmail.com');
