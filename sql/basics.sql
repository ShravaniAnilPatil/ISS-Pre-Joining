CREATE TABLE Student (
    StudentID INT Primary Key,
    Name VARCHAR(50) NOT NULL,
    Age INT ,
    Gender VARCHAR(10),
    City VARCHAR(50),
    Email VARCHAR(100) Unique
);

Insert into Student
values
(101,'Shravani Patil',22,'Female','Mumbai','shravani@gmail.com');

Insert into Student
values
(102,'Siddhi',21,'Female','Pune','siddhi@gmail.com'),
(103,'Rahul',23,'Male','Nashik','rahul@gmail.com'),
(104,'Priya',20,'Female','Mumbai','priya@gmail.com');

select * from student;

select * from student 
where age >=21;

select * from student 
where age >=21 and city='Mumbai';

select * from student 
where city='Pune' or city='Mumbai';

select * from student 
order by age desc;

update student
set city= 'Thane'
where studentid=104

delete from student 
where studentid=103

select *from Student
limit 3;

select * from Student
where name like 'S%'

select * from Student
where name like '%i'

select * from Student
where name like '%ra%'

select * from Student
where city in ('Mumbai', 'Pune');

select * from Student
where age between 20 and 23;

select name as StudentName from Student;

CREATE TABLE Marks(
    StudentID INT,
    Subject VARCHAR(30),
    Marks INT
);

Insert into Marks values
(101,'DBMS',90),
(102,'Java',85),
(103,'Python',95);

SELECT Student.Name, Marks.Subject, Marks.Marks
FROM Student
INNER JOIN Marks
ON Student.StudentID=Marks.StudentID;

SELECT *
FROM Student
RIGHT JOIN Marks
ON Student.StudentID=Marks.StudentID;

SELECT City,COUNT(*)
FROM Student
GROUP BY City;

SELECT City,COUNT(*)
FROM Student
GROUP BY City
HAVING COUNT(*)>1;

SELECT SUM(Age)
FROM Student;

SELECT MAX(Age)
FROM Student;

SELECT MIN(Age)
FROM Student;