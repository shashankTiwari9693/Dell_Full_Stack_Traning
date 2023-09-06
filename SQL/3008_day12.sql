SELECT * FROM emp_tab;
SELECT * FROM emp_tab WHERE NAME LIKE 'S%' AND deptno=30;
SELECT * FROM emp_tab WHERE salary>6000 OR deptno>50;
SELECT * FROM emp_tab WHERE deptno NOT IN (40,70);]

#Order of precedence
#1. Arithmetic operator
#2. Concatenation Operator
#3. Compareison Operator
#4. IS [NOT] NULL,LIKE,[NOT] IN
#5. [NOT] BETWEEN
#6. NOT logical condition
#7. AND logical condition
#8. or  logical condition

#Queries-Precedence
SELECT empno,NAME,deptno,salary FROM emp_tab WHERE deptno=30 AND deptno=40 OR salary>3000;

#Order by

SELECT empno,NAME,salary FROM emp_tab ORDER BY salary;
SELECT empno,NAME,salary FROM emp_tab ORDER BY salary DESC;

#order by clause always comes last in the select statement

SELECT empno,NAME,salary FROM emp_tab WHERE deptno=30 ORDER BY salary;

SELECT empno,NAME,salary FROM emp_tab WHERE deptno=30 ORDER BY salary,empno;


SELECT empno,NAME,salary,hiredate FROM emp_tab  ORDER BY hiredate;

SELECT * FROM emp_tab ORDER BY deptno,salary DESC;
SELECT salary AS sal FROM emp_tab  ORDER BY sal;


#Single row function
#Input: Works on one row

SELECT ROUND(92.975,2)FROM DUAL;
SELECT TRUNCATE(92.427,2) FROM DUAL;
SELECT  MOD(2100,500)FROM DUAL;

SELECT UPPER('new york') AS "output Input " FROM DUAL; 

SELECT LOWER('SHASHANK') AS "output Input " FROM DUAL;


SELECT CONCAT('Hello','Shashank') FROM DUAL;
SELECT SUBSTR()

SELECT INSTR('HelloWorld','o') FROM DUAL;

SELECT LPAD(5000,8,'*')FROM DUAL;
SELECT LPAD(1000,8,'*')FROM DUAL;
SELECT RPAD(1000,8,'*') FROM DUAL;
SELECT TRIM('d'FROM 'helloworld') FROM DUAL;
SELECT REPLACE('HelloWorld','HELLO','BYE')FROM DUAL;

#sysdate is a function that return the current date and time
SELECT SYSDATE() FROM DUAL;
SELECT SYSDATE() FROM DUAL;

SELECT DATE_ADD(SYSDATE(),INTERVAL 2 DAY) AS later_date FROM DUAL;

SELECT DATE_ADD(SYSDATE(),INTERVAL 2 DAY) AS 

SELECT ADDDATE('2008-01-02', 31);
SELECT DATE_SUB('2008-01-02', INTERVAL 31 DAY);

SELECT NAME,to_char(hiredate,'yyyy')"Year of joining" FROM emp_tab;

SELECT NAME,YEAR(hiredate) FROM emp_tab;
SELECT STR_TO_DATE('01,5,2013','%d,%m,%Y');

SELECT NAME,job,salary, CASE job WHEN 'Manager' THEN 1.20*salary WHEN 'ANALYST ' THEN 1.15*salary
WHEN 'clerk' THEN 1.10*salary
ELSE salary END "revised Salary"
FROM emp_tab;

SELECT NAME,job,salary, COALESCE(job,salary,'Manager',1.20*salary,
'ANALYST',1.15*salary,'CLERK',1.10*SALARY,salary)"Revised salary" FROM emp_tab;
)


SELECT NAME,job,salary,
DECODE(JOB,'MANAGER',1.20*SALARY,
'ANALYST',1.15*SALARY,
'CLERK',1.10 * SALARY,
SALARY)"REVISED SALARY"
FROM EMP_TAB

#for tommrow's test
# like concat,str_to_Date, create table, create database;


# select column,GROUP_FUNCTION (column),...... from table (where condition)[group by column][order by column];

#Group Function
1. SUM AND AVG
2. COUNT
3. MAX AND MIN
4. VARIANCE AND STDDEV


SELECT SUM(salary)FROM emp_tab;
SELECT AVG(salary)FROM emp_tab;
SELECT MIN(salary),MAX(salary)FROM emp_tab WHERE deptno=30;
SELECT COUNT(*)FROM emp_tab;

SELECT NAME FROM emp_tab WHERE manager=7003;

SELECT COUNT(DISTINCT(empno))FROM emp_tab;

SELECT MIN(hiredate),MAX(hiredate) FROM emp_tab;

SELECT MIN(NAME),MAX(NAME) FROM emp_tab;

SELECT * FROM emp_tab;

#----------------------------------------------------------------------------------------------------------------------------#
#Creating Groups || group by is useless without group function
SELECT manager,MAX(salary) FROM emp_tab GROUP BY manager ORDER BY MAX(salary) DESC;

SELECT manager,COUNT(salary) FROM emp_tab GROUP BY manager ORDER BY MAX(salary) DESC;

SELECT manager,MAX(salary) FROM emp_tab GROUP BY manager ;

SELECT manager,MAX(salary) FROM emp_tab GROUP BY manager ORDER BY MIN(salary) DESC;
SELECT manager,MAX(salary) FROM emp_tab GROUP BY manager ORDER BY MIN(salary);

