package static_keyword;

/**
 * Simple Java program for Static Keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


class Admin
{
	int rollno;
	String name;
	static  String clg="AU";
	Admin(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+clg);
	}
	
}


public class Example {

	public static void main(String[] args) 
	{
		Admin a=new Admin(1,"James");
		Admin a1=new Admin(2,"Bond");
		a.display();
		a1.display();
	

	}

}
