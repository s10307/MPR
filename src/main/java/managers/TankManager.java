package managers;

import garage.Tank;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import services.DBeditor;

public class TankManager implements TankManagerInterface {

	
	public void tanksReadAll() {
		String query = "select * from tanks";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.viewTable(query);

		try {
				System.out.println("tank_id" + "\t\t" + "vehicleName" + "\t"+ "vehicleCountryOfOrigin" + "\t" 
				+ "vehicleClass" + "\t" + "avgArmor"+ "\t" + "avgArmorPenetration"+ "\t" + "avgRateOfFire"
				+ "\t" + "stockEnginePower"+ "\t" + "yearOfProduction");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t\t"
						+ result.getString(2) + "\t" + result.getString(3) + "\t\t\t" + result.getString(4) + "\t"
						+ result.getString(5) + "\t\t" + result.getString(6) + "\t\t\t" + result.getString(7) + "\t\t"
						+ result.getString(8) + "\t\t\t" + result.getString(9) + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tanksAdd(Tank t) {
		String query = "INSERT INTO `tanks` (`tank_id`,`vehicleName`,`vehicleCountryOfOrigin`,`vehicleClass`,`avgArmor`" +
				",`avgArmorPenetration`,`avgRateOfFire`,`stockEnginePower`,`yearOfProduction`) VALUES ('"
				+ t.getTank_id() + "','"
				+ t.getVehicleName()	+ "','"
				+ t.getVehicleCountryOfOrigin() + "','"
				+ t.getVehicleClass() + "','"
				+ t.getAvgArmor() + "','" 
				+ t.getAvgArmorPenetration() + "','"
				+ t.getAvgRateOfFire() + "','" 
				+ t.getStockEnginePower() + "','" 
				+ t.getYearOfProduction() + "'" 
				+ ");";
		
		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);
	}

	public void tanksEdit(Tank t) {

		String query = "UPDATE tanks SET `tank_id` = '" + t.getTank_id() + "', `vehicleName` = '" + t.getVehicleName() 
				+ "', `vehicleCountryOfOrigin` = "	+ t.getVehicleCountryOfOrigin() + ", `vehicleClass` = '" + t.getVehicleClass()
				+ "', `avgArmor` = " + t.getAvgArmor() + ", `avgArmorPenetration` = '" + t.getAvgArmorPenetration()
				+ "', `avgRateOfFire` = " + t.getAvgRateOfFire() + ", `stockEnginePower` = '" + t.getStockEnginePower()
				+ "', `yearOfProduction` = " + t.getYearOfProduction() + " WHERE `tank_id` = " + t.getTank_id();

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
				"yearOfProduction int" +
				")";
		
		DBeditor dbedit = new DBeditor();
		
		dbedit.editTable(query);
	}

	public void tanksRemove(int tank_id) {
		String query = "delete from tanks where tank_id = " + tank_id;

		DBeditor dbedit = new DBeditor();

		dbedit.editTable(query);

	}


}