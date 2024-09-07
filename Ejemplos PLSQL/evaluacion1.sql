

SET SERVEROUTPUT ON
VAR b_id_empleado NUMBER
VAR b_anno NUMBER(4,0)
VAR b_mes NUMBER(2,0)

DECLARE 
    v_anno  NUMBER(4,0) := :b_anno;
    v_mes NUMBER(2,0) := :b_mes; 
    v_id_emp NUMBER := :b_id_empleado;
    v_total_ventas NUMBER := 0;
    v_sueldo empleado.sueldo%type;
    v_comision NUMBER := 0;
BEGIN
    SELECT sueldo INTO v_sueldo FROM empleado WHERE id_empleado = v_id_emp;

    FOR r IN (SELECT id_boleta FROM boleta WHERE id_empleado = v_id_emp AND EXTRACT(YEAR FROM fecha_boleta) = v_anno AND EXTRACT(MONTH FROM fecha_boleta) = v_mes)
    LOOP
        v_total_ventas := v_total_ventas + 1;
    END LOOP;

    IF v_total_ventas >= 2 THEN
        v_comision := v_sueldo * (v_total_ventas * 0.01);
        V_COMISION := V_SUELDO + V_COMISION;
    END IF;

    INSERT INTO comision_venta_empleado (anno, mes, id_empleado, total_ventas, monto_comision)
    VALUES (v_anno, v_mes, v_id_emp, v_total_ventas, v_comision);


    DBMS_OUTPUT.PUT_LINE('ANNO: ' || V_ANNO);
    DBMS_OUTPUT.PUT_LINE('MES: ' || V_MES);
    DBMS_OUTPUT.PUT_LINE('ID_EMPLEADO: ' || V_ID_EMP);
    DBMS_OUTPUT.PUT_LINE('TOTAL_VENTAS: ' || V_TOTAL_VENTAS);
    DBMS_OUTPUT.PUT_LINE('MONTO_COMISION: ' || V_COMISION);


END;