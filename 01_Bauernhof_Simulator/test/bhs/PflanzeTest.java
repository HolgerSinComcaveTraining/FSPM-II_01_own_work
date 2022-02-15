package bhs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import bhs.model.feld.Pflanze;

class PflanzeTest {

	private static Pflanze pflanze;
	
	@BeforeAll
	static void setup() {
		pflanze = new Pflanze(Pflanze.PFLANZE_APFEL);
		pflanze.ernten();
	}
	
	
	@Test
	void test() {
//		fail("Not yet implemented");
		assertEquals("Apfel", pflanze.getPflanzenSorte());
	}
	
	@Test
	@DisplayName("Testen der Qualität zwischen 50 und 85")
	void qualitaetTesten() {
		assertTrue(pflanze.getQuality() <= 85 && pflanze.getQuality() >= 50);
	}

}
