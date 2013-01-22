package services;

import managers.ModuleManager;

public class main {
	public static void main(String[] args) {
		DBconnector db = new DBconnector();
		ModuleManager ModMan = new ModuleManager();

		db.connect();
		System.out.println("Pierwotna:");
		ModMan.studentsReadAll();
		/*student.studentsAdd("test", "guy", 666, "testing", 1);
		System.out.println("Po Dodaniu:");
		student.studentsReadAll();
		student.studentsEdit(9, "Patriszja2", "Awesome", 1988, "zagraniczna", 2);
		System.out.println("Po edycji:");
		student.studentsReadAll();
		student.studentsRemove(25);
		System.out.println("Po usunięciu:");
		student.studentsReadAll();
		*/
	}
}