package MockInterviewQuestuions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeelist {

	private int age;
	private String name;
	private String gender;
	private String department;
	
	public Employeelist(int age, String name, String gender, String department) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employeelist [age=" + age + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ "]";
	}

	public static void main(String[] args) {
		List<Employeelist> li = new ArrayList<>();
		li.add(new Employeelist(27, "Nishanth","male","IT"));
		li.add(new Employeelist(29, "Chandru","male","IT"));
		li.add(new Employeelist(29,"Prasath","male","HR"));
		li.add(new Employeelist(29,"Abi","female","HR"));
		li.add(new Employeelist(89,"Santharakumar","male","Manager"));
		
		li.stream().filter(e->e.getGender().equals("male") && e.getAge()<=30 ).forEach(System.out::println);
	}
	
}
