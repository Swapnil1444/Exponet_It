show databases;
create database PrasnalCode;
use PrasnalCode;

create table Student(id int primary key,name varchar(30),age int check(age>=18), bloodGroup char(1));

alter table Student modify name varchar(40) not null;
alter table Student modify bloodGroup  enum('A','B','C');
alter table Student modify age int check(age >=18)  default 18;
alter table Student add column phone varchar(10) unique;
#alter table Student modify id int primary key auto_increment;

desc Student;

insert into Student values(1,"swapnil",19,'A');
insert into Student values(2,"jay",18,'B');
insert into Student (id,name,bloodGroup) values(3,"Om",'A');

update Student set phone ="9309144435" where id=1;

rename table Student to Stud;
select * from Stud;
rename table Stud to Student;
select *from Student;

