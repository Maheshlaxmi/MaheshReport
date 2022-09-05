package Mahesh;

public class pckg1 
{ // boundaries of the Class
	
	int a; //variable
	public void Mahesh()  //() Indicate this is a method
	{
		// Boundary of the method
		System.out.println("Welcome All");
	}
	public static void main(String[] args) 
	{
	pckg1 abc=new pckg1();
	abc.Mahesh();
	abc.a=23;
	System.out.println(" Age of Mahesh is "+abc.a);
	abc.a=44;
	System.out.println(" Roll No of Mahesh is "+abc.a);
	}
}
