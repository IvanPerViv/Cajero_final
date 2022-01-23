DROP DATABASE IF EXISTS olimpus;
CREATE DATABASE olimpus CHARACTER SET utf16;
USE olimpus;

CREATE TABLE cliente (
	nif CHAR(9) PRIMARY KEY NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellidos VARCHAR(60) NOT NULL,
    email VARCHAR(150) NOT NULL
);

CREATE TABLE cuenta (
	numero CHAR(23) NOT NULL PRIMARY KEY,
    saldo DOUBLE NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    fecha_ultima_modificacion TIMESTAMP
);

CREATE TABLE tarjeta (
	numero CHAR(16) NOT NULL PRIMARY KEY,
    cvs CHAR(3) NOT NULL,
    pin INT NOT NULL,
    fecha_caducidad DATE NOT NULL,
    intentos_fallidos INT NOT NULL,
    bloqueada BOOLEAN NOT NULL,
    nif_cliente CHAR(16) NOT NULL,
    numero_cuenta CHAR(23) NOT NULL,
    FOREIGN KEY (nif_cliente) REFERENCES cliente(nif),
    FOREIGN KEY (numero_cuenta) REFERENCES cuenta(numero)
);

CREATE TABLE operacion (
	numero INT PRIMARY KEY NOT NULL,
    tipo VARCHAR(20) NOT NULL,
    cantidad DOUBLE NOT NULL,
    time_stamp TIMESTAMP,
    validada BOOLEAN,
    fecha_validacion TIMESTAMP,
    numero_tarjeta CHAR(16) NOT NULL,
    numero_cuenta CHAR(23) NOT NULL,
    FOREIGN KEY (numero_tarjeta) REFERENCES tarjeta(numero),
    FOREIGN KEY (numero_cuenta) REFERENCES cuenta(numero)
);

CREATE TABLE limite (
	tipo VARCHAR(15) PRIMARY KEY NOT NULL
);

CREATE TABLE limite_tarjeta(
	valor_limite DOUBLE NOT NULL,
    numero_tarjeta CHAR(16) NOT NULL,
    tipo_limite VARCHAR(20) NOT NULL,
    FOREIGN KEY (numero_tarjeta) REFERENCES tarjeta(numero),
    FOREIGN KEY (tipo_limite) REFERENCES limite(tipo)
);

CREATE TABLE cliente_cuenta(
	nif_cliente CHAR(9) NOT NULL,
    numero_cuenta CHAR(23) NOT NULL,
    FOREIGN KEY (nif_cliente) REFERENCES cliente(nif),
    FOREIGN KEY (numero_cuenta) REFERENCES cuenta(numero)
);

CREATE TABLE propiedades(
	clave VARCHAR (500) PRIMARY KEY NOT NULL,
    valor VARCHAR (500) NOT NULL
);