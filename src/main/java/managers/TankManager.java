package managers;

import java.sql.ResultSet;

import services.DBeditor;

public class TankManager implements TankManagerInterface {

	public void tanksReadAll() {
		String query = "select * from tanks";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.viewTable(query);

		try {
				System.out.println("tank_id" + "\t" + "vehicleName" + "\t"+ "vehicleCountryOfOrigin" + "\t" 
				+ "vehicleClass" + "\t" + "avgArmor"+ "\t" + "avgArmorPenetration"+ "\t" + "avgRateOfFire"
				+ "\t" + "stockEnginePower"+ "\t" + "yearOfProduction");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4) + "\t"
						+ result.getString(5) + "\t" + result.getString(6) + "\t" + result.getString(7) + "\t"
						+ result.getString(8) + "\t" + result.getString(9) + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tankAdd(int tank_id, String vehicleName , String vehicleCountryOfOrigin, String vehicleClass , int avgArmor, 
	int avgArmorPenetration , double avgRateOfFire , int stockEnginePower , int yearOfProduction) {
		String query = "INSERT INTO `tanks` (`tank_id`,`vehicleName`,`vehicleCountryOfOrigin`,`vehicleClass`,`avgArmor`" +
				",`avgArmorPenetration`,`avgRateOfFire`,`stockEnginePower`,`yearOfProduction`) VALUES ('"
				+ tank_id + "','"
				+ vehicleName	+ "','"
				+ vehicleCountryOfOrigin + "','"
				+ vehicleClass + "','"
				+ avgArmor + "'," 
				+ avgArmorPenetration + "',"
				+ avgRateOfFire + "'," 
				+ stockEnginePower + "'," 
				+ yearOfProduction + "'," 
				+ ");";
				
		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}

	public void tankEdit(int tank_id, String vehicleName , String vehicleCountryOfOrigin, String vehicleClass , int avgArmor, 
			int avgArmorPenetration , double avgRateOfFire , int stockEnginePower , int yearOfProduction) {

		String query = "UPDATE tanks SET `tank_id` = '" + tank_id + "', `vehicleName` = '" + vehicleName 
				+ "', `vehicleCountryOfOrigin` = "	+ vehicleCountryOfOrigin + ", `vehicleClass` = '" + vehicleClass
				+ "', `avgArmor` = " + avgArmor + ", `avgArmorPenetration` = '" + avgArmorPenetration
				+ "', `avgRateOfFire` = " + avgRateOfFire + ", `stockEnginePower` = '" + stockEnginePower
				+ "', `yearOfProduction` = " + yearOfProduction + " WHERE `tank_id` = " + tank_id;

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}
	
	public void tanksCreate(){
		String query = "CREATE TABLE tanks (" +
				"tank_id int AUTO_INCREMENT PRIMARY KEY," +
				"vehicleName varchar(20)," +
				"vehicleCountryOfOrigin varchar(20)," +
				"vehicleClass varchar(60)," +
				"avgArmor int," +
				"avgArmorPenetration int," +
				"avgRateOfFire double," +
				"stockEnginePower int," +
				"yearOfProduction int," +
				")";
		
		DBeditor dbedit = new DBeditor();
		
		dbedit.editTable(query);
	}

	public void tankRemove(int tank_id) {
		String query = "delete from tanks where tank_id = " + tank_id;

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);

	}

}