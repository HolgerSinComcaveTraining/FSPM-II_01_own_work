package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junitdemo.ReverseStrings;

class ReverseStringsTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void reverse_non_null_string() {
		
		String emptyString = "";
		
		String reversed = ReverseStrings.reverse(emptyString);
		
		assertEquals("", reversed);
		assertEquals("cba", ReverseStrings.reverse("abc"));
		assertEquals("fed", ReverseStrings.reverse("def"), "meine Nachricht");
		
		
		assertEquals(123, 123);
	}
	
	
	@Test
	@DisplayName("Reverse Null String Test Text")
	void reverse_null_string() {
		try {
			ReverseStrings.reverse(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void reverse_null_string_02() {
		assertThrows(IllegalArgumentException.class, () -> {
			ReverseStrings.reverse(null);
		});
	}
}
