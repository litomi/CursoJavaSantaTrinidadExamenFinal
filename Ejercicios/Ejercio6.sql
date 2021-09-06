SELECT
    bria.ganancias AS "Ganancias",
    bria.cantVentas AS "Cantidad de ventas",
    COUNT(*) AS "Cantidad de bicicletas en venta"
FROM bicicleteria AS bria 
INNER JOIN bicicleta AS bta
ON bria.idBicicleteria = bta.Bicicleteria_idBicicleteria
WHERE bria.idBicicleteria = 2;


SELECT
    ganancias AS "Ganancias",
    cantVentas AS "Cantidad de ventas",
    COUNT(*) AS "Cantidad de bicicletas en venta"
FROM bicicleteria 
INNER JOIN bicicleta 
ON idBicicleteria = Bicicleteria_idBicicleteria 
WHERE idBicicleteria = 2;