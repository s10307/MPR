package managers;


import garage.Module;
import garage.Tank;

import java.sql.ResultSet;

import services.DBeditor;

public class ArmoryManager implements ArmoryManagerInterface {

	public void readAll() {
		String query = "select * from armory";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.viewTable(query);

		try {
			System.out.println("tank_id" + "\t\t"+ "vehicleName" + "\t" + "module_id" + "\t" + "moduleName");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t\t"
						+ result.getString(2) + "\t"
						+ result.getString(3) + "\t\t"
						+ result.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addModuleToTank(Module m, Tank t) {

		
		String query = "INSERT INTO `armory` (`tank_id`, `vehicleName`, `module_id`, `moduleName`) VALUES ('"
				+ t.getTank_id()		+ "','"
				+ t.getVehicleName()	+ "','"
				+ m.getModule_id()		+ "','"
				+ m.getModuleName() 	+ "'"
				+ ");";
		 
		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}

	public void editModuleOnTank(Module m, Tank t) {

		
		String query = "UPDATE armory SET `module_id` = '" + m.getModule_id()	+ "', `moduleName` = '" + m.getModuleName() 
				+ " WHERE `tank_id` = " + t.getTank_id();

		DBeditor dbedit = new DBeditor();
		 
		dbedit.editTable(query);
	}
	
	public void armoryCreate(){
		String query = "CREATE TABLE armory (" + 
				"tank_id INT," + 
				"vehicleName VARCHAR(20)," + 
                "module_id INT,"+
				"moduleName VARCHAR(20)," + 
                "FOREIGN KEY (tank_id) REFERENCES tanks(tank_id),"+
                "FOREIGN KEY (module_id) REFERENCES modules(module_id)" +
                ")";

		
		DBeditor dbedit = new DBeditor();
		
		dbedit.editTable(query);
	}

	public void removeModuleFromTank(Module m, Tank t) {
		String query = "delete from armory where module_id = " + m.getModule_id() + " AND tank_id = " + t.getTank_id();

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}
}