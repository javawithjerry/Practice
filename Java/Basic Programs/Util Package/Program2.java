package lang;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Program2 
{
	static int count=0;
	public Program2()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Program2 ob1=new Program2();     //Objects 
		Program2 ob2=new Program2();
		Program2 ob3=new Program2();
		System.out.println("The number of objects are "+count);
		
		
		Integer x=new Integer(30);   //equals
		System.out.println(x.equals(x));
		
	    GregorianCalendar time = new GregorianCalendar();
	    System.out.println("" + time.getTime());
		System.out.println("" + time.hashCode());
		
		 
		ArrayList list = new ArrayList();     //tostring
	    list.add(50);
	    list.add("Hello World");
	    System.out.println("" + x.toString());
	    System.out.println("" + list.toString());
	    
	    
	}

}
