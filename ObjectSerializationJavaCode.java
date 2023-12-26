package SangamOneJavaCode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		
		this.name = name;
		this.age = age;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
		
}

public class ObjectSerializationJavaCode  
{
	public static void main(String[] args) throws IOException {

		ByteArrayOutputStream bob = new ByteArrayOutputStream();
		ObjectOutputStream wob = new ObjectOutputStream(bob);
		
		Student sob = new Student("Sharath",20);
		
		wob.writeObject(sob);
		System.out.println(" Serialization" + wob);
		System.out.println(" Serialization" + sob);
		wob.close();
		

	}

}
