CREATE TABLE `modules` (
  `module_id` int(11) NOT NULL AUTO_INCREMENT,
  `moduleName` varchar(45) CHARACTER SET utf8 NOT NULL,
  `modulePrice` int(11) NOT NULL,
  `moduleInfo` text CHARACTER SET utf8 NOT NULL,
  `moduleWeight` int(11) DEFAULT NULL,
  `tank_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`module_id`)
  FOREIGN KEY (`tank_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci

CREATE TABLE `tanks` (
  `tank_id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `vehicleCountryOfOrigin` varchar(20) CHARACTER SET utf8 NOT NULL,
  `vehicleClass` varchar(20) CHARACTER SET utf8 NOT NULL,
  `avgArmor` int(11) NOT NULL,
  `avgArmorPenetration` int(11) NOT NULL,
  `avgRateOfFire` double(11) NOT NULL,
  `stockEnginePower` int(11) NOT NULL,
  `yearOfProduction` int(11) NOT NULL,
  PRIMARY KEY (`tank_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci