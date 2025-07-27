package pkg.model;

public class Teacher extends Person {
	private String code;
	public Teacher(String firstname, String lastname, String code) {
		super(firstname, lastname);
		this.code = code;
	}
	public Teacher() {
		super();
		this.code = "(no code)";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "prof. %s %s (cl. di concorso: %s)".formatted(firstname, lastname, code);
	}
}