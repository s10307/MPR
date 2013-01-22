package garage;

import java.util.List;

public class Tank implements TankInterface {

	List <Module> ModulesList;
	
	private int tank_id = 0;
	private String vehicleName = ""; 
	private String vehicleCountryOfOrigin = "";
	private String vehicleClass = "";
	private int avgArmor = 0; 
	private int avgArmorPenetration = 0;
	private double avgRateOfFire = 0.0;
	private int stockEnginePower = 0;
	private int yearOfProduction = 0;
	
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleCountryOfOrigin() {
		return vehicleCountryOfOrigin;
	}

	public void setVehicleCountryOfOrigin(String vehicleCountryOfOrigin) {
		this.vehicleCountryOfOrigin = vehicleCountryOfOrigin;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public int getAvgArmor() {
		return avgArmor;
	}

	public void setAvgArmor(int avgArmor) {
		this.avgArmor = avgArmor;
	}

	public int getAvgArmorPenetration() {
		return avgArmorPenetration;
	}

	public void setAvgArmorPenetration(int avgArmorPenetration) {
		this.avgArmorPenetration = avgArmorPenetration;
	}

	public double getAvgRateOfFire() {
		return avgRateOfFire;
	}

	public void setAvgRateOfFire(double avgRateOfFire) {
		this.avgRateOfFire = avgRateOfFire;
		this.avgRateOfFire = Math.round(avgRateOfFire * 100) / 100;
	}

	public int getStockEnginePower() {
		return stockEnginePower;
	}

	public void setStockEnginePower(int stockEnginePower) {
		this.stockEnginePower = stockEnginePower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public int getTank_id() {
		return tank_id;
	}

	public void setTank_id(int tank_id) {
		this.tank_id = tank_id;
	}

}