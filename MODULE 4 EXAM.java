create database satara;
use satara;
create table dept
(
deptno int(2),
Dname varchar(15),
Loc varchar(10));

insert into dept values
(10,'ACCOUNTING','NEWYORK'),
(20,'RESEARCH','DALLAS'),
(30,'SALES','CHICAGO'),
(40,'OPERATIONS','BOSTON');

create table EMP
(
EMPNO int(4),
ENAME varchar(10),
JOB varchar(9),
HIREDATE date,
SAL float(7,2),
COMM float(7,2),
DEPTNO int(2);

insert into EMP(EMPNO,ENAME,JOB,HIREDATE,SAL,COMM,DEPTNO) values
(7839, 'KING', 'MANAGER', '1991-11-17', 5000, NULL, 10),
(7698, 'BLAKE', 'CLERK', '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', '1981-06-09', 2450, NULL, 10),
(7566, 'JONES', 'CLERK', '1981-04-02', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', '1981-09-28', 1250, 1400, 30),
(7499, 'ALLEN', 'SALESMAN', '1981-02-20', 1600, 300, 30);

select * from dept;
select * from EMP; 
select * from EMP where SAL between 2500 and 5000;