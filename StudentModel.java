package assignment2;

public class StudentModel {
	
	//Variable declaration
	private int id;
	private String name;
	private String department;
	private int mathMark;
	private int scienceMark;
	
	//Accessor methods
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getMath() {
		return mathMark;
	}
	
	public int getScience() {
		return scienceMark;
	}
	
	//Mutator methods
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setMathMark(int mathMark) {
		this.mathMark = mathMark;
	}
	
	public void setScience(int scienceMark) {
		this.scienceMark = scienceMark;
	}
}