SELECT NAME,10*salary+100 FROM emp_tab;
SELECT * FROM emp_tab;
SELECT CONCAT(NAME,' belongs to',' department number ',deptno) AS ' Employee department ' FROM hplus.emp_tab;
SELECT DISTINCT hiredate,NAME FROM emp_tab;
UPDATE emp_tab SET hiredate =STR_TO_DATE('May 10,1981','%M %d,%Y') WHERE empno=7009;

SELECT empno,NAME,salary  FROM emp_tab  WHERE salary < 8000;

SELECT * FROM emp_tab WHERE salary BETWEEN 2000 AND 5000;
SELECT * FROM emp_tab WHERE deptno NOT IN(30,70);
SELECT * FROM emp_tab WHERE NAME LIKE '_I%';
SELECT dname,mgr_id FROM dept_tab WHERE mgr_id IS NOT NULL;

SELECT empno,NAME,salary,hiredate FROM emp_tab WHERE hiredate BETWEEN STR_TO_DATE('May 10,1981','%M %d,%Y')
AND STR_TO_DATE('May 10,1987','%M %d,%Y') ;

SELECT empno,NAME,salary FROM emp_tab WHERE NAME='SCOTT';

COMMIT;



aarays traverse
variable scope kahan DECLARE hua h
java class -> locale ,bundle,DATETIME formatter
design pattern --> factory design pattern / dao design pattern
creation method hire 
SQL--> basic CODE
APIs k

dao -> DATA access object --? low LEVEL DATA functionlaity TO high --> model class hoti h jiske corresponidng DATA daal rahe the 
interface, imolemnetation class

signleton --> ek class k jitne mrji bana lo rahega ek hi INSTANCE;
serializarion READ Object