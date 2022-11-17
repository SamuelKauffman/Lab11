package Lab11;

public class College {
	String name;
	String address;
	Student student;
	Department department;
College(String name, String address, Student student, Department department) {
	this.name=name;
	this.address=address;
	this.department=department;
	this.student=student;
}
public static void main(String[] args) {
	Student stu = new Student("Sam","Brook Stone","Computer Science");
	Department dept = new Department("Computer Science", "Rob");
	College c = new College("Bellarmine","Highlands",stu,dept);
		System.out.println("College: " + c.name);
		System.out.println("Address: " + c.address);
		System.out.println("Student: " + c.student.name);
		System.out.println("Department: " + c.department.name);
}
	
}
