-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2015 a las 20:48:36
-- Versión del servidor: 10.0.17-MariaDB
-- Versión de PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `humancapital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidatos`
--

CREATE TABLE `candidatos` (
  `candidatoid` int(4) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `tituloprofesional` varchar(100) NOT NULL,
  `universidad` varchar(100) NOT NULL,
  `certificados` varchar(200) NOT NULL,
  `trabajosanteriores` varchar(300) NOT NULL,
  `expectativaseconomicas` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `candidatos`
--

INSERT INTO `candidatos` (`candidatoid`, `nombre`, `domicilio`, `telefono`, `email`, `tituloprofesional`, `universidad`, `certificados`, `trabajosanteriores`, `expectativaseconomicas`) VALUES
(3, 'Antonio Vargas', 'Pedro Calderon, 1, Lomas del Hipico', '83070183', 'tony@hotmail.com', 'Ingenieria en Tecnologias Computacionales', 'ITESM', 'IEEE', 'MICROSOFT', 20000),
(4, 'Brian T. Penton', '3494 Stadium Drive Charlestown, MA 02129 ', '508-319-2014', 'BrianTPenton@gmail.com', 'Computer Science', 'Harvard', 'Web Security, IEEE, Artificial Inteligence', 'Microsoft, Oracle', 35000),
(5, 'Mia R. Priebe', '2964 Watson Lane Hickory, NC 28601', '828-901-9698', 'MiaRPriebe@gustr.com', 'STM Auto Parts: Engineering', 'Massachussets Institute of Technology', 'IEEE, Automobile Design II', 'NISSAN, BMW', 25000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `empleadoid` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `tituloprofesional` varchar(100) NOT NULL,
  `universidad` varchar(100) NOT NULL,
  `certificados` varchar(100) NOT NULL,
  `trabajosanteriores` varchar(100) NOT NULL,
  `expectativaseconomicas` int(8) NOT NULL,
  `puesto` varchar(100) NOT NULL,
  `salario` int(8) NOT NULL,
  `diasvacaciones` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`empleadoid`, `nombre`, `domicilio`, `telefono`, `email`, `tituloprofesional`, `universidad`, `certificados`, `trabajosanteriores`, `expectativaseconomicas`, `puesto`, `salario`, `diasvacaciones`) VALUES
(1, '123', '321', '123', '321@mail.com', '321', 'dsadsa', 'dasasd', 'asdasdasddas', 2132, 'dsasdsa', 1231, 123123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrevistas`
--

CREATE TABLE `entrevistas` (
  `fecha` date NOT NULL,
  `entrevistador` int(4) NOT NULL,
  `entrevistado` int(4) NOT NULL,
  `plataforma` varchar(100) NOT NULL,
  `feedback` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  ADD PRIMARY KEY (`candidatoid`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`empleadoid`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  MODIFY `candidatoid` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `empleadoid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
