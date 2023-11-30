package lab1;

public class Student {
	int number; //fields for attributes
	String name;
	double grade;
	
	public Student (int number, String name, double grade) { //construct for Student class
		this.number = number;
		this.name = name;
		this.grade = grade;
	}
	
	public boolean stEquals(Student stb) { //compare the student with the one entered in the method
		boolean equals = this.equals(stb);
		return equals;
	}
	
}
