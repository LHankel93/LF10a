

public class Person {
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
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public boolean checkEmail(String email) {
		return true;
	}
}
