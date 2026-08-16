show databases;
create database java;
use java;

create table Student(id int,name varchar(30));
insert into Student values(101,"swapnil");

insert into Student values(102,"Jay");
select * from Student;
#========================
drop table Student;
truncate table Student;
update Student set name="ram" where id=101;
delete from Student where id=102;

#============================

create table Emp(eId int null, name varchar(20));
insert into Emp values(101 ,"Swapnil");
insert into Emp values(102 ,"Ram");
select * from Emp;
show tables;
create table PrincipleData(pId int primary key, pName varchar(20));
insert into PrincipleData values(1,"Don"),(2,"Jon");
insert into PrincipleData value(1," "); # error:duplicate id becose the id is primary key 
select * from PrincipleData;







