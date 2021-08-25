DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;


CREATE TABLE almacenes(
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(250) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

CREATE TABLE cajas(
  `numReferencia` char(5) NOT NULL,
  `contenido` varchar(250) DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `alm_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`numReferencia`),
  CONSTRAINT `almacen_fk` FOREIGN KEY (`alm_id`) REFERENCES `almacenes` (`codigo`)
);
