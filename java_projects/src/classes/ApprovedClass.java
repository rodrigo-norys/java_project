package classes;

public class ApprovedClass {
	
	private String name;
	private double semester1;
	private double semester2;
	
	public ApprovedClass(String name, double semester1, double semester2) {
		this.name = name;
		this.semester1 = semester1;
		this.semester2 = semester2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSemester1() {
		return semester1;
	}

	public void setSemester1(double semester1) {
		this.semester1 = semester1;
	}

	public double getSemester2() {
		return semester2;
	}

	public void setSemester2(double semester2) {
		this.semester2 = semester2;
	}
	
	public  double Average() {
		return (semester1 + semester2) / 2;
	}
	
}
