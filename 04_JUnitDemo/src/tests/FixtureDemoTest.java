package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.*;

class FixtureDemoTest {
	
	static final Logger Log = Logger.getLogger(FixtureDemoTest.class.getName());

	@BeforeAll
	static void beforeClass() {
		Log.info("BeforeAll");
	}
	
	@AfterAll
	static void afterClass() {
		Log.info("AfterAll");
	}
	
	@BeforeEach
	void setup() {
		Log.info("@BeforeEach");
	}
	
	@AfterEach
	void tearDown() {
		Log.info("AfterEach");
	}
	
	@Test
	void test() {
		Log.info("Test");
	}

}
