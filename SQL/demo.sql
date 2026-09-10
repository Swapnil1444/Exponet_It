create database comp;
use comp;
create table emp(id int primary key ,name varchar(30), salary int,age int ,joinDate date, city varchar(20));
insert into emp values (1,"swapnil",20000,21,'2018-09-11',"pune");
insert into emp values (2,"jay",40000,22,'2018-10-11',"nagpur");
insert into emp values (3,"rahul",7000,19,'2017-01-09',"nagar");
insert into emp values (4,"ram",5000,24,'2022-10-12',"pune");
insert into emp values (5,"prachi",20000,22,'2020-09-11',"pune");
insert into emp values (6,"harsh",5000,21,'2016-01-10',"pune");
insert into emp values (7,"suhani",80000,24,'2024-03-11',"nagpur");

select  * from emp;

select name, salary from emp;
select * from emp where salary>=5000;
select * from emp where city="pune";

select * from emp where  salary>=40000 or salary<=60000;

select * from emp where joinDate>='2021-01-31';

select * from emp where age union select * from emp;



