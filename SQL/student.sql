show databases;
drop table student;
select student;
create table student(
student_id int auto_increment,
name varchar(20),
major varchar(20),
primary key(student_id)
);

insert into student(name, major)  values('kate','biology');
insert into student(name, major)  values('ate','iology');

select * from student;
describe student;
update student
set major ='bio'
WHERE major = 'biology';