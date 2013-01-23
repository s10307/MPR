package managers;

public interface ModuleManagerInterface {

	public void modulesReadAll();

	public void modulesAdd(int module_id, String moduleName, int modulePrice, String moduleInfo, int moduleWeight);

	public void modulesEdit(int module_id, String moduleName, int modulePrice, String moduleInfo, int moduleWeight);

	public void moduleRemove(int module_id);
}