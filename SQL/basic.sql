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

show databases;


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



#----------------------------------------------
#drop and truncate and delete ,update

use emp;
create table EmpDate(eid int primary key ,ename varchar(20));
insert into EmpDate values(01,"swapnil"),(02,"jay"),(03,"Om");
select *from EmpDate;

#detete praticular row of the table
delete from EmpDate where eid=01;

#udate table info
update EmpDate set ename="Don" where eid=02; 

-- truncate using this to delete from all data of the table 
 truncate table EmpDate;
 
 -- drop are the use to delete the table 
 drop table EmpDate;
select *from EmpDate; # show on table not exting on databse

#join ------------------------------------
-- 4 type of join 

use emp;
create table Department(did int primary key, dname varchar(20));
insert into Department values(01,"selles"),(02,"It dept"),(03,"Hr"),(04,"Software dept");
select * from Department;

create table Employee(eid int primary key,ename varchar(20) ,deptId int ,foreign key (deptId) references Department (did));
insert into Employee values(01,"Swapnil Supekar",02),(02,"Om yadav",02),(03,"Jay Patil",01),(04,"Vijay nirpal",04);
select * from Employee;

# 1) ineer join

select * from Employee e
inner join Department d
on e.deptId=d.did;

# 2) left join
select * from Employee e
left join Department d
on e.deptId=d.did;

# 3) right join
select * from Employee e
right join Department d
on e.deptId=d.did;

# 4) full join
select * from Employee e
left join Department d
on e.deptId=d.did
union
select * from Employee e
right join Department d
on e.deptId=d.did;

#-- ------------------------------------


