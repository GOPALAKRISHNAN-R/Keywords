package super_keyword;

/**
 * Simple Java program for Super keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
class Person
{
	void msg()
	{
		System.out.println("Hi...");
	}
	
}
class Student extends Person
{
	void msg()
	{
		System.out.println("Welcome to java...");
	}
	void display()
	{
		msg();//will invoke current class msg() method
		super.msg();//will invoke parent class msg() method
	}
}
public class SuprMethd {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.display();
		
		

	}

}
