package managers;

import garage.Module;

public interface ModuleManagerInterface {

	public void modulesReadAll();

	public void modulesAdd(Module m);

	public void modulesEdit(Module m);

	public void moduleRemove(int module_id);
}