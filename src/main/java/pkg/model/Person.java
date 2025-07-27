package pkg.model;

public class Person {
	protected String firstname;
	protected String lastname;
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public Person() {
		this("(no firstname)", "(no lastname)");
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "%s %s".formatted(firstname, lastname);
	}
}