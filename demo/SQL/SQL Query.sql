CREATE DATABASE test;
USE test;

CREATE TABLE demo(
 p_id int(6) not null auto_increment primary key,
 name varchar(100) not null,
 age int,
 sex char(1)
);

INSERT INTO demo(name,age,sex) values('Thomas',28,'M');
INSERT INTO demo(name,age,sex) values('Varsha',25,'F');

Select * from demo;