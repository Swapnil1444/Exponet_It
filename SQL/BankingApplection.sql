create database bankingApplection;
use bankingApplection;
create table Account(userId int primary key auto_increment,accountNo long, accountHolderName varchar(30),accountType enum('SAVINGS','CURRENT'),mobile long ,
email varchar(20), adhar varchar(30),pancard varchar(30),address varchar(30),status boolean ,date timestamp);

desc Account;

insert into Account (accountNo , accountHolderName ,accountType ,mobile ,
email , adhar ,pancard ,address ,status  ,date ,balance)values(223321,'jay','SAVINGs',666788665,'jay@gmail.com',
'987633345643','JJKES4433F','pune',true,current_timestamp,5000);

alter table Account add column balance double;

update  Account set balance=1000 where userId=4; 

select * from Account;

select accountNo from Account;
select * from Account where accountNo=79909728807;

update  Account set balance=balance+1000 where accountNo=698377516954; 

delete from Account where accountNo=123456;

update Account set accountHolderName ="jay" where accountNo=698377516954;

update Account set accountNo=123456789012 where accountNo=223321;
update Account set accountNo=799097288071 where accountNo=79909728807;

 
