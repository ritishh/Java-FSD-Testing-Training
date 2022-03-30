select coffee_origin from products;
-- to select distinct / unique values
select distinct coffee_origin from products;
-- to get all the customers who ordered in feb without distinct
select customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- to get the distinct customers in feb
select distinct customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- you will get duplicate customers because they have orderd different products
select distinct customer_id, product_id from orders 
where order_time between '2017-02-01' and '2017-02-28';

-- LIMIT
select * from customers;
select * from customers
limit 5;

select * from customers
limit 10 offset 2;

select * from customers
order by last_name
limit 10;

-- COLUMN NAME ALIAS
select * from products;
select name, price, coffee_origin from products;
-- changing the column names only in the reslut set not the database
select name as Coffee, price, coffee_origin as Country from products;

/* EXERCISE 3
1) from customers table, select distinct last names and order alphabetically from a-z.
2) from orders table , select the first 3 orders placed by customer with id 1, in february 2017.
3) from the products table, select the name , price and coffee_origin but rename the price to retail_price in the result set.alter.
*/

select distinct last_name from customers
order by last_name asc;

select * from orders 
where order_time between '20170201' and '20170228'
and customer_id=1
order by order_time asc
limit 3;

select name,price as retail_price,coffee_origin from products;
