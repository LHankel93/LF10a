import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",
			Pattern.CASE_INSENSITIVE);
	private String name;
	/**
	 * Vor @ mindestens 1 Wort Nach @ mindestens 1 Wort Nach letzen Wort ein Punkt
	 * Nach Punkt 1 Wort (Domain) (RegEx)
	 */
	private String email;
	/**
	 * min. 8 Zeichen lang min. 1 Ziffer min. 1 alphanumerisch
	 */
	private String password;

	public Person(String name, String email, String password) {
		if (name.length() > 0 && checkEmail(email) && checkPassword(password)) {
			this.name = name;
			this.email = email;
			this.password = password;
		} else {
			System.err.println("Ungültige Eingaben!");
		}

	}

	public boolean checkEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

	public boolean checkPassword(String password) {
		Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
		return matcher.find();
	}

}
