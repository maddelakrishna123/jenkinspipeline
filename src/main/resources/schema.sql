drop table if exists employee;
create table employee(id int primary key, name varchar(200),gender varchar(20),age int default 0,salary double default 0.0);