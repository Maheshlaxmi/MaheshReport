package Mahesh;

public class Arithmetic3 
{
	public int sum (int a,int b)
	{
	int c;
	c=a+b;
	return c;
	}
	public int sub (int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int multi (int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		return a3;
	}
	public int div (int b1,int b2)
	{
		int b3;
		b3=b1/b2;
		return b3;
	}
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("The First Output");
	}
	public void display3()
	{
		System.out.println("The Second Output");
	}
	public void display4()
	{
		System.out.println("Thank you For Giving the Output");
	}
	public static void main(String[] args) 
	{
		Arithmetic3 obj1= new Arithmetic3();
		obj1.display1();
		
		obj1.display2();
		int sumResult=obj1.sum(10, 5);
		System.out.println("The Value of (10+5) is "+sumResult );
		int multiResult2=obj1.multi(sumResult, 5);
		System.out.println("the Value of ((10+5)*5) is "+multiResult2);
		int divResult3=obj1.div(multiResult2, 6);
		System.out.println("The Value of (((10+5)*5)/6) is " +divResult3);
		int multiResult4=obj1.multi(divResult3, 21);
		System.out.println("The Value of ((((10+5)*5)/6)*21) is "+multiResult4);
		int subResult5=obj1.sub(multiResult4, 50);
		System.out.println("The Value of (((((10+5)*5)/6)*21)-50) is  "+subResult5);
		int sumResult6=obj1.sum(subResult5, 1);
		System.out.println("The Value of ((((((10+5)*5)/6)*21)-50)+1) is  "+sumResult6);
		
		obj1.display3();
		
		int multiRes1=obj1.multi(17, 16);
		System.out.println("The Value Of (17*16) is "+multiRes1);
		int divRes2=obj1.div(multiRes1, 8);
		System.out.println("The Value Of ((17*16)/8) is "+divRes2);
		int subRes3=obj1.sub(divRes2, 16);
		System.out.println("The Value Of (((17*16)/8)-16) is "+subRes3);
		int multiRes4=obj1.multi(subRes3, 33);
		System.out.println("The Value Of ((((17*16)/8)-16)*33) is "+multiRes4);
		int sumres5=obj1.sum(multiRes4, 80);
		System.out.println("The Value Of (((((17*16)/8)-16)*33)+80) is "+sumres5);
		int divres6=obj1.div(sumres5, 10);
		System.out.println("The Value Of ((((((17*16)/8)-16)*33)+80)+10) is "+divres6);
			
		obj1.display4();
	}

}