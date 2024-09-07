SET SERVEROUTPUT ON;

DECLARE
    TYPE VARRAY_CORREOS
    IS VARRAY(1000) OF VARCHAR2(30);
    V_ARR_CORREOS VARRAY_CORREOS;

BEGIN
    V_ARR_CORREOS := VARRAY_CORREOS();

    FOR I IN (SELECT EMAIL FROM EMPLOYEES)
    LOOP
        V_ARR_CORREOS.EXTEND;
        V_ARR_CORREOS(V_ARR_CORREOS.COUNT) := I.EMAIL;
        DBMS_OUTPUT.PUT_LINE('Correo: ' || I.EMAIL);
    END LOOP;

END;