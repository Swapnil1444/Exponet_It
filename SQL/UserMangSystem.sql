create database UserMangSystem;
use  UserMangSystem;
create table User(id int primary key , name varchar(30), address varchar(30),moblieNo long, panCard varchar(20), email varchar(20));
desc User;
select * from user;
insert into User values(101,'swapnil','pune',9309144435,'SSSSD3421D','swapnil@gmail.com');

delete from user where id=101; 
update user set name="prachi" where id=101; 