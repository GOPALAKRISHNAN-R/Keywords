package this_keywoed;

/**
 * Simple Java program for this keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class thisk
{
	int id;
	String name;
	thisk(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}


public class Example {

	public static void main(String[] args) 
	{
		thisk ob=new thisk(1,"James");
		thisk ob1=new thisk(2,"bond");
		ob.display();
		ob1.display();

	}

}
