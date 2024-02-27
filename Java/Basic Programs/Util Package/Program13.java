package lang;

import java.util.Scanner;

public class Program13 
{
	public static void main(String[] args) 
	{
		Character c1,c2;
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=65;
		
		c1=Character.valueOf(ch1);
		c2=Character.valueOf(ch2);
		
		System.out.println("The value of the character is "+c1);
		System.out.println("The value of the character is "+c2);
	}

}
