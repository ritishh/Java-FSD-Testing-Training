use coffee_str;
select * from customers;
select * from products;
select * from orders;

-- selecting only one column from the table
select last_name from customers;

-- selecting multiple columns from a table
select last_name,phone_number from customers;

-- selecting particular rows of data according to a condition
select * from products
where coffee_origin='Columbia';

select * from products
where price=3.00;

-- selecting a row with more than one condition
select * from products
where price=3.00
and coffee_origin='Columbia';
-- selecting rows of data which meets either one of the criteria/ condition 
select * from products
where price=3.00
or coffee_origin='Columbia';

/*
Inequality symbols
> : greater than
>=: greater than or equal to
<: less than
<=:less than or equal to
*/

select * from products;

select * from products 
where price>3.00;

select * from products 
where price<3.00;

select * from products 
where price<=3.00;
-- dealing with null values
select * from customers;
-- IS 
select * from customers
where phone_number is null;
-- IS NOT
select * from customers
where phone_number is not null;

/* Exercise 1
1) select first_name and phone_number of all the females who have a last name bluth
2)from products table select the name of all the products wiht price greater than 3.00 or coffee_origin of SriLanka
3)homay male customers dont have a phone_number entered into the table
*/
 select * from customers;
select first_name,phone_number from customers
where gender='F'
and last_name='Bluth';

 select name from products
where price>3.00
or coffee_origin='Sri Lanka';

 select * from customers
 where gender='M'
 and phone_number is null;
 
 


