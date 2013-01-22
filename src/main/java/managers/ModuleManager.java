package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import services.DBeditor;

public class ModuleManager implements ModuleManagerInterface {

	public void studentsReadAll() {
		String query = "select * from students";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idStud" + "\t" + "firstName" + "\t"
					+ "lastName" + "\t" + "yearOfBorn" + "\t" + "idGroup"
					+ "\t\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t\t" + result.getString(3)
						+ "\t\t" + result.getString(4) + "\t\t"
						+ result.getString(6) + "\t\t" + result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void studentsAdd(String firstName, String lastName, int yearOfBorn,
			String about, int idGroup) {

		String query = "INSERT INTO `students` (`firstName`,`lastName`,`yearOfBorn`,`about`,`idGroup`) VALUES ('"
				+ firstName
				+ "','"
				+ lastName
				+ "',"
				+ yearOfBorn
				+ ",'"
				+ about + "'," + idGroup + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void studentsEdit(int idStudent, String firstName, String lastName,
			int yearOfBorn, String about, int idGroup) {

		String query = "UPDATE students SET `firstName` = '" + firstName
				+ "', `lastName` = '" + lastName + "', `yearOfBorn` = "
				+ yearOfBorn + ", `about` = '" + about + "', `idGroup` = "
				+ idGroup + " WHERE `idStudent` = " + idStudent;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void studentsRemove(int idStudent) {
		String query = "delete from students where idStudent = " + idStudent;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}
}