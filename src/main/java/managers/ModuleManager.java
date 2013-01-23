package managers;


import java.sql.ResultSet;

import services.DBeditor;

public class ModuleManager implements ModuleManagerInterface {

	public void modulesReadAll() {
		String query = "select * from modules";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.viewTable(query);

		try {
			System.out.println("module_id" + "\t" + "moduleNamefirstName" + "\t"
					+ "modulePrice" + "\t" + "moduleInfo" + "\t" + "moduleWeight");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t" + result.getString(3) + "\t" 
						+ result.getString(4) + "\t" + result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modulesAdd(int module_id, String moduleName, int modulePrice, String moduleInfo, int moduleWeight) {

		String query = "INSERT INTO `modules` (`module_id`,`moduleName`,`modulePrice`,`moduleInfo`,`moduleWeight`) VALUES ('"
				+ module_id	+ "','"
				+ moduleName + "','"
				+ modulePrice + "','"
				+ moduleInfo + "'," 
				+ moduleWeight + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}

	public void modulesEdit(int module_id, String moduleName, int modulePrice, String moduleInfo, int moduleWeight) {

		String query = "UPDATE modules SET `module_id` = '" + module_id	+ "', `moduleName` = '" + moduleName 
				+ "', `modulePrice` = "	+ modulePrice + ", `moduleInfo` = '" + moduleInfo 
				+ "', `moduleWeight` = "	+ moduleWeight + " WHERE `module_id` = " + module_id;

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}
	
	public void modulesCreate(){
		String query = "CREATE TABLE modules (" +
				"module_id int AUTO_INCREMENT PRIMARY KEY," +
				"moduleName varchar(20)," +
				"modulePrice int," +
				"moduleInfo varchar(60)," +
				"moduleWeight int," +
				"tank_id int," +
				")";
		
		DBeditor dbedit = new DBeditor();
		
		dbedit.editTable(query);
	}

	public void moduleRemove(int module_id) {
		String query = "delete from modules where module_id = " + module_id;

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}
}