package lang;

import java.util.Scanner;

public class Program7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    Thread t = Thread.currentThread();
	    t.setName("DXC Technology");
		t.setPriority(1);
		System.out.println("The current thread is "+t);
		
		int count=Thread.activeCount();
		System.out.println("Active threads "+count);
		
		Thread th[]=new Thread[count];
		Thread.enumerate(th);
	}
}
