package garage;

public interface TankInterface {
	
	public String getVehicleName();
	public void setVehicleName(String vehicleName);
	public String getVehicleCountryOfOrigin();
	public void setVehicleCountryOfOrigin(String vehicleCountryOfOrigin);
	public String getVehicleClass();
	public void setVehicleClass(String vehicleClass);
	public int getAvgArmor();
	public void setAvgArmor(int avgArmor);
	public int getAvgArmorPenetration();
	public void setAvgArmorPenetration(int avgArmorPenetration);
	public double getAvgRateOfFire();
	public void setAvgRateOfFire(double avgRateOfFire);
	public int getStockEnginePower();
	public void setStockEnginePower(int stockEnginePower);
	public int getYearOfProduction();
	public void setYearOfProduction(int yearOfProduction);
}
