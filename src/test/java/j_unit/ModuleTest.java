package j_unit;

import static org.junit.Assert.*;
import garage.Module;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModuleTest {

	Module m = new Module(1, "modul", 100, "INFO", 100);
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetModule_id() {
		assertEquals(1, m.getModule_id());
	}

	@Test
	public void testSetModule_id() {
		m.setModule_id(2);
		assertEquals(2, m.getModule_id());
	}

	@Test
	public void testGetModuleName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModuleName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModulePrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModulePrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModuleInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModuleInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModuleWeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModuleWeight() {
		fail("Not yet implemented");
	}

}
