package managers;

import garage.Module;
import garage.Tank;

public interface ArmoryManagerInterface {

	public void readAll();

	public void addModuleToTank(Module m, Tank t);

	public void editModuleOnTank(Module m, Tank t);

	public void removeModuleFromTank(Module m, Tank t);
}