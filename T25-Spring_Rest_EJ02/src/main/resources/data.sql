DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS departamentos;


CREATE TABLE `departamentos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `presupuesto` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

CREATE TABLE `empleados` (
  `DNI` varchar(250) NOT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `apellidos` varchar(250) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`DNI`),
  CONSTRAINT `departamentos_fk` FOREIGN KEY (`dep_id`) REFERENCES `departamentos` (`codigo`)
);

insert into departamentos (nombre, presupuesto)values('comercio', 30000);
insert into departamentos (nombre, presupuesto)values('rrhh', 50000);

insert into empleados values ('56678767H','Juan','Jiménez',1);
insert into empleados values ('98877865G','Maria','Sánchez',2);