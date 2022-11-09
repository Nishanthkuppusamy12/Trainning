package ControllStatement;

public class Employee {

private int id;
private String name;
private int age;
private int experience;
private double salary;	
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(int id, String name, int age, int experience, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.experience = experience;
	this.salary = salary;
}
//public Employee(int id, String name, int age, int experience, double salary) {
//	
//}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", salary="
			+ salary + "]";
}



}
