-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-12-2015 a las 05:07:34
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
(7, 'Thomas Craig', 'Linden Avenue, Orange Park - 7522', '81341652', 'thomas_craig@hotmail.com', 'Dr.', 'UNI', 'MTA Developer, ACE, Data Warehousing Specialist, CMMI, Apple Certified Trainer, CCNT', 'Lala, FEMSA, Profesor', 5800),
(8, 'David Patterson', 'Penn Street Hoffman Estates - 1679', '83639422', 'david_patterson@gmail.com', 'Ing.', 'ITESM', 'LPIC, CCNP, CCNT', 'Home Depot, Call Center', 3600),
(9, 'Kathy Mitchell', 'Orchard Lane, Newington - 5062', '81345126', 'kathy_mitchell@yahoo.com', 'Ing.', 'UANL', 'Cisco Certified Instructor, CMMI, SEI-Certified PSP Developer', 'Secretaria, Gamesa, Google', 8400),
(10, 'John Douglas', 'Rosewood Drive, Gloucester - 2166', '81343959', 'john_douglas@gmail.com', 'Lic.', 'ITESM', 'DBA, SEI-Certified PSP Developer, Cisco Certified Instructor, LPIC, Data Warehousing Specialist', 'Facebook, Google', 6500),
(11, 'Brenda Garner', 'Franlkin Court, Oak Park - 2077', '83631029', 'brenda_garner@hotmail.com', 'Ing.', 'UR', 'Cisco Certified Instructor, ACE, CMMI, DBA', 'Profesora', 3200),
(12, 'Nichole Brock', 'Depot Street, Astoria - 7188', '81436048', 'nichole_brock@gmail.com', 'Ing.', 'UANL', 'CMMI, CCNT, Cisco Certified Instructor', 'FEMSA, Secretaria', 4000);

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
(2, 'Glenn Wolfe', 'Valley Drive, Muskego - 4379', '83639049', 'glenn_wolfe@gmail.com', 'Ing.', 'UANL', 'CCNT, LPIC', 'Ninguno', 6300, 'Empleado', 5300, 20),
(3, 'Cecilia Simmons', 'Maple Avenue, Vicksburg - 3577', '81347832', 'cecilia_simmons@gmail.com', 'Ing.', 'UNI', 'MTA Developer, ACE', 'Secretaria, Lala, Call Center', 4500, 'Empleado', 4700, 20),
(4, 'Martin Lee', 'Rose Street, Fort Wayne - 9019', '81345065', 'martin_lee@gmail.com', 'Dr.', 'ITESM', 'CMMI, DBA, Apple Certified Trainer', 'Profesor', 10000, 'Director', 7500, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrevistas`
--

CREATE TABLE `entrevistas` (
  `fecha` date NOT NULL,
  `entrevistador` int(4) NOT NULL,
  `entrevistado` int(4) NOT NULL,
  `plataforma` varchar(500) DEFAULT NULL,
  `feedback` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entrevistas`
--

INSERT INTO `entrevistas` (`fecha`, `entrevistador`, `entrevistado`, `plataforma`, `feedback`) VALUES
('2015-01-22', 4, 10, 'Telefono', 'Fue una entrevista perfecta y muestra mucho potencial. El candidato tiene experiencia laboral en Facebook y en Google y con sus diversas certificaciones, pienso que seria un gran recurso.'),
('2015-07-10', 3, 8, 'VoIP', 'Muy poca experiencia laboral, pero es excelente hablando. Contesto todas las preguntas sin problema alguno y se porto muy amable. No esta pidiendo mucho dinero y creo que seria una buena secretaria.'),
('2015-06-19', 2, 12, 'VoIP', 'Poca experiencia laboral, pero con entrenamiento seria una excelente empleada. Tiene una certificaciÃ³n de cisco que le permite ser instructora, pocos tienen esta certificaciÃ³n.'),
('2014-12-17', 3, 9, 'Telefono', 'Se presento bastante nerviosa a pesar de que la entrevista fue por telÃ©fono, creo que sus certificaciones son falsas ya que no sabe mucho de ellas. No recomendada.'),
('2015-03-27', 2, 11, 'Persona', 'Se presento formal y siempre seria. A pesar de solo tener experiencia como profesora, muestra bastante interÃ©s en diversas Ã¡reas de conocimiento.'),
('2015-12-01', 1, 5, 'Videollamada (MSN)', 'Tiene buena experiencia en hablar'),
('2015-03-16', 2, 7, 'Persona', 'Vino poco preparado, usaba ropa informal y parecÃ­a bastante nervioso. Tiene bastantes certificados, el de Data Warehousing me llamo la atenciÃ³n. Creo que con un poco de entrenamiento puede ser un excelente empleado a pesar de la cantidad de dinero que pide.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`username`, `password`) VALUES
('admin', 'admin'),
('tony', 'tony');

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
-- Indices de la tabla `entrevistas`
--
ALTER TABLE `entrevistas`
  ADD PRIMARY KEY (`feedback`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  MODIFY `candidatoid` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `empleadoid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
