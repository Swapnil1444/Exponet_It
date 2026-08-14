show databases;
create database java;
use java;

create table Student(id int,name varchar(30));
insert into Student values(101,"swapnil");
insert into Student values(102,"Jay");
select * from Student;

drop table Student;
truncate table Student;
update Student set name="ram" where id=101;
delete from Student where id=102;

#============================







