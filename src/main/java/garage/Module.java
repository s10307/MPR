package garage;

import java.util.List;

public class Module implements ModuleInterface {

	private int module_id = 0;
	private String moduleName = ""; 
	private int modulePrice = 0;
	private String moduleInfo = "";
	private int moduleWeight= 0;
	
	public Module(int module_id, String moduleName, int modulePrice, String moduleInfo, int moduleWeight){
		this.module_id=module_id;
		this.moduleName=moduleName;
		this.modulePrice=modulePrice;
		this.moduleInfo=moduleInfo;
		this.moduleWeight=moduleWeight;
	}
	
	public int getModule_id() {
		return module_id;
	}
	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModulePrice() {
		return modulePrice;
	}
	public void setModulePrice(int modulePrice) {
		this.modulePrice = modulePrice;
	}
	public String getModuleInfo() {
		return moduleInfo;
	}
	public void setModuleInfo(String moduleInfo) {
		this.moduleInfo = moduleInfo;
	}
	public int getModuleWeight() {
		return moduleWeight;
	}
	public void setModuleWeight(int moduleWeight) {
		this.moduleWeight = moduleWeight;
	}
}