package Mahesh;

public class Arithmethic1 
{
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int multi (int m, int n)
	{
		int p;
		p=m*n;
		return p;
	}
	public int div (int e, int f)
	{	int g;
		g=e/f;
		return g;
		}
	public void display1()
	{  System.out.println("Welcome to all you");	
	}
	public void display2()
	{System.out.println("Automation is very Easy");
	}
	public static void main(String[] args) 
	{
		Arithmethic1 obj= new Arithmethic1 () ;
		obj.display1();
		obj.display2();
		int sumresult=obj.sum(10, 2);
		System.out.println("The value For (10+2) is " + sumresult);
		int sumresult2=obj.sum(sumresult, 2);
		System.out.println("The value For ((10+2)+2) is " + sumresult2);
		int multiresult3=obj.multi(sumresult2, 2);
		System.out.println("The value For (((10+2)+2)*2) is " + multiresult3);
		int subresult4=obj.sub(multiresult3, 2);
		System.out.println("The Value For ((((10+2)+2)*2)-2) is "+ subresult4);
		int divresult5=obj.div(subresult4, 2);
		System.out.println("The Final Value For (((((10+2)+2)*2)-2)/2) is " +divresult5);
	}
}
