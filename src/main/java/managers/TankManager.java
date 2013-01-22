package managers;

import java.sql.ResultSet;

import services.DBeditor;

public class TankManager implements TankManagerInterface {

	public void groupsReadAll() {
		String query = "select * from groups";
		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idGroup" + "\t" + "name" + "\t" + "idStarosty"
					+ "\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t" + result.getString(3)
						+ "\t" + result.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void groupAdd(String name, String about, int idStarosty) {
		String query = "INSERT INTO `groups` (`name`,`about`,`idStarosty`) VALUES ('"
				+ name + "','" + about + "'," + idStarosty + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void groupEdit(int idGroup, String name, String about, int idStarosty) {
		String query = "UPDATE groups SET `name` = '" + name
				+ "', `about` = '" + about + "', `idStarosty` = "
				+ idStarosty + " WHERE `idStudent` = " + idGroup;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);

	}

	public void groupRemove(int idGroup) {
		String query = "delete from groups where idGroup = " + idGroup;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);

	}

}