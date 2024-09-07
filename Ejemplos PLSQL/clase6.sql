DECLARE 
    V_NOMBRE EMPLOYEES.FIRST_NAME%TYPE;
    V_ID_EMP EMPLOYEES.EMPLOYEE_ID%TYPE:=120;
BEGIN
    SELECT EMPLOYEE_ID,FIRST_NAME
    INTO V_ID_EMP, V_NOMBRE
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID=V_ID_EMP;

    DECLARE
        V_APELLIDO EMPLOYEES.LAST_NAME%TYPE;
    BEGIN
        SELECT LAST_NAME
        INTO V_APELLIDO
        FROM EMPLOYEES
        WHERE EMPLOYEE_ID=V_ID_EMP;
        DBMS_OUTPUT.PUT_LINE(V_NOMBRE||' '||V_APELLIDO);
    END;

END;



CREATE TABLE EMPLEADOS AS SELECT * FROM EMPLOYEES;

DECLARE
    V_TOTAL_FILAS NUMBER(10);

BEGIN
    DELETE FROM EMPLEADOS WHERE SALARY BETWEEN 1000 AND 6000;




DECLARE 
    V_TOTAL_FILAS NUMBER(10);

BEGIN
    DELETE FROM EMPLEADOS WHERE EMPLOYEE_ID=888;

    IF SQL%FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('SE HAN ELIMINADO DATOS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('NO SE HAN ELIMINADO DATOS');
    END IF;

END;


<<BLOQUE_EXTERNO>>
DECLARE 
    V_NOMBRE VARCHAR2(30):='JUANITO';

BEGIN
    <<BLOQUE_INTERNO>>
    DECLARE 
        V_NOMBRE VARCHAR2(30):='JUANITA';
    BEGIN
        DBMS_OUTPUT.PUT_LINE(BLOQUE_INTERNO.V_NOMBRE);
        DBMS_OUTPUT.PUT_LINE(BLOQUE_EXTERNO.V_NOMBRE);
    END;
END;





VAR B_ID_DEP NUMBER(3)

DECLARE
    V_ID_DEP EMPLOYEES.DEPARTMENT_ID%TYPE;
BEGIN
    V_ID_DEP := :B_ID_DEP;

    <<BLOQUE_INTERNO>>
    DECLARE
        V_NOMBRE EMPLOYEES.FIRST_NAME%TYPE;
        V_APELLIDO EMPLOYEES.LAST_NAME%TYPE;
        V_ID_DEP_EMP EMPLOYEES.DEPARTMENT_ID%TYPE;
    BEGIN
        FOR I IN 100..206 LOOP
            SELECT DEPARTMENT_ID INTO V_ID_DEP_EMP FROM EMPLOYEES
            WHERE EMPLOYEE_ID = I;
            IF V_ID_DEP = V_ID_DEP_EMP THEN
                SELECT FIRST_NAME, LAST_NAME
                INTO V_NOMBRE, V_APELLIDO
                FROM EMPLOYEES 
                WHERE EMPLOYEE_ID=I;
                DBMS_OUTPUT.PUT_LINE(V_NOMBRE||' '||V_APELLIDO);
            ELSE
                DBMS_OUTPUT.PUT_LINE('');
            END IF;
        END LOOP;    
    END;
END;

