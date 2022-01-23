-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-01-2022 a las 19:00:32
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `olimpus`
--
CREATE DATABASE IF NOT EXISTS `olimpus` DEFAULT CHARACTER SET utf16 COLLATE utf16_general_ci;
USE `olimpus`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `nif` char(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(60) NOT NULL,
  `email` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`nif`, `nombre`, `apellidos`, `email`) VALUES
('16490255S', 'Fernando', 'Alvarez Perez', 'fernanditomalamanera@gmail.com'),
('17557420W', 'Rosa', 'Meltroso Gutierrez', 'rositarositatuculotepica@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_cuenta`
--

CREATE TABLE `cliente_cuenta` (
  `nif_cliente` char(9) NOT NULL,
  `numero_cuenta` char(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Volcado de datos para la tabla `cliente_cuenta`
--

INSERT INTO `cliente_cuenta` (`nif_cliente`, `numero_cuenta`) VALUES
('16490255S', 'ES091234567890123456789'),
('17557420W', 'ES092234567890123456789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `numero` char(23) NOT NULL,
  `saldo` double NOT NULL,
  `fecha_creacion` datetime NOT NULL,
  `fecha_ultima_modificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`numero`, `saldo`, `fecha_creacion`, `fecha_ultima_modificacion`) VALUES
('ES091234567890123456789', 3000, '2019-06-24 00:00:00', '2022-01-23 17:59:17'),
('ES092234567890123456789', 2100, '2012-04-02 18:47:53', '2022-01-23 17:48:21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `limite`
--

CREATE TABLE `limite` (
  `tipo` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `limite_tarjeta`
--

CREATE TABLE `limite_tarjeta` (
  `valor_limite` double NOT NULL,
  `numero_tarjeta` char(16) NOT NULL,
  `tipo_limite` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operacion`
--

CREATE TABLE `operacion` (
  `numero` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `cantidad` double NOT NULL,
  `time_stamp` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `validada` tinyint(1) DEFAULT NULL,
  `fecha_validacion` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `numero_tarjeta` char(16) NOT NULL,
  `numero_cuenta` char(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedades`
--

CREATE TABLE `propiedades` (
  `clave` varchar(500) NOT NULL,
  `valor` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE `tarjeta` (
  `numero` char(16) NOT NULL,
  `cvs` char(3) NOT NULL,
  `pin` int(11) NOT NULL,
  `fecha_caducidad` date NOT NULL,
  `intentos_fallidos` int(11) NOT NULL,
  `bloqueada` tinyint(1) NOT NULL,
  `nif_cliente` char(16) NOT NULL,
  `numero_cuenta` char(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Volcado de datos para la tabla `tarjeta`
--

INSERT INTO `tarjeta` (`numero`, `cvs`, `pin`, `fecha_caducidad`, `intentos_fallidos`, `bloqueada`, `nif_cliente`, `numero_cuenta`) VALUES
('4131820725283027', '975', 1234, '2024-01-09', 3, 0, '17557420W', 'ES092234567890123456789'),
('4223750778806383', '275', 123, '2024-01-17', 3, 0, '16490255S', 'ES091234567890123456789');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`nif`);

--
-- Indices de la tabla `cliente_cuenta`
--
ALTER TABLE `cliente_cuenta`
  ADD KEY `nif_cliente` (`nif_cliente`),
  ADD KEY `numero_cuenta` (`numero_cuenta`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`numero`);

--
-- Indices de la tabla `limite`
--
ALTER TABLE `limite`
  ADD PRIMARY KEY (`tipo`);

--
-- Indices de la tabla `limite_tarjeta`
--
ALTER TABLE `limite_tarjeta`
  ADD KEY `numero_tarjeta` (`numero_tarjeta`),
  ADD KEY `tipo_limite` (`tipo_limite`);

--
-- Indices de la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `numero_tarjeta` (`numero_tarjeta`),
  ADD KEY `numero_cuenta` (`numero_cuenta`);

--
-- Indices de la tabla `propiedades`
--
ALTER TABLE `propiedades`
  ADD PRIMARY KEY (`clave`);

--
-- Indices de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `nif_cliente` (`nif_cliente`),
  ADD KEY `numero_cuenta` (`numero_cuenta`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente_cuenta`
--
ALTER TABLE `cliente_cuenta`
  ADD CONSTRAINT `cliente_cuenta_ibfk_1` FOREIGN KEY (`nif_cliente`) REFERENCES `cliente` (`nif`),
  ADD CONSTRAINT `cliente_cuenta_ibfk_2` FOREIGN KEY (`numero_cuenta`) REFERENCES `cuenta` (`numero`);

--
-- Filtros para la tabla `limite_tarjeta`
--
ALTER TABLE `limite_tarjeta`
  ADD CONSTRAINT `limite_tarjeta_ibfk_1` FOREIGN KEY (`numero_tarjeta`) REFERENCES `tarjeta` (`numero`),
  ADD CONSTRAINT `limite_tarjeta_ibfk_2` FOREIGN KEY (`tipo_limite`) REFERENCES `limite` (`tipo`);

--
-- Filtros para la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD CONSTRAINT `operacion_ibfk_1` FOREIGN KEY (`numero_tarjeta`) REFERENCES `tarjeta` (`numero`),
  ADD CONSTRAINT `operacion_ibfk_2` FOREIGN KEY (`numero_cuenta`) REFERENCES `cuenta` (`numero`);

--
-- Filtros para la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD CONSTRAINT `tarjeta_ibfk_1` FOREIGN KEY (`nif_cliente`) REFERENCES `cliente` (`nif`),
  ADD CONSTRAINT `tarjeta_ibfk_2` FOREIGN KEY (`numero_cuenta`) REFERENCES `cuenta` (`numero`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
