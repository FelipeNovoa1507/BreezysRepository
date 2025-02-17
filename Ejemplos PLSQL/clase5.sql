DECLARE  
    V_CONTADOR NUMBER(5):=100;
    V_NOMBRE EMPLOYEES.FIRST_NAME%TYPE;
    V_APELLIDO EMPLOYEES.LAST_NAME%TYPE;
BEGIN
    WHILE V_CONTADOR <=206 LOOP
        SELECT FIRST_NAME, LAST_NAME INTO V_NOMBRE, V_APELLIDO
        FROM EMPLOYEES WHERE EMPLOYEE_ID=V_CONTADOR;
        V_CONTADOR:=V_CONTADOR+1;
        DBMS_OUTPUT.PUT_LINE(V_NOMBRE||' '||V_APELLIDO);
    END LOOP;
END;

DECLARE
    V_CONTADOR NUMBER(5):=100;
    V_ID EMPLOYEES.EMPLOYEE_ID%TYPE;
    V_NOMBRE EMPLOYEES.FIRST_NAME%TYPE;
    V_APELLIDO EMPLOYEES.LAST_NAME%TYPE;
    V_ID_MIN NUMBER(3);
    V_ID_MAX NUMBER(3);
BEGIN
    SELECT MIN(EMPLOYEE_ID), MAX(EMPLOYEE_ID) INTO V_ID_MIN, V_ID_MAX
    FROM EMPLOYEES;

    FOR I IN V_ID_MIN..V_ID_MAX LOOP
        SELECT FIRST_NAME, LAST_NAME, EMPLOYEE_ID INTO V_NOMBRE, V_APELLIDO, V_ID
        FROM EMPLOYEES WHERE EMPLOYEE_ID=V_CONTADOR;
        V_CONTADOR:=V_CONTADOR+1;
        DBMS_OUTPUT.PUT_LINE(V_ID||' '||V_NOMBRE||' '||V_APELLIDO);
    END LOOP;
END;


BEGIN
    FOR I IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
        FOR J IN 6..10 LOOP
            DBMS_OUTPUT.PUT_LINE(J);
        END LOOP;
    END LOOP;
END;