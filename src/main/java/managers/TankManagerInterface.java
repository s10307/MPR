package managers;

public interface TankManagerInterface {
	
	public void tanksReadAll();

	public void tankAdd(int tank_id, String vehicleName , String vehicleCountryOfOrigin, String vehicleClass , int avgArmor, 
			int avgArmorPenetration , double avgRateOfFire , int stockEnginePower , int yearOfProduction);

	public void tankEdit(int tank_id, String vehicleName , String vehicleCountryOfOrigin, String vehicleClass , int avgArmor, 
			int avgArmorPenetration , double avgRateOfFire , int stockEnginePower , int yearOfProduction);

	public void tankRemove(int tank_id);
}
