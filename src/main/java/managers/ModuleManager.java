package managers;


import garage.Module;

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
				System.out.println(result.getString(1) + "\t\t"
						+ result.getString(2) + "\t\t" + result.getString(3) + "\t\t" 
						+ result.getString(4) + "\t" + result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modulesAdd(Module m) {

		String query = "INSERT INTO `modules` (`module_id`,`moduleName`,`modulePrice`,`moduleInfo`,`moduleWeight`) VALUES ('"
				+ m.getModule_id()	+ "','"
				+ m.getModuleName() + "','"
				+ m.getModulePrice() + "','"
				+ m.getModuleInfo() + "'," 
				+ m.getModuleWeight() + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}

	public void modulesEdit(Module m) {

		String query = "UPDATE modules SET `module_id` = '" + m.getModule_id()	+ "', `moduleName` = '" +m.getModuleName() 
				+ "', `modulePrice` = "	+ m.getModulePrice() + ", `moduleInfo` = '" + m.getModuleInfo() 
				+ "', `moduleWeight` = "	+ m.getModuleWeight() + " WHERE `module_id` = " + m.getModule_id();

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}
	
	public void modulesCreate(){
		String query = "CREATE TABLE modules (" +
				"module_id int AUTO_INCREMENT PRIMARY KEY," +
				"moduleName varchar(20)," +
				"modulePrice int," +
				"moduleInfo varchar(60)," +
				"moduleWeight int" +
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