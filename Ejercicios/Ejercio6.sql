SELECT
    ganancias AS "Ganancias",
    cantVentas AS "Cantidad de ventas",
    COUNT(*) AS "Cantidad de bicicletas en venta"
FROM bicicleteria 
INNER JOIN bicicleta 
ON idBicicleteria = Bicicleteria_idBicicleteria 
WHERE idBicicleteria = 2;