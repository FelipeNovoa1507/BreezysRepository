DECLARE
    v_fecha_nacimiento DATE := TO_DATE('14-MAR-2000');
    v_fecha_actual DATE := SYSDATE;
    v_anio_nacimiento NUMBER(4);
    v_anio_actual NUMBER(4);
    v_edad NUMBER(3);

BEGIN
    v_anio_nacimiento := '2000';
    v_anio_actual :='2024';
    v_edad := v_anio_actual-v_anio_nacimiento;
    DBMS_OUTPUT.PUT_LINE('La edad aproximada es '||v_edad||' años');

END; 