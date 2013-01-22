CREATE TABLE `groups` (
  `idGroup` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 NOT NULL,
  `about` text CHARACTER SET utf8 NOT NULL,
  `idStarosty` int(11) DEFAULT NULL,
  PRIMARY KEY (`idGroup`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci

CREATE TABLE `students` (
  `idStudent` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `lastName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `yearOfBorn` int(11) NOT NULL,
  `about` text CHARACTER SET utf8,
  `idGroup` int(11) NOT NULL,
  PRIMARY KEY (`idStudent`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci