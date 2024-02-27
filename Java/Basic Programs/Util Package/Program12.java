package lang;

import java.net.URL;
import java.util.Scanner;

public class Program12 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		char ch1,ch2;
		ch1=sc.next().charAt(0);
		ch2=sc.next().charAt(0);

		boolean b1=Character.isLowerCase(ch1);
		boolean b2=Character.isUpperCase(ch2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("The character is converted to lowercase "+Character.toLowerCase(ch1));
		System.out.println("The character is converted to lowercase "+Character.toUpperCase(ch2));

		
	}

}
