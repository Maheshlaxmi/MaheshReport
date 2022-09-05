package Mahesh;

public class Const1 
{
 public Const1()
 	{
	 this(34,2,1);
	System.out.println("Default Constructor");// TODO Auto-generated constructor stub
 	}
 public Const1(int a)
	{
	System.out.println("One Parameterized Constructor");// TODO Auto-generated constructor stub
	}
 public Const1(int a,int b)
	{
	System.out.println("Two Parameterized Constructor");// TODO Auto-generated constructor stub
	}
 public Const1(int a,int b,int c)
	{
	System.out.println("Three Parameterized Constructor");// TODO Auto-generated constructor stub
	}
 public Const1(int a,int b,int c,int d)
	{
	 this(2,2);
	System.out.println("Four Parameterized Constructor");// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) 
 {
	Const1 obj=new Const1();
	Const1 obj1=new Const1(2,5,6,1);
	Const1 obj2=new Const1(2);
 }
}
