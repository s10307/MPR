package j_unit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import garage.Tank;

public class TankTest {

	Tank t = new Tank(1, "Pzkpw III", "Germany", "Light", 100, 60, 10, 340, 19341);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testGetVehicleName() {
		assertEquals(t.getVehicleName(), "Pzkpw III");
	}

	@Test
	public void testSetVehicleName() {
		t.setVehicleName("KV");
		assertEquals(t.getVehicleName(), "KV");
	}

	@Test
	public void testGetVehicleCountryOfOrigin() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVehicleCountryOfOrigin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVehicleClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVehicleClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvgArmor() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAvgArmor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvgArmorPenetration() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAvgArmorPenetration() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvgRateOfFire() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAvgRateOfFire() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStockEnginePower() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStockEnginePower() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetYearOfProduction() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetYearOfProduction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTank_id() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTank_id() {
		fail("Not yet implemented");
	}

}
