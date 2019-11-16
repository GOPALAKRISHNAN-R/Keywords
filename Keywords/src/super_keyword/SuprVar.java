package super_keyword;

/**
 * Simple Java program for Super Keyword
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
class Vehicle
{
	int speed=100;
}
class Bike extends Vehicle
{
	int speed=50;
	void disply()
	{
		System.out.println(speed);//will print bike speed
		System.out.println(super.speed);//will print the vehicle speed
	}
}
public class SuprVar 
{
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.disply();

	}

}
