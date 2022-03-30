create database store;

use store;
create table flipkart(
id int  ,
name varchar(20),
price int
);
describe flipkart;

alter table flipkart 
add primary key(id);

alter table flipkart
add constraint flipkart unique (price);
describe flipkart;

create table amazon(
id int,
product varchar(20),
size varchar(3),
flipkart_id int
);
describe amazon;

alter table amazon
add primary key(id);
describe amazon;

alter table amazon
add constraint amazon unique (size);
describe amazon;

alter table amazon
add foreign key (flipkart_id)
references amazon(id);

describe amazon;

insert into flipkart values(1,'alex','500');
insert into flipkart values(2,'flex','650');
insert into flipkart values(3,'mlex','850');
insert into flipkart values(4,'ulex','780');

select * from flipkart;
delete from flipkart
where id  = 1;

select * from flipkart;

-- update
-- select * from flipkart;
-- update flipkart
-- set price = '500'
-- where price = '50'

-- delete





