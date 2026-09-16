create database College;
use college;
create table student(id int primary key ,name varchar(30),age int);
insert into student values(101,"swapnil",19),(102,"Om",20);

desc student;
select *from student;


select * from User;

desc emp;
select * from emp;

desc Course;

alter table student add column city varchar(20);
#where condition 
update student set city='dilli' where id=105;
select * from student;

#comperison operions
select * from student where age=19; #equese
select * from student where age!=19; #not eques
select * from student where age<>19; #not eques
select * from student where age>19; #grater than
select * from student where age<19; # less than
select * from student where age>=19; #grater the equal
select * from student where age<=19; #less than equal

#logical operation
select * from student where city='pune' and age>=19; # and operetar
select * from student where city='pune' or city='nagar'; # or opertion 
select * from student where not city='pune'; # not 

#between 
select * from student where age between 19 and 21;
select * from student where not id between 103 and 105; # revers condition

#in opertion
# wuthout in 
SELECT *
FROM Student
WHERE city = 'Pune'
or city='mubai'
or city ='nagpur';

# with in 
select * from student where city in ('pune','nagar');
select * from student where city  not in ('pune','nagar'); 

#like %
select * from student where name like 's%'; # start with s char
select * from student where name like '%y'; # end with y char
select * from student where name like '%wap%'; 
select * from student where name like 's_'; 
























 

