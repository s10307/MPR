package services;

import garage.Module;
import garage.Tank;
import managers.ArmoryManager;
import managers.ModuleManager;
import managers.TankManager;

public class main {
	public static void main(String[] args) {
		DBconnector db = new DBconnector();
		ModuleManager moduleManager = new ModuleManager();
		TankManager tankManager = new TankManager();
		ArmoryManager armoryManager = new ArmoryManager();
		
		db.connect();
		System.out.println("Tabelka modulow:");
		moduleManager.modulesCreate();
		Module modul = new Module(1, "Dzialko wypas", 1000, "Jest dobre.", 500);
		moduleManager.modulesAdd(modul);
		moduleManager.modulesReadAll();
		
		System.out.println("\nTabelka czolgow:");
		tankManager.tanksCreate();
		Tank czolg = new Tank(1, "Czolg wypas", "Polska", "Czolg lekki", 100, 120, 14, 200, 1984);
		tankManager.tanksAdd(czolg);
		tankManager.tanksReadAll();
		
		System.out.println("\nLadujemy moduly na czolg:");
		armoryManager.armoryCreate();
		armoryManager.addModuleToTank(modul, czolg);
		armoryManager.readAll();
	}
}