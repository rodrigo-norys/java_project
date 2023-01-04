package classes;

public class PersonalDataClass {
	
	private double height;
	private char gender;

	public PersonalDataClass(double height, char gender) {
		this.height = height;
		this.gender = gender;
	}
	
	public PersonalDataClass(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
