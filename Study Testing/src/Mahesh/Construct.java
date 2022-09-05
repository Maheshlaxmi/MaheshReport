package Mahesh;

public class Construct 
{
	public Construct() 
	{
		System.out.println("Default Constructor");
	}
	public Construct(int a) 
	{
		System.out.println("One Paramaterized Constructor");
	}
	public Construct(int a,int b) 
	{
		System.out.println("Two Paramaterized Constructor");
	}
	public Construct(int a,int b,int c) 
	{
		System.out.println("Three Paramaterized Constructor");
	}
	public Construct(int a,int b,int c,int d) 
	{
		System.out.println("Four Paramaterized Constructor");
	}
	public static void main(String[] args)
	{
		Construct obj= new Construct(3,2,1);
		Construct obj1= new Construct();
		Construct obj2= new Construct(1);
		Construct obj3= new Construct(2,1);
		Construct obj4= new Construct(4,3,2,1);
	}
}
