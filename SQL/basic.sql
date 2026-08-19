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

#-------------------------------------------------
CREATE DATABASE institude;
USE institude;

CREATE TABLE course (cID INT PRIMARY KEY,cName VARCHAR(30) );
CREATE TABLE student (sID INT PRIMARY KEY, sName VARCHAR(30) ,courseID INT ,foreign key (courseID) references course(cID));

INSERT INTO course VALUES(101,"java");
INSERT INTO course VALUES(102,"python");
SELECT * FROM course;

INSERT INTO student VALUES(11,"swapnil",102);
INSERT INTO student VALUES(12,"Jay",101);
SELECT * FROM STUDENT ; # NO CASE SENSETIV 

SHOW DATABASES;
CREATE DATABASE tcs;
use tcs;
CREATE TABLE EmpDetails(eID INT primary key auto_increment, eName varchar(20));
INSERT INTO empDetails (eName)VALUES ("SWAPNIL");
INSERT INTO empDetails (eName)VALUES ("JAY");
SELECT * FROM empDetails;


#-------------------------------------------------------
#data types
CREATE database emp;
use emp;

create table empAge(age tinyint);
insert into empAge values(20);

create table empMoblie(mobileNo bigint);
insert into empMoblie values(1234567890);

select * From empMoblie;

create table dinner(catagary enum ("breackfast","lunch","dinar"));
insert into dinner values ("lunch");
select * from dinner;

#date time
create table dob(Bdate date);
insert into dob values('2019-02-09');
select * from dob;

create table lunchTime(lunchTime time);
insert into lunchTime values('22:11:09');
select * from lunchTime;

create table dateandtime(livedatatime timestamp);
insert into dateandtime values (current_timestamp);
select * from dateandtime;









 






