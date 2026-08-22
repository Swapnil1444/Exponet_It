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
-- 6 type of join 

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
# 5)full join and 6)self join 

use emp;
show tables;
create table Student(id int primary key ,studName varchar(30),studAge int);
create table Techear(tid int primary key ,tName varchar(30),StudId int ,foreign key(studId) references Student(id));
create table Subjects(sid int primary key,sName varchar(20),tId int ,foreign key (tId) references Techear(tid));

insert into Student values(101,"swapnil",20),(102,"jay",21),(103,"om",19);
select * from Student;

insert into Techear values(1,"om",102),(2,"nilesh",102),(3,"omkar",102),(4,"pratic",103);
select * from Techear;

insert into Subjects values (11,"java",2),(12,"py",4),(13,"sql",3);
select * from Subjects;

#full join
select S.studName ,T.tName ,S1.sName from Student S
inner join Techear T on
S.id=T.studId 
inner join Subjects S1 on
T.tId=S1.tId;

#--------------------------------------
# crass join

use emp;
create table Addidas( tId int primary key,tname varchar(20));
create table size(sId int primary key ,tsize char(1));

insert into Addidas values(101,"Tshart"),(102,"comanShart"),(103,"fullShart");
select * from Addidas;

insert into size values (1,'M'),(2,'S'),(3,'L'),(4,'X');
select * from size; 

select a.tname ,s.tsize from Addidas a cross join size s;

# self join

create table Company( eId int primary key ,ename varchar(20), mangerId int);

insert into Company values(1,"jay",null),(2,"swapnil",1),(3,"Om",1),(4,"rohit",3),(5,"yash",2);
select * from Company;
select e.ename as employee , m.ename as manger from Company e 
join Company m on e.eId=m.mangerId;






















