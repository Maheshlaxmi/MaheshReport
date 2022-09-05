package Mahesh;

public class ClassB 
{
	public void method()
	{
		System.out.println("Default Method");
	}
	public void method1(int a)
	{
		this.method3(6, 7, 8);
		this.method();
		this.method2(7, 9);
		this.method4(7, 3, 1, 7);

		System.out.println("One Parameterized Method");
	}
	public void method2(int a,int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("Three Parameterized Method");
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized Method");
	}
	public static void main(String[] args)
	{
	ClassB obj=new ClassB();
	obj.method1(1);
	
	}
}

