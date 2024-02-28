package lang;

import java.util.Scanner;

public class Program1  //String BUffer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");    //Append
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println("Enter the String to execute for appned function");
		String apnd=sc.nextLine();
		sb.append(apnd);
		System.out.println("String after append "+sb);
		
		System.out.println("Enter the String to be inserted");   //Inlssert
		String insert=sc.nextLine();
		System.out.println("Enter the position where you want to insert");
		int n=sc.nextInt();
		sb.insert(n, insert);
		System.out.println("The String after insert is "+sb);
	
		System.out.println("Enter the position where you want to delete");
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		System.out.println(sb.delete(p1, p2));
		
		System.out.println("Enter the String to be replaced");   //replace
		String replace=sc.nextLine();
		System.out.println("Enter the position where you want to delete");
		int rn1=sc.nextInt();
		int rn2=sc.nextInt();
		sb.replace(rn1, rn2, replace);
		
		System.out.println("The reverse String is "+sb.reverse());	
	}

}
