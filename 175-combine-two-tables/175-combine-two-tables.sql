# Write your MySQL query statement below

SELECT a.firstName, a.lastName, b.city,b.state  from Person a left join Address b on  a.personID = b.personID;