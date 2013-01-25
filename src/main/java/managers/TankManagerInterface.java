package managers;

import garage.Tank;

public interface TankManagerInterface {
	
	public void tanksReadAll();

	public void tanksAdd(Tank t);

	public void tanksEdit(Tank t);

	public void tanksRemove(int tank_id);
}
