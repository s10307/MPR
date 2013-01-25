package j_unit;

import static org.junit.Assert.*;
import garage.Tank;

import managers.TankManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TankManagerTest {

	Tank t1 = new Tank(1, "TANK1", "COUNTRY", "CLASS", 1, 2, 3, 4, 5);
	Tank t2 = new Tank(2, "TANK2", "COUNTRY", "CLASS", 4, 5, 6, 7, 8);
	Tank t3 = new Tank(3, "TANK3", "COUNTRY", "CLASS", 9, 10, 11, 12, 13);
	
	TankManager tMan = new TankManager();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTanksAdd() {
		tMan.tanksAdd(t1);
		//tMan.
	}

	@Test
	public void testTanksEdit() {
		fail("Not yet implemented");
	}

	@Test
	public void testTanksCreate() {
		fail("Not yet implemented");
	}

	@Test
	public void testTankRemove() {
		fail("Not yet implemented");
	}

}
