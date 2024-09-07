--comandos basicos para sql

--SELECT es para mostrar datos especificos de tablas
SELECT * FROM EMPLOYEES;

SELECT HIRE_DATE FROM EMPLOYEES;

SELECT FIRST_NAME,SALARY FROM EMPLOYEES;


 
--SELECT DISTINCT es para mostrar los sin copias, estas copias tienen que ser exactas para que no se muestren
SELECT DISTINCT FIRST_NAME FROM EMPLOYEES;
--muestra todos los datos de la tabla sin copias exactas



SELECT COUNT (DISTINCT FIRST_NAME) FROM EMPLOYEES;
-- Muestras la cantidad de datos especificos  sin repetir en la tabla



--WHERE es para agregar una condicion que debe cumplirse en la busqueda
SELECT FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME='Steven';

SELECT FIRST_NAME,SALARY FROM EMPLOYEES WHERE SALARY BETWEEN 3000 AND 10000;
--busca datos con rangos especificos

SELECT FIRST_NAME,SALARY FROM EMPLOYEES WHERE SALARY NOT BETWEEN 3000 AND 10000;\
--busca datos con rangos especificos

SELECT FIRST_NAME,JOB_ID FROM EMPLOYEES WHERE JOB_ID IN ('SA_REP', 'SH_CLERK');
--busca todos los datos que contengan los caracteres indicados

SELECT LAST_NAME FROM EMPLOYEES WHERE LAST_NAME LIKE 'L%';
--busca los datos que comiencen con el caracter indicados

SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID=80 AND EMPLOYEE_ID>115;
-- AND sirve para poner condiciones a cumplir, los resultados contaran con todas las condiciones cumplidas

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID<150 OR EMPLOYEE_ID>175;
--OR sirve para poner condiciones a cumplir, los resultados contaran con al menos una de las condiciones cumplidas

SELECT * FROM EMPLOYEES WHERE NOT JOB_ID='SH_CLERK';
--NOT sirve para poner una condicion a cumplir, los datos a mostrar no deben contar con la condicion cumplidas



-- ORDER BY sirve para ordenar una lista de resultados de manera ascendente o descendente (ASC / DESC), predeterminadamente los ordena de manera ascendente
SELECT * FROM COUNTRIES ORDER BY COUNTRY_NAME;
--ordena los resultados ascendentemente (alfabeticamente)

SELECT * FROM COUNTRIES ORDER BY COUNTRY_NAME DESC;
--ordena los resultados descendentemente (alfabeticamente)

SELECT * FROM EMPLOYEES ORDER BY JOB_ID ASC,LAST_NAME DESC;
--ordena los resultados por el job_id de manera ascendente y si hay mas de un dato con el mismo job_id, los ordena por su last_name de manera descendente



--INSERT INTO es para insertar datos en tablas previamente creadas
INSERT INTO EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID)
VALUES(207,'Felipe','Novoa','FELIPENMQ','515.465.8343',TO_DATE('15-10-2007', 'dd-MM-yyyy'),'SA_MAN',12500,.3,100,80);
--para insertar datos de manera especifica

INSERT INTO EMPLOYEES VALUES(208,'Sebastian','Valdes','SEVALDESZ','515.834.3229',TO_DATE('10-03-2005', 'dd-MM-yyyy'),'SA_MAN',10000,.3,100,80);

--para insertar datos de manera ordenada



--NULL Y NOT NULL son operadores
SELECT EMPLOYEE_ID,COMMISSION_PCT FROM EMPLOYEES WHERE COMMISSION_PCT IS NULL;
--muestra los resultados de la busqueda con datos NULL


SELECT EMPLOYEE_ID,COMMISSION_PCT FROM EMPLOYEES WHERE COMMISSION_PCT IS NOT NULL;
--muestra los resultados de la busqueda con datos NOT NULL



--UPDATE SON PARA REALIZAR CAMBIOS EN DATOS YA INGRESADOS EN UNA tabla
UPDATE EMPLOYEES SET FIRST_NAME='Michael',LAST_NAME='Townley' WHERE EMPLOYEE_ID=208;



--DELETE se usa para eliminar datos de una tabla
DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID=208;
--ASI SE ELIMINA UNA LINEA ESPECIFICA DE LA tabla



DELETE FROM EMPLOYEES;
--ASI SE ELIMINA TODOS LOS DATOS DE LA tabla



--MIN devuelve el menor dato de la columna elegida y MAX devuelve el mayor
SELECT MIN(SALARY) AS LOWSALARY FROM EMPLOYEES;
--Devuelve el menor valor de la columna seleccionada



SELECT MAX(SALARY) AS WILDSALARY FROM EMPLOYEES;
--Devuelve el mayor valor de la columna seleccionada



--count, svg y sum
SELECT COUNT(SALARY) FROM EMPLOYEES WHERE SALARY>10000;
--muestra la cantidad de valores que cumplen con la condicion



SELECT AVG(SALARY) FROM EMPLOYEES WHERE SALARY>10000;
--muestra el promedio de los valores que cumplen con la condicion



SELECT SUM(SALARY) FROM EMPLOYEES WHERE SALARY>10000;
--muestra la suma de los valores que cumplen con la condicion



--AS es para nombrar los resultados de una busqueda de una manera especifica temporalmente
SELECT SALARY,SALARY*12 AS YEARLYSALARY FROM EMPLOYEES;



--INNER JOIN se usa para mostrar datos de dos tablas que coincidan
SELECT EMPLOYEES.FIRST_NAME,EMPLOYEES.SALARY,JOBS.JOB_ID FROM EMPLOYEES INNER JOIN JOBS ON EMPLOYEES.JOB_ID=JOBS.JOB_ID;



--LEFT JOIN se usa para mostrar todos los datos de la primera tabla y los que coincidan de la segunda
SELECT EMPLOYEES.EMPLOYEE_ID,JOB_HISTORY.JOB_ID FROM EMPLOYEES LEFT JOIN JOB_HISTORY ON EMPLOYEES.HIRE_DATE=JOB_HISTORY.START_DATE ORDER BY EMPLOYEES.EMPLOYEE_ID;



--RIGHT JOIN se usa para mostrar los datos que coincidan de la primera tabla y todos los datos de la segunda
SELECT EMPLOYEES.EMPLOYEE_ID,JOB_HISTORY.JOB_ID FROM EMPLOYEES RIGHT JOIN JOB_HISTORY ON EMPLOYEES.HIRE_DATE=JOB_HISTORY.START_DATE ORDER BY EMPLOYEES.EMPLOYEE_ID;



--FULL JOIN se usa para mostrar los datos coincidentes de la primera y segunda tabla
SELECT EMPLOYEES.EMPLOYEE_ID,EMPLOYEES.FIRST_NAME,DEPARTMENTS.DEPARTMENT_NAME FROM EMPLOYEES FULL JOIN DEPARTMENTS ON EMPLOYEES.MANAGER_ID=DEPARTMENTS.MANAGER_ID ORDER BY EMPLOYEES.EMPLOYEE_ID;



--UNION se usa para unir dos resultados de SELECT diferentes en una misma tabla
SELECT EMPLOYEE_ID FROM EMPLOYEES UNION SELECT MANAGER_ID FROM DEPARTMENTS;
--PARA DATOS UNICOS



SELECT EMPLOYEE_ID FROM EMPLOYEES UNION ALL SELECT MANAGER_ID FROM DEPARTMENTS;
--PARA DATOS CON COPIAS



--GROUP BY sirve para agrupar filas y contar especificamente las que tengan la columna especificamente
SELECT COUNT(EMPLOYEE_ID),MANAGER_ID FROM EMPLOYEES GROUP BY MANAGER_ID;


--& se usa para que el usuario pueda ingresar datos temporales para consulta
SELECT * FROM EMPLOYEES WHERE LAST_NAME='&Apellido'


--& se puede usar mas de una vez en la misma consulta
SELECT EMPLOYEE_ID,LAST_NAME,JOB_ID,&COLUMN_NAME FROM EMPLOYEES
WHERE &CONDITION ORDER BY &ORDER_COLUMN;


--&& se usa para que el usuario pueda ingresar datos que quedaran guardados en la base de datos
SELECT EMPLOYEE_ID,LAST_NAME,JOB_ID,&&COLUMN_NAME FROM EMPLOYEES ORDER BY &COLUMN_NAME;


--PARA ELIMIRAR VARIABLE &&
UNDEFINE COLUMN_NAME; --SI NO HAY ERROR ES PORQUE FUNCIONO


--para calcular el resto de una division se usa mod
SELECT ROUND(96.54), ROUND(96.44), ROUND(258.367,1),
TRUNC(96.54), TRUNC(258.367,1),
10/2,MOD(10,2) FROM DUAL;


--MANIPULAR FECHAS
SELECT SYSDATE, MONTHS_BETWEEN(SYSDATE,'22-01-2023')
NEXT_DAY('14/AGO/2023','LUNES') "NEXT_DAY",
LAST_DAY('18/JUN/2023') "LAST_DAY" FROM DUAL; 

SELECT SYSDATE,
        EXTRACT(DAY FROM SYSDATE) DIA,
        EXTRACT(MONTH FROM SYSDATE) MES,
        EXTRACT(YEAR FROM SYSDATE) ANIO,
FROM DUAL;



--TO_CHAR
SELECT  SYSDATE AS SO, 
        CURRENT_DATE AS SESION,
        TO_CHAR(CURRENT_DATE, 'YYYY'),
        TO_CHAR(CURRENT_DATE, 'YY'),
        TO_CHAR(CURRENT_DATE, 'DD/MM/YY'),
        TO_CHAR(CURRENT_DATE, 'DD/MM/YY HH:MI:SS'),
        TO_CHAR(CURRENT_DATE, 'DD/MM/YY HH:MI:SS PM'),
        TO_CHAR(CURRENT_DATE, 'dd "de" MONTH "del" yyyy hh12:mi:ss AM'),
        TO_CHAR(CURRENT_DATE, 'dd "de" MONTH "del" yyyy hh24:mi:ss AM'),
        TO_CHAR(CURRENT_DATE, 'Q')
FROM DUAL;


SELECT TO_CHAR(CURRENT_DATE, 'D'),
        TO_CHAR(CURRENT_DATE, 'DAY'),
        TO_CHAR(CURRENT_DATE, 'DL'),
        TO_CHAR(CURRENT_DATE, 'DS'),
        TO_CHAR(CURRENT_DATE, 'DY')
FROM DUAL;

SELECT TO_CHAR(20956821, '999G999G999'),
        TO_CHAR(20956821, '$999G999G999'),
        TO_CHAR(20956821, 'L999G999G999'),
        TO_CHAR(20956821, 'L999G999G999D00')
FROM dual;

ALTER SESSION SET NLS_TERRITORY= 'CHILE';
-- TO_NUMBER()
SELECT '2 + 5',
        TO_NUMBER('2') + TO_NUMBER('5') CONV_EXPL,
        '2' + '5' CONV_IMPL
FROM dual;

-- TO_DATE
-- conversi�n expl�cita
SELECT EXTRACT(MONTH FROM TO_DATE('08-09-2023'))
FROM DUAL;
-- conversi�n impl�cita
SELECT hire_date
FROM employees
WHERE hire_date > '01-04-2008';

-- NVL
SELECT NVL(NULL,'ES NULO')
FROM DUAL;

SELECT first_name, 
        NVL(commission_pct, 0) AS valor_comision
FROM employees;

select first_name, 
        NVL(TO_CHAR(manager_id), 'SIN JEFE(A)')
from employees;


--ALTERAR SELECT DE FECHAS
SELECT hire_date, 
        ADD_MONTHS(hire_date,1) agrega_meses,
        ADD_MONTHS(hire_date,-1) quita_meses,
        hire_date + 2 suma_dias,
        hire_date - 2 resta_dias
FROM employees;


SELECT SYSDATE, 
        EXTRACT(DAY FROM SYSDATE) dia,
        EXTRACT(MONTH FROM SYSDATE) mes,
        EXTRACT(YEAR FROM SYSDATE) ano
FROM dual;


--EDITAR EL FORMATO DEL RESULTADO
SELECT last_name, 
        UPPER(last_name),  
        job_id,  
        LOWER(job_id),  
        INITCAP(job_id)
 FROM employees;
 

SELECT  last_name apellido,  
        CONCAT('Su salario es ', salary), 
        SUBSTR(last_name , 1,4),  
        LENGTH(last_name), 
        INSTR('abcdef', 'e') 
 FROM employees;
 
SELECT last_name "Apellido", 
        INSTR(last_name,'e', 1, 2) "Resultado INSTR",
        SUBSTR(last_name, -2, 2) "Resultado SUBSTR", 
        TRIM('B' FROM last_name) "Resultado 1er. TRIM",
        salary, 
        TRIM(1 FROM salary) "Resultado 2do. TRIM"
FROM employees
WHERE salary between 9500 AND 10000
ORDER BY last_name;

SELECT TRIM('      hola          ') AS ej
FROM DUAL;

SELECT last_name apellido,  
        REPLACE(last_name, 'o', '-----'), 
        salary salario, 
        LPAD(salary,10,'0'),  
        RPAD(salary,10,'x')
 FROM employees
ORDER BY last_name;

-- MANIPULAR N�MEROS
SELECT ROUND(96.54), ROUND(96.44), ROUND(258.367,1),
       TRUNC(96.54), TRUNC(258.367,1),
       10 / 2, MOD(10,2)
FROM dual;

-- MANIPULAR FECHAS
SELECT SYSDATE, 
        MONTHS_BETWEEN(SYSDATE,'22-01-2023'),
        NEXT_DAY('14/AGO/2023','LUNES') "NEXT_DAY",
        LAST_DAY('05/FEB/2020') "LAST_DAY"
FROM dual;


--CASE ES COMO IF ELSE IF ELSE
SELECT SALARY,
        CASE SALARY
            WHEN 8000 THEN 'BUENO'
            WHEN 9000 THEN 'MUY BUENO'
            WHEN 10000 THEN 'EXCELENTE'
                      ELSE 'NO APLICA' 
        END AS EVALUACION_SALARIO
FROM EMPLOYEES; 


SELECT SALARY,
        CASE
                WHEN SALARY>=8000 AND SALARY <=8999 THEN 'BUENO'
                WHEN SALARY>=9000 AND SALARY<=9999 THEN 'MUY BUENO'
                WHEN SALARY>=10000 AND SALARY<=10999 THEN 'EXCELENTE'
                ELSE 'NO APLICA'
        END AS EVALUACION_SALARIO
FROM EMPLOYEES;


--DECODE ES OTRA MANERA DE CASE MAS LIMITADA
SELECT SALARY,
        DECODE(
                SALARY,
                8000, 'BUENO',
                9000,'MUY BUENO',
                100, 'EXCELENTE',
                'NO APLICA'
        ) AS EVALUACION_SALARIO
FROM EMPLOYEES;

-- Funciones de grupo
select sum(salary) suma, 
        avg(salary) promedio,
        min(salary) minimo,
        max(salary) maximo,
        count(salary) cantidad_total,
        count(commission_pct) cant_total_no_nulos,
        count(nvl(commission_pct, 0)),
        count(first_name)
from employees;

select count(*) from employees;

-- Grupos -> GROUP BY
SELECT department_id
FROM employees
GROUP BY department_id;

SELECT job_id
FROM employees
GROUP BY job_id;

-- Funciones de grupo y group by
SELECT job_id, COUNT(employee_id) AS total_empleados
FROM employees
GROUP BY job_id;

-- Determinar el salario promedio por cada departamento
SELECT department_id, AVG(salary)
FROM employees
GROUP BY department_id;

-- Mostrar solo salarios promedios
SELECT department_id, ROUND(AVG(salary)) salario_prom
FROM employees
GROUP BY department_id
HAVING ROUND(AVG(salary)) > 6000; -- Filtro para grupos

-- Ademas, no mostrar salarios iguales a 10000
SELECT department_id, ROUND(AVG(salary)) salario_prom
FROM employees
GROUP BY department_id
HAVING ROUND(AVG(salary)) > 6000
AND ROUND(AVG(salary)) != 10000;

-- Adem�s, no considerar departamentos NULL
-- Ordenar desde el salario promedio m�s alto, al m�s bajo
SELECT department_id, ROUND(AVG(salary)) salario_prom
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id
HAVING ROUND(AVG(salary)) > 6000
AND ROUND(AVG(salary)) != 10000
ORDER BY salario_prom DESC;
-- ORDER BY ROUND(AVG(salary)) DESC;
-- ORDER BY 2 DESC;


SELECT ROUND(MAX(AVG(salary)))
 FROM employees
GROUP BY department_id;


SELECT * FROM DEPARTMENTS;
SELECT* FROM LOCATIONS;

--NATURAL JOIN
SELECT * FROM DEPARTMENTS
NATURAL JOIN LOCATIONS;


SELECT * FROM EMPLOYEES;
SELECT * FROM JOBS;

SELECT E.FIRST_NAME,J.JOB_TITLE FROM EMPLOYEES E
NATURAL JOIN JOBS J
ORDER BY JOB_TITLE ASC;


--INNER JOIN USING
SELECT * FROM EMPLOYEES
INNER JOIN DEPARTMENTS
USING DEPARTMENT_ID;


SELECT * FROM EMPLOYEES
INNER JOIN DEPARTMENTS
USING DEPARTMENT_ID,MANAGER_ID;


--INNER JOIN ON
SELECT E.FIRST_NAME,J.JOB_TITLE FROM EMPLOYEES E
INNER JOIN JOBS J
ON E.JOB_ID=J.JOB_ID;


--SELF JOIN (Tabla que recurre a si misma)
SELECT  e.first_name|| ' ' || e.last_name AS "EMPLEADO(A)",
        j.first_name|| ' ' || j.last_name AS "JEFE(A)"
FROM employees e
INNER JOIN employees j
ON e.manager_id = j.employee_id;

--NONEQUIJOIN (Solo muestra la combinación que es distinta "<>")
SELECT e.first_name, e.job_id, j.job_id AS "Job_id <>"
FROM employees e
INNER JOIN employees j 
ON e.job_id <> j.job_id
ORDER BY 1 ASC;

-- OUTER JOIN [LEFT, RIGHT & FULL] ()
-- LEFT 
SELECT emp.first_name, dep.department_name
FROM employees emp
LEFT OUTER JOIN departments dep
ON emp.department_id = dep.department_id;
-- RIGHT 
SELECT emp.first_name, dep.department_name
FROM employees emp
RIGHT OUTER JOIN departments dep
ON emp.department_id = dep.department_id;
-- FULL
SELECT  NVL(emp.first_name, 'Sin empleado(a)'),
        NVL(dep.department_name, 'Sin departamento')
FROM employees emp
FULL OUTER JOIN departments dep
ON emp.department_id = dep.department_id;

-- CROSS JOIN (Hace todas las combinaciones posibles entre ambas tablas)
SELECT emp.employee_id, dep.department_id, dep.department_name 
FROM employees emp 
CROSS JOIN departments dep
ORDER BY emp.employee_id;

-- JOINS DE MÁS DE 2 TABLAS
SELECT emp.first_name, dep.department_name, loc.city, cou.country_name, reg.region_name
FROM employees emp
INNER JOIN departments dep
ON emp.department_id = dep.department_id
INNER JOIN locations loc
ON loc.location_id = dep.location_id
INNER JOIN countries cou
ON loc.country_id = cou.country_id
INNER JOIN regions reg
ON cou.region_id = reg.region_id;


SELECT
    SR.id_sucursal AS "ID Sucursal",
    R.nombre_region AS "Región de la Sucursal",
    C.numrun AS "RUN del Cliente",
    C.pnombre || ' ' || C.appaterno || ' ' || C.apmaterno AS "Nombre del Cliente",
    COUNT(TC.nro_tarjeta) AS "Cantidad de Compras Vigentes",
    SUM(TC.cupo_disp_compra) AS "Valor Total de Compras Vigentes",
    COUNT(TC.nro_tarjeta) AS "Cantidad de Avances en Efectivo Vigentes",
    SUM(TC.cupo_disp_sp_avance) AS "Valor Total de Avances en Efectivo Vigentes",
    0 AS "Cantidad de Súper Avances en Efectivo Vigentes", -- Agrega la lógica necesaria para calcular esto
    0 AS "Valor Total de Súper Avances en Efectivo Vigentes" -- Agrega la lógica necesaria para calcular esto
FROM
    CLIENTE C
INNER JOIN
    TARJETA_CLIENTE TC ON C.numrun = TC.numrun
INNER JOIN 
    TRANSACCION_TARJETA_CLIENTE T ON T.NRO_TARJETA=TC.NRO_TARJETA
INNER JOIN 
    TIPO_TRANSACCION_TARJETA TT ON TT.COD_TPTRAN_TARJETA=T.COD_TPTRAN_TARJETA
INNER JOIN
    PRODUCTO PR ON PR.COD_PRODUCTO=TT.COD_PRODUCTO
INNER JOIN
    SUCURSAL_RETAIL SR ON T.id_sucursal = SR.id_sucursal
INNER JOIN
    REGION R ON SR.cod_region = R.cod_region
WHERE
    TT.COD_PRODUCTO=1
GROUP BY
    SR.id_sucursal,
    R.nombre_region,
    C.numrun,
    C.pnombre,
    C.appaterno,
    C.apmaterno;

--Subconsulta de una fila (el sueldo de abel)
--SELECT * FROM employees WHERE last_name = 'Abel';
--SELECT...FROM...WHERE...(SELECT)
-- ORDER BY no es necesario ya que la Subquery solo devuelve una fila
SELECT *
FROM employees 
WHERE salary > (SELECT salary FROM employees WHERE last_name = 'Abel');


-- Subconsulta de una fila y funciones en grupo (salario maximo actual)
-- SELECT...FROM...WHERE...(SELECT)
--SELECT MAX(salary) FROM employees;
SELECT * 
FROM employees 
WHERE salary = (SELECT MAX(salary) FROM employees);

--Subconsulta de multiples filas (cuantos empleados ganan más que los del department_id 30)
-- Operadores de multiples valores en Subquerys (IN, ANY, ALL, EXISTS)
--SELECT salary FROM employees WHERE department_id = 30;

--ANY (or)
-- muestra a cualquiera que cumpla las siguientes condiciones 
--SELECT * FROM employees WHERE salary > ANY (17000, 16000, 13000);
SELECT * 
FROM employees 
WHERE salary > ANY (SELECT salary FROM employees WHERE department_id = 30);


-- ALL (and)
-- muestra a todos los que sean mayores que los siguiente valores (el salario debe ser mayor que todos los valores de la subconsulta)
--SELECT * FROM employees WHERE salary > ALL (17000, 16000, 13000);
SELECT * 
FROM employees 
WHERE salary > ALL (SELECT salary FROM employees WHERE department_id = 30);

--IN 
-- se enfoca en las cosas que son iguales y no funciona con otros operadores lógicos (<>=), es como un signo igual pero para múltiples valores
--SELECT * FROM employees WHERE salary IN (17000, 16000, 13000);
SELECT * 
FROM employees 
WHERE salary  IN (SELECT salary FROM employees WHERE department_id = 30);

--EXISTS
-- Se asegura de traer minimo una fila, Se usa sin llamar una columna (salary en este caso)
-- si la subconsulta devuelve almenos una fila se cumple el EXISTS
--SELECT * FROM employees WHERE EXISTS (SELECT 'HOLA' FROM dual);
SELECT * 
FROM employees 
WHERE EXISTS (SELECT salary FROM employees WHERE department_id = 30);

-- CRUZE DE DATOS CON EXISTS
SELECT emp.first_name, emp.last_name
FROM employees emp
WHERE E XISTS (SELECT department_name FROM departments dep WHERE dep.department_id = emp.department_id);
-- NOT EXISTS
SELECT emp.first_name, emp.last_name
FROM employees emp
WHERE NOT EXISTS (SELECT department_name FROM departments dep WHERE dep.department_id = emp.department_id);


--CREACION DE TABLAS USANDO Subconsulta
CREATE TABLE EMP_DEPTO_30 AS
    SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID=30;

SELECT * FROM EMP_DEPTO_30;

CREATE TABLE EMP_DEPTO_60(
        COD_EMPLEADO NOT NULL PRIMARY KEY,
        SALARIO_ANUAL NOT NULL,
        FECHA_CONTRATO NOT NULL
)
AS SELECT EMPLOYEE_ID, SALARY*12,HIRE_DATE FROM EMPLOYEES WHERE DEPARTMENT_ID=60;


--operador UNION
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE SALARY>12000
UNION
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=90
UNION
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=100;


SELECT 'HOLA' AS QUEPASA,123 AS NUMERO FROM DUAL
UNION
SELECT 'CHAO',8910 FROM DUAL
UNION
SELECT 'HELLO',898 FROM DUAL
UNION
SELECT 'HELLO',898 FROM DUAL; --NO SE MUESTRA PORQUE ES UNA FILA REPETIDA



--OPERADOR UNION ALL
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE SALARY>12000
UNION ALL
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=90
UNION ALL
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=100;


SELECT 'HOLA' AS QUEPASA,123 AS NUMERO FROM DUAL
UNION ALL
SELECT 'CHAO',8910 FROM DUAL
UNION ALL
SELECT 'HELLO',898 FROM DUAL
UNION ALL
SELECT 'HELLO',898 FROM DUAL; --SI SE MUESRA AUNQUE ESTE REPETIDA GRACIAS AL UNION ALL



--OPERADOR INTERSECT
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE SALARY>12000
    INTERSECT
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=90;


--OPERADOR MINUS
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE SALARY>12000
    MINUS
SELECT EMPLOYEE_ID, FIRST_NAME,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID=90;


--USAR OPERADORES SET (UNION,UNION ALL,INTERSECT,MINUS) EN UNA CONSULTA
SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE SALARY>10000
MINUS
SELECT EMPLOYEE_ID FROM JOB_HISTORY
INTERSECT
SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE SALARY>=24000;


--COPLUMNAS FICTICIAS
SELECT DEPARTMENT_ID,DEPARTMENT_NAME, '15-08-2005' FROM DEPARTMENTS
        UNION ALL
        SELECT DEPARTMENT_ID, 'NO ENCONTRADO', TO_CHAR(HIRE_DATE) FROM EMPLOYEES;


SELECT DEPARTMENT_ID,DEPARTMENT_NAME, TO_DATE('15/08/2005','DD/MM/YYYY') FROM DEPARTMENTS
        UNION ALL
SELECT DEPARTMENT_ID, 'NO ENCONTRADO', HIRE_DATE FROM EMPLOYEES;

-- DML
-- SAVEPOINT
-- INSERT / UPDATE / DELETE
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (271,'Contabilidad', 205, 1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (272,'Finanzas', NULL, NULL);

SAVEPOINT dos_inserts;

DELETE FROM departments WHERE department_id = 271;

ROLLBACK TO dos_inserts; -- SAVEPOINT

INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (273,'RRHH', NULL, NULL);

-- COMMIT;
ROLLBACK; -- �LTIMO COMMIT

-- SIN DEFINIR NOMBRES PARA LOS CAMPOS
INSERT INTO departments 
VALUES (274, 'Desarrollo', NULL, NULL); 

SELECT * FROM departments;

-- INSERTAR UN REGISTRO EN LA TABLA "EMPLOYEES"
INSERT INTO employees
VALUES (207,'Lorena','Fuentes','LFUENTES','2258874',SYSDATE,'IT_PROG',22000,NULL,121,60);

DESC employees;

SELECT * FROM employees;

CREATE TABLE deptos1
    AS SELECT * FROM departments WHERE department_id = 0;

CREATE TABLE deptos2
    AS SELECT * FROM departments WHERE department_id = 0;
    
INSERT ALL
    INTO deptos1 VALUES (department_id, department_name, null, null)
    INTO deptos2 VALUES (department_id, department_name, 100, 1400)
SELECT * FROM departments;

SELECT * FROM deptos1;
SELECT * FROM deptos2;

-- ID AUTOINCREMENTABLE
CREATE TABLE  tabla_id_auto
(
    id_auto NUMBER(10) 
            GENERATED ALWAYS AS IDENTITY 
            MINVALUE 1 
            MAXVALUE 5
            INCREMENT BY 1 
            START WITH 1,
    nombre_depto VARCHAR2(30) NOT NULL,
    total_emp NUMBER(4)
);


INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('Base de Datos',4);

INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('Desarrollo',6);

INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('Calidad',3);

INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('Videojuegos',7);

INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('Sistemas',5);

--no permite insertar una sexta fila
INSERT INTO tabla_id_auto(nombre_depto,total_emp)
VALUES ('RRHH',2);

SELECT * FROM tabla_id_auto;


--UPDATE
UPDATE tabla_id_auto
        SET nombre_depto='Testing' WHERE nombre_depto='Calidad';


--DELETE
DELETE FROM tabla_id_auto
WHERE id_auto=5;


--TRUNCATE 
TRUNCATE TABLE tabla_id_auto;


--repoblar tablas con subconsutlas
INSERT INTO tabla_id_auto
        SELECT * FROM tabla_id_auto;




INSERT INTO tabla_id_auto
        SELECT DEPARTMENT_ID FROM DEPARTMENTS,
        SELECT DEPARTMENT_NAME FROM DEPARTMENTS,
        COUNT(EMP.DEPARTMENT_ID)
        WHERE EMP.DEPARTMENT_ID


UPDATE tabla_id_auto

INSERT INTO tabla_id_auto (nombre_depto, total_emp)
        SELECT dep.department_name,
        count(emp.department_id) 
FROM departments dep 
INNER JOIN employees emp 
ON emp.department_id = dep.department_id
GROUP BY dep.department_name
HAVING COUNT(EMP.EMPLOYEE_ID)>=5;

SELECT * FROM TABLA_ID_AUTO;

DROP TABLE tabla_id_auto;

ALTERR SESSION PARALLEL DISABLE


-- [ VISTAS ] (fachada, no es la fuente real de almacenamiento), las vistas pueden tener seguridad
--CREAR VISTA
CREATE VIEW view_emp_sal_10_20
    AS SELECT * FROM employee WHERE salary BETWEEN 10000 AND 20000;
-- Visualizar 
SELECT * FROM view_emp_sal_10_20;

--ELIMINAR VISTA
DROP VIEW VIEW_EMP_sal_10_20;


--REALIZAR CAMBIOS EN LA VISTA
CREATE OR REPLACE VIEW v_dept30
    AS SELECT *
    FROM employees
    WHERE department_id=30
-- WITH CHECK OPTION Garantiza que las operaciones INSERT y UPDATE realizadas a trav�s de la vista no pueden crear o actualizar filas que no ser�an seleccionadas por la propia vista
WITH CHECK OPTION; -- Protege el filtro where

-- Visualizar la vista
SELECT * FROM v_dept30;

DELETE FROM v_dept30 WHERE employee_id = 115;

-- NO se puede insertar un empleado que tenga undepto distinto al de id 30
/*INSERT INTO v_dept30
VALUES(999, 'Luis', 'Morales', 'LMORALES',  '515.124.4567', SYSDATE, 'AC_ACCOUNT', 6900, NULL, 205, 100);7
DROP VIEW v_dept30;
*/

--Actualizar o cambiar datos en una vista
UPDATE v_dept30 SET department_id = 40 WHERE employee_id = 119;

DELETE FROM v_dept30 WHERE employee_id = 119;

-- PROTEGER LA VISTA (SOLO LECTURA, no dml) [WITH READ ONLY]
CREATE OR REPLACE VIEW v_dept30
    AS SELECT *
    FROM employees
    WHERE department_id=30
WITH READ ONLY;

DELETE FROM v_dept30 WHERE employee_id = 118;
DROP VIEW v_dept30;
-- [OBJETO SECUENCIA]
-- tienen pseudocolumnas
-- CREAR SECUENCIA
CREATE SEQUENCE SEQ_GENERA_NUMEROS
START WITH 1
INCREMENT BY 2
MAXVALUE 10
NOCACHE;
-- NEXTVAL (pseudocolumna) Genera valores 
SELECT SEQ_GENERA_NUMEROS.NEXTVAL FROM dual;

-- MODIFICAR UNA SECUENCIA
ALTER SEQUENCE SEQ_GENERA_NUMEROS
MAXVALUE 20
--CYCLE; --si llega al valor maximo se reinicia la secuencia
NOCYCLE;
-- ELIMINAR SECUENCIA
DROP SEQUENCE SEQ_GENERA_NUMEROS;

CREATE SEQUENCE SEQ_GENERA_NUMEROS
START WITH 2
INCREMENT BY 2
MINVALUE 2
MAXVALUE 20
NOCACHE
CYCLE;
--CURRVAL (pseudocolumna) obtiene el valor actual 
SELECT SEQ_GENERA_NUMEROS.CURRVAL FROM dual;

/*
    INSERTAR UN DEPARTMAMENTO (departments)
    UTILIZANDO UNA SECUENCIA PARA EL VALOR DEL DEPARTMENT_ID
    NOMBRE DE LA SEQ: seq_departments_id
*/

SELECT * FROM departments;
SELECT seq_departments_id.NEXTVAL FROM dual;
CREATE SEQUENCE seq_departments_id
START WITH 280
INCREMENT BY 10
MAXVALUE 300;
--drop sequence seq_departments_id
INSERT INTO departments (seq_departments_id.CURRVAL, 'Sistemas', NULL, NULL);

---------------------------
-- Sinonimos [SYNONYM] (nombres secundarios, en este caso locales aunque pueden ser publicos)
SELECT * FROM departments;

-- SYNONYM [Local]
CREATE OR REPLACE SYNONYM deptos
FOR departments;

SELECT * FROM deptos;

-- SYNONYM [Public]
CREATE PUBLIC SYNONYM trabajadores 
FOR employees;

SELECT * FROM trabajadores;
-- GRANT (otorga privilegios), en este caso permite al usuario externo (publico) que solo use select más no insert o replace
GRANT SELECT ON trabajadores TO PUBLIC;

-- Eliminar SYNONYM
DROP SYNONYM deptos;

--CREAR USUARIOS

CREATE USER "JUANITO" IDENTIFIED BY "1234567Abcdef?"
DEFAULT TABLESPACE "DATA"
TEMPORARY TABLESPACE "TEMP";
ALTER USER "JUANITO" QUOTA 10M ON "DATA";


--otorgar privilegios de sistema
GRANT CREATE SESSION TO RAUL,MARCELA,JUANITO;

GRANT CREATE TABLE TO JUANITO;

--OTORTGAR PRIVILEGIO DE OBJETO
GRANT SELECT ON MASCOTA TO MARCELA;
GRANT INSERT ON MASCOTA TO MARCELA;
GRANT DELETE ON MASCOTA TO MARCELA;

--otorgar privilegios heredados
GRANT SELECT ON MASCOTA TO MARCELA WITH GRANT OPTION;

--CREAR ROLES
CREATE ROLE ROL_PRUEBAS;

--ASIGNAR PRIVILEGIOS AL ROL_PRUEBAS
--SI LOS CAMBIOS NO HACEN EFECTO EN LA MISMA SESION, DESCONECTARSE Y CONECTARSE NUEVAMENTE
GRANT CREATE SESSION,CREATE TABLE TO ROL_PRUEBAS;
GRANT ROL_PRUEBAS TO MARCELA;


--CONSULTAR ROLES ASIGNADOS 
SELECT * FROM USER_ROLE_PRIVS;


--CONSULTAR PRIVILEGIOS DE SISTEMA
SELECT * FROM USER_SYS_PRIVS;


--QUITAR PRIVILEGIOS DE SISTEMA
REVOKE CREATE SESSION,CREATE TABLE FROM MARCELA;


--QUITAR PRIVILEGIOS DE OBJETO
REVOKE SELECT,INSERT ON MASCOTA FROM MARCELA;