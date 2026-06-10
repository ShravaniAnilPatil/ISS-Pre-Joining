--JOIN
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
