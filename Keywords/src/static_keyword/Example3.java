package static_keyword;

/**
 * Simple Java program for Static keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Example3 
{
	int rollno;
	String name;
	static String clg="AU";
	Example3(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+clg);
	}
	public static void main(String[] args) 
	{
		clg="SRASC";
		Example3 a=new Example3(1,"James");
		Example3 a1=new Example3(2,"Bond");
		a.display();
		a1.display();
	

	}


}
