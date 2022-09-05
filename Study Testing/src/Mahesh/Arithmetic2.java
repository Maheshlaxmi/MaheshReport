package Mahesh;

public class Arithmetic2 
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
		return g;}
	public void display1()
	{  
		System.out.println("Welcome to all you");	
	}
	public void display2()
	{
		System.out.println("Automation is very Easy");
	}
	public static void main(String[] args) 
	{
		Arithmetic2 obj= new Arithmetic2 () ;
		obj.display1();
		obj.display2();
		int multiresult=obj.multi(10, 2);
		System.out.println("The value For (10*2) is " + multiresult);
		int subresult2=obj.sub(multiresult, 2);
		System.out.println("The value For ((10*2)-2) is " + subresult2);
		int sumresult3=obj.multi(subresult2, 2);
		System.out.println("The value For (((10+2)-2)+2) is " + sumresult3);
		int multiresult4=obj.div(sumresult3, 2);
		System.out.println("The Value For ((((10*2)-2)+2)*2) is "+multiresult4 );
		int divresult5=obj.div(multiresult4, 2);
		
		System.out.println("The Final Value For (((((10+2)+2)*2)-2)/2) is " +divresult5);
	}
}

