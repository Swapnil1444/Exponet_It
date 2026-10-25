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

create table Employee (id int ,name varchar(20),dept varchar(20),salary decimal(10,5));
insert into employee values(1,"swapnil","hr",20000);
insert into employee values(2,"harsh","cs",40000);
insert into employee values(3,"diya","hr",50000);
insert into employee values(4,"gauri","cs",80000);
insert into employee values(5,"prachi","pa",30000);
insert into employee values(6,"shivendr","it",60000);
insert into employee values(7,"jay","manegar",90000);
insert into employee values(8,"ram","ca",10000);


select * from employee;
#-----------------------------------
#aggrigation function
select  max(salary) from employee;
select min(salary) from employee;  
select avg(salary) from employee;
select sum(salary) from employee;
select count(*)  from employee;

#-----------------------------------
#group by --selet acending or deseding ordar
select * from employee order by salary desc;
select * from employee order by salary ;

#ordar by 
select dept ,avg(salary) as avgSalary from employee group by dept; 
select dept ,count(dept) as countDept from   employee group by dept;
select dept ,max(salary) from employee group by dept;
select dept ,min(salary) from employee group by dept;
select dept ,sum(salary) from employee group by dept;

#having with ordar by 
select dept ,sum(salary) from employee group by dept having sum(salary)<=300000;
select dept ,sum(salary) from employee group by dept having sum(salary)<=300000 order by dept; 

#keywords 
# distinct - remove the dublicte record in select result
select distinct dept from employee; 
select  distinct name dept from employee;
select distinct * from employee; 

#limit -- return a limit row in table 

select * from employee limit 3;
select distinct * from employee limit 3;
select name  from employee limit 8;
select distinct name  from employee limit 8;
select * from employee order by id limit 6  ;

#offset --skip the spcific record in result set

select * from employee limit 2 offset 4; 
select * from employee order by id limit 6   offset 5;

#coalesce() function -it use to retuen the find frist non-null value 
create table prasan(name varchar(20), phoneNo long);
insert into prasan values("swapnil",null),("ram",7777665678);

select * from prasan;
select name ,coalesce(phoneNo,"not availabele") as phone from prasan;

#TCL commands 
# commit ,rollback ,sevepoint
set autocommit=1; # auto commit on
set autocommit=0; # auto commit off

#commit

insert into employee values(7,"ram","pa",2000);
select * from employee;
commit;

delete from employee where id=3;
rollback  to s1;
insert into employee values(7,"ram","pa",2000);
savepoint s1;

delete from employee where id=7;
savepoint s1;
select * from employee;



delete from employee where name="ram";
savepoint s2;

delete from employee where name="gauri";
savepoint s3;

rollback to s2;
rollback to s1;
commit;
rollback to s3;

#stored procedure

DELIMITER $$
create procedure getEmployeeInfo ()
begin
select * from employee;
end $$
DELIMITER  ;

DELIMITER $$
create procedure getEmployeeById(in id int)
begin
 select * from Employee where id=id;
end $$
DELIMITER ;

call getEmployeeById(1);
CALL getEmployee();

#function 
DELIMITER $$ 
create function getAge(age int)
returns varchar(20)
begin
if age>18 then
return 'is egibale';
else return 'no egibale';
end if;
end $$ 
DELIMITER  ;

select getAge(20);

DELIMITER $$
create function checkEvanOrOdd(num int)
returns varchar(20)
begin
  if num%2=0 then
  return 'Even';
  else 
  return 'Odd';
  end if;
end $$
DELIMITER ;

select checkEvanOrOdd(3); 

DELIMITER $$ 
create function findAvg(num1 int, num2 int ,num3 int)
returns double
begin 
    return (num1+num2+num3)/3;
end $$
DELIMITER ;

select findAvg(20,22,20);

SET GLOBAL log_bin_trust_function_creators = 1;


#index
select * from Employee;

create index index_Employee_salary on Employee(salary);
show index from Employee;

drop index index_Employee_salary on Employee;

create index  index_name_salary on Employee(name ,salary);
show index from Employee;















