DROP TABLE IF EXISTS Vehiculo;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS Comuna;
DROP TABLE IF EXISTS Especialidad;
DROP TABLE IF EXISTS Cargo;
DROP TABLE IF EXISTS Marca;



CREATE TABLE Marca
(
    idMarca             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Cargo
(
    idCargo             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Especialidad
(
    idEspecialidad      int             primary key auto_increment,
    nombre              varchar(50)     not null,
    habilitado  boolean not null,
    UNIQUE(nombre)
);

CREATE TABLE Comuna
(
    idComuna            int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Persona
(
    idPersona           int             primary key auto_increment,
    idCargo             int             null,
    idEspecialidad      int             null,
    idComuna            int             not null,
    rut                 int             not null,
    digito              varchar(1)      not null,
    nombre              varchar(50)     not null,
    apellido            varchar(50)     not null,
    sueldo              int             null,
    esCliente boolean not null,
    habilitado  boolean not null,
    UNIQUE(rut),
    FOREIGN KEY(idCargo)                    REFERENCES Cargo(idCargo),
    FOREIGN KEY(idEspecialidad)                    REFERENCES Especialidad(idEspecialidad),
    FOREIGN KEY(idComuna)                    REFERENCES Comuna(idComuna)
);

CREATE TABLE Vehiculo
(
    idVehiculo          int             primary key auto_increment,
    idPersona           int             not null,
    idMarca             int             not null,
    patente             varchar(6)      not null,
    modelo              varchar(100)    not null,
    litrosMaletero      int             null,
    cantidadPuerta      int             null,
    largoManillar       int             null,
    estilo              varchar(100)    null,
    UNIQUE(patente),
    FOREIGN KEY(idPersona)                    REFERENCES Persona(idPersona),
    FOREIGN KEY(idMarca)                    REFERENCES Marca(idMarca)
);


-- INSERCIÓN DE FILAS EN LAS TABLAS
INSERT INTO Marca (nombre) VALUES
('Ferrai'),
('Porsche'),
('Lamborghini'),
('Bugatti'),
('Tesla');

INSERT INTO Cargo (nombre) VALUES
('Jefe'),
('Mecanico'),
('Recursos Humanos'),
('Limpieza'),
('Recepcionista');


INSERT INTO Especialidad (nombre,habilitado) VALUES
('Especialista en Diagnóstico',true),
('Especialista en Frenos y Suspensión',true),
('Técnico de Aire Acondicionado',true),
('Gerente de Ventas y Servicio al Cliente',true),
('Especialista en Neumáticos',true),
('Sin especialidad',true);

UPDATE Especialidad SET idEspecialidad=0 WHERE idEspecialidad=6;

INSERT INTO Comuna (idComuna,nombre) VALUES
(1,'Santiago'),
(2,'Providencia'),
(3,'Las Condes'),
(4,'Maipú'),
(5,'Cerrillos');

INSERT INTO Persona (idCargo, idEspecialidad, idComuna, rut, digito, nombre, apellido, sueldo, esCliente, habilitado) VALUES
(1, 4, 3, 21732860, '8', 'Juan', 'Vasquez', 2500000, 0, 1),
(2, 3, 5, 12345678, 'K', 'María', 'González', 3000000, 0, 1),
(2, 2, 1, 98765432, '4', 'Carlos', 'López', 2000000, 0, 1),
(3, 2, 2, 21080811, '6', 'Felipe','Novoa',2500000,0,1),
(2, 3, 2, 21732861, 'K', 'Rivaul', 'Tavara', 2000000,0,1);

INSERT INTO Persona (idComuna, rut, digito, nombre, apellido, esCliente, habilitado)
VALUES
(4, 54321098, '9', 'Laura', 'Martínez',1, 1),
(2, 87654321, '2', 'Pedro', 'Fernández',1, 1),
(1, 85732454, 'K', 'Gabriel', 'Luna',1, 1),
(3, 81532654, '4', 'Pablo', 'Hernández',1, 1),
(2, 45643643, '7', 'Carlos', 'Valdovinos',1, 1);

INSERT INTO Vehiculo (idPersona, idMarca, patente, modelo, litrosMaletero, cantidadPuerta)
VALUES
(1, 1, 'ABC123', '458 Italia', 500, 2),
(2, 2, 'XYZ987', 'Cayenne', 400, 2),
(1, 4, 'GHI789', 'Chiron', 550, 4),
(3, 5, 'JKL012', 'Model X', 350, 2);

INSERT INTO VEHICULO(IDPERSONA,IDMARCA,PATENTE,MODELO,LARGOMANILLAR,ESTILO) VALUES
(2, 4, 'DEF45', 'Chopper', 220, 'Deportivo'),
(4, 4, 'FZJD3', 'C90', 200, 'Deportivo');


SELECT * FROM PERSONA WHERE RUT=21080811 AND DIGITO=6;