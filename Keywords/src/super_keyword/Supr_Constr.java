package super_keyword;

/**
 * Simple Java program for Super keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class Vehicle1
{
	Vehicle1()
	{
		System.out.println("vehicle is created..");
	}
}
class Bike1 extends Vehicle1
{
	Bike1()
	{
		super();//will invoke parent class constructor
		System.out.println("Bike is created..");
	}
}


public class Supr_Constr 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Bike1 b=new Bike1();		

	}

}
