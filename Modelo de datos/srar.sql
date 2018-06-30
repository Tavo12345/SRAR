--
-- Base de datos: `srar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acta`
--

CREATE TABLE `acta` (
  `codigoActa` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `codigoProyecto` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `ubicacion` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date DEFAULT NULL,
  `horaInicio` time DEFAULT NULL,
  `horaFin` time DEFAULT NULL,
  `fechaProximaReunion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistente`
--

CREATE TABLE `asistente` (
  `codigo` int(11) NOT NULL,
  `codigoPersona` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `codigoActa` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `asistio` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compromiso`
--

CREATE TABLE `compromiso` (
  `codigo` int(11) NOT NULL,
  `codigoActa` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `item` int(11) NOT NULL,
  `descripcion` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `responsable` varchar(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `codigoPersona` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombres` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `codigoProyecto` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `nombreProyecto` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(250) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE `tema` (
  `codigo` int(11) NOT NULL,
  `codigoActa` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `item` int(11) NOT NULL,
  `descripcion` varchar(250) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acta`
--
ALTER TABLE `acta`
  ADD PRIMARY KEY (`codigoActa`),
  ADD KEY `FK-proyecto-acta` (`codigoProyecto`);

--
-- Indices de la tabla `asistente`
--
ALTER TABLE `asistente`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK-persona-asistente` (`codigoPersona`),
  ADD KEY `FK-acta-asistente` (`codigoActa`);

--
-- Indices de la tabla `compromiso`
--
ALTER TABLE `compromiso`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK-acta-compromiso` (`codigoActa`),
  ADD KEY `FK-persona-compromiso` (`responsable`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`codigoPersona`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`codigoProyecto`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `FK-acta-tema` (`codigoActa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistente`
--
ALTER TABLE `asistente`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `compromiso`
--
ALTER TABLE `compromiso`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tema`
--
ALTER TABLE `tema`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `acta`
--
ALTER TABLE `acta`
  ADD CONSTRAINT `FK-proyecto-acta` FOREIGN KEY (`codigoProyecto`) REFERENCES `proyecto` (`codigoProyecto`);

--
-- Filtros para la tabla `asistente`
--
ALTER TABLE `asistente`
  ADD CONSTRAINT `FK-acta-asistente` FOREIGN KEY (`codigoActa`) REFERENCES `acta` (`codigoActa`),
  ADD CONSTRAINT `FK-persona-asistente` FOREIGN KEY (`codigoPersona`) REFERENCES `persona` (`codigoPersona`);

--
-- Filtros para la tabla `compromiso`
--
ALTER TABLE `compromiso`
  ADD CONSTRAINT `FK-acta-compromiso` FOREIGN KEY (`codigoActa`) REFERENCES `acta` (`codigoActa`),
  ADD CONSTRAINT `FK-persona-compromiso` FOREIGN KEY (`responsable`) REFERENCES `persona` (`codigoPersona`);

--
-- Filtros para la tabla `tema`
--
ALTER TABLE `tema`
  ADD CONSTRAINT `FK-acta-tema` FOREIGN KEY (`codigoActa`) REFERENCES `acta` (`codigoActa`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
