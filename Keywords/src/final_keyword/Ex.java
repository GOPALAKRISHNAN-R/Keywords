package final_keyword;

/**
 * Simple Java program for final keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Ex
{
	int rno;
	String name;
	final String clg="AU";
	Ex(int r,String n)
	{
		rno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rno+" "+name+" "+clg);
	}

	public static void main(String[] args) 
	{
		
		Ex a=new Ex(1,"James");
		Ex b=new Ex(2,"Bond");
		a.display();
		b.display();
		

	}

}
