show databases;
create database coffee_store;


use coffee_store;

create table products(
id int auto_increment primary key ,
name varchar(30),
price decimal(4,2)
);
show tables;

create table customers(
id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
gender enum('M','F'),
phone_number varchar(11)
);

create table orders(
id int auto_increment primary key,
product_id int,
customer_id int,
order_time datetime,
foreign key(product_id) references products(id),
foreign key(customer_id) references customers(id)
);

select * from products;

alter table products
add column coffee_origin varchar(30);

show tables;