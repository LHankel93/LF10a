import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class PersonTest {
	private static Person person;

	@BeforeAll
	public static void setup() {
		person = new Person("Testname", "TestEmail123@test.de", "Testpasswort123");
	}

	@Disabled
	@Test
	void testPerson() {
		System.out.println("Noch nicht implementiert.");
	}

	@ParameterizedTest
	@DisplayName("EmailCsVSource Good")
	@CsvSource({ "a@b.de", "ergn49gf45wer@efewfuerw.de", "eghn4fgwsfn4fefwf@ua.bae" })
	void testCheckEmail_CSVSource_ShouldReturnTrue(String email) {
		assertTrue(person.checkEmail(email));
	}

	@ParameterizedTest
	@DisplayName("EmailCsVSource Bad")
	@CsvSource({ "asdagrfgr.de", "@bbb.de", "bbb@" })
	void testCheckEmail_CSVSource_ShouldReturnFalse(String email) {
		assertFalse(person.checkEmail(email));
	}

	@ParameterizedTest
	@DisplayName("EmailCsVFileSource Good")
	@CsvFileSource(files = "email_gut.csv", delimiter = ',')
	void testCheckEmail_CSVFileSource_ShouldReturnTrue(String email) {
		assertTrue(person.checkEmail(email));
	}

	@ParameterizedTest
	@DisplayName("PasswordCsVSource Good")
	@CsvSource({ "srogn5ur4n4i3eufgnwiSD", "wsin4w34wb4ZasidFGRR", "asdfghj1" })
	void testCheckPasswordCSVSource_ShouldReturnTrue(String password) {
		assertTrue(person.checkPassword(password));
	}

	@ParameterizedTest
	@DisplayName("PasswordCsVSource Bad")
	@CsvSource({ "aaaaaaaaaaaaa", "afwerfs", "1ab" })
	void testCheckPasswordCSVSource_ShouldReturnFalse(String password) {
		assertFalse(person.checkPassword(password));
	}

	@ParameterizedTest
	@DisplayName("PasswordCsVFileSource Good")
	@CsvFileSource(files = "passwort_gut.csv", delimiter = ',')
	void testCheckPassword_CSVFileSource_ShouldReturnTrue(String email) {
		assertTrue(person.checkPassword(email));
	}

}
