package encapsulation;

public class Person {

	private double height;
	private String ethnicity, name, eyeColor;

	public Person() {

	}

	public Person(double height, String ethnicity, String name, String eyeColor) {
		super();
		this.height = height;
		this.ethnicity = ethnicity;
		this.name = name;
		this.eyeColor = eyeColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	public String getEthnicity() {
		return ethnicity;
	}

	public String getName() {
		return name;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

}
