SET SERVEROUTPUT ON;

DECLARE

    TYPE TIPO_TABLA IS TABLE OF EMPLOYEES.EMAIL%TYPE INDEX BY PLS_INTEGER;
    V_TABLA_EMAILS TIPO_TABLA;

BEGIN

    SELECT EMAIL INTO V_TABLA_EMAILS(1)
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 100;

    SELECT EMAIL INTO V_TABLA_EMAILS(2)
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 101;

    DBMS_OUTPUT.PUT_LINE('Email: ' || V_TABLA_EMAILS(1));
    DBMS_OUTPUT.PUT_LINE('Email: ' || V_TABLA_EMAILS(2));
END;