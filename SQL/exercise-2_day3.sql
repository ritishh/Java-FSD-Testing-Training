-- selecting rows containing two or more values
select * from customers
where last_name in ('Bluth','Taylor','Armstrong');

-- selecting rows not containing two or more values
select * from customers
where first_name not in ('Katie','George','John');

select * from orders;

-- selecting rows/ data which lie between a range of values
-- on dates
select product_id, customer_id, order_time from orders
where order_time between '2017-01-01' and '2017-01-07';
-- on numbers
select product_id, customer_id, order_time from orders
where customer_id between 5 and 10;

select * from customers;
-- on strings
select * from customers
where last_name between 'A' and 'L';

-- like/ pattern matching starting with a letter
select * from customers
where last_name like 'W%';
-- having the letter in it
select * from customers
where last_name like '%o%';
-- ending with a particular letter
select * from customers
where last_name like '%r';
-- Underscore represents exactly one character presceding or aafter the specified letter
select * from customers
where first_name like '_o_';

-- LIKE with numbers
select * from products;
select * from products
where price like '3%';

-- ordering the data
select * from products;

select * from products
order by price asc;

select * from products
order by price desc;
-- ORDER BY ON STRINGS
select * from customers;
select * from customers
order by last_name asc;

select * from customers
order by last_name desc;
-- ORDER BY ON DATE
select * from orders;
select * from orders
where customer_id=1
order by order_time asc;

/* exercise-2
1) from products table, select the name and price of all the products with a coffee origin 
equal to columbia or Indonesia. Ordered by name from A-Z
2) from orders table, select all the orders from february 2017 for customers with id's of 2,4,6 or 8.
3)from the customers table, select the first_name and phone_number of all the customers who's last name contains the pattern 'ar'.
*/

select name,price from products
where coffee_origin in ('columbia','indonesia')
order by name asc;

select * from orders
where order_time between '2017-02-01' and '2017-02-28'
and customer_id in (2,4,6,8);

select first_name,Phone_number from customers
where last_name like '%ar%';


