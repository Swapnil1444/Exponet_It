create database practice;
use practice;

create table Employee(Employee_ID int primary key,
Employee_Name varchar(30),
Department varchar(30),
Salary double,
City varchar(20),
Joining_Date date);

desc Employee;

insert into Employee values(101,"priya","HR",45000,"Mumbai",'2023-08-20');
insert into Employee values(102,"Ami","Sales",38000,"Nashik",'2022-06-18');
insert into Employee values(103,"Rahul","IT",55000,"Pune",'2024-06-10');
insert into Employee values(104,"Sneha","IT",62000,"pune",'2021-05-14');
insert into Employee values(105,"Karan","Finance",70000,"Nagpur",'2020-11-09');
insert into Employee values(106,"Riya","HR",48000,"Mumbai",'2023-02-15');

select * from Employee;

select Employee_name,Salary from Employee;

select * from Employee where Department="IT";

select * from Employee where salary >50000; 

select * from Employee where City="Pune";

select * from Employee where salary between 40000 and 60000;

select * from Employee where joining_date>='2023-01-01';

select distinct department from Employee;

select * from Employee order by salary;

select * from employee order by Joining_Date desc;

select * from employee limit 3;

select * from employee where Employee_name like 'R%';

select * from employee where City = 'Pune' or  City='Mubmbai';

select * from Employee;
#update
update employee set salary=60000 where Employee_Name="Rahul";


update Employee set department="Finance" where Employee_name="Priya";

update Employee set Salary=salary+5000 where department="IT";

update Employee set City ="navi Mumbai" where City="MuMbai";

update employee set Joining_date="2025-01-01" where Employee_Id=105;

update Employee set Salary=Salary*10 ;

update Employee set department="Marketing" where Employee_Id=103;

update Employee set City="Pune" where department="Finance";

#delete
select * from employee;

delete from Employee where Employee_Id=103;

delete from Employee where department="HR";

delete from Employee where salary <40000;


