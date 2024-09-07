SET SERVEROUTPUT ON;
DECLARE
    valor_moneda_espana NUMBER := &valor_moneda_espana;
    valor_moneda_canada NUMBER := &valor_moneda_canada;
    valor_moneda_inglaterra NUMBER := &valor_moneda_inglaterra;

    TYPE valores_monedas_t IS TABLE OF NUMBER INDEX BY PLS_INTEGER;
    valores_monedas valores_monedas_t;

    fecha_ingresada DATE := TO_DATE('2024-04-30', 'YYYY-MM-DD');
    
    error_code VARCHAR2(20);
    error_message VARCHAR2(300);
BEGIN
        valores_monedas(1) := valor_moneda_espana;
        valores_monedas(2) := valor_moneda_canada;
        valores_monedas(3) := valor_moneda_inglaterra;

        FOR cur_ventas IN (
            SELECT v.VendedorID, v.Nombre || ' ' || v.ApellidoPaterno || ' ' || v.ApellidoMaterno AS nombre_completo, v.Salario AS salario_actual, SUM(ve.TOTALVENTA) AS total_ventas
            FROM Vendedores v
            JOIN ventas ve ON v.VendedorID = ve.vendedorid
            WHERE TRUNC(ve.fechaventa) = fecha_ingresada
            GROUP BY v.VendedorID, v.Nombre, v.ApellidoPaterno, v.ApellidoMaterno, v.Salario
        ) LOOP
            IF cur_ventas.total_ventas >= 200000 AND cur_ventas.total_ventas < 400000 THEN
                DBMS_OUTPUT.PUT_LINE('El vendedor puede viajar a España');
            ELSIF cur_ventas.total_ventas >= 400000 AND cur_ventas.total_ventas < 700000 THEN
                DBMS_OUTPUT.PUT_LINE('El vendedor puede viajar a Canadá');
            ELSIF cur_ventas.total_ventas >= 700000 THEN
                DBMS_OUTPUT.PUT_LINE('El vendedor puede viajar a Inglaterra');
            END IF;

            DBMS_OUTPUT.PUT_LINE(' ');
            DBMS_OUTPUT.PUT_LINE('ID Vendedor: ' || cur_ventas.VendedorID);
            DBMS_OUTPUT.PUT_LINE('Nombre Completo: ' || cur_ventas.nombre_completo);
            DBMS_OUTPUT.PUT_LINE('Monto Vendido: $' || cur_ventas.total_ventas);
            DBMS_OUTPUT.PUT_LINE('Salario Actual: $' || cur_ventas.salario_actual);
            DBMS_OUTPUT.PUT_LINE('Salario España: ' || ROUND(cur_ventas.total_ventas / valores_monedas(1)) || ' Euros');
            DBMS_OUTPUT.PUT_LINE('Salario Canadá: ' || ROUND(cur_ventas.total_ventas / valores_monedas(2)) || ' Dólares');
            DBMS_OUTPUT.PUT_LINE('Salario Inglaterra: ' || ROUND(cur_ventas.total_ventas / valores_monedas(3)) || ' Libras');
        END LOOP;
    EXCEPTION
        WHEN OTHERS THEN
            error_code := TO_CHAR(SQLCODE);
            error_message := SUBSTR(SQLERRM, 1, 300);
            INSERT INTO Errores (fecha_hora, codigo_error, mensaje_error)
            VALUES (SYSTIMESTAMP, error_code, error_message);
            COMMIT;
END;