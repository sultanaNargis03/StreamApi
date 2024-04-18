package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person
{
	int id;
	int age;
	String name;
	String gender;
	public Person() {
		
	}
	public Person(int id, int age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		
}



public class Launch3 {

	public static void main(String[] args) 
	{
		List<Person> person=Arrays.asList(
				new Person(1,25,"Nargis Sultana","Female"),
				new Person(2,15,"sk. Tamim","Male")
				);

		List<String> uNames = new ArrayList<>();
		uNames=person.stream().map(Person::getName).map(String::toUpperCase).toList();
		
		System.out.println(uNames);
	}

}
