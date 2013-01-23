INSERT INTO `tanks` (`tank_id`,`vehicleName`,`vehicleCountryOfOrigin`,`vehicleClass`,`avgArmor`,`avgArmorPenetration`,`avgRateOfFire`
,`stockEnginePower`,`yearOfProduction`)
VALUES
(1,'T29','USA','Heavy tank',150,240,6,850,1958);


INSERT INTO `modules` (`module_id`,`moduleName`,`modulePrice`,`moduleInfo`,`moduleWeight`,`tank_id`)
VALUES
(1,'Heavy Spall Liner',500000,'Improves guns accuracy',1000,);
