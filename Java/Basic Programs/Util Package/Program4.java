package lang;

import java.util.Scanner;

public class Program4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="M Roshan Snenapati";      //charAt
	    System.out.println(str.charAt(0));
	    System.out.println(str.charAt(4));
	    
	    int retval = str.codePointAt(2);    
	    System.out.println("Character(unicode point) = " + retval);
	    
	    String str1="Hello ";         //compareTo method
	    String str2="World";
	      int comp = str1.compareTo(str2);

	      if (comp > 0) {
	         System.out.println("str1 is greater than str2");
	      } else if (retval == 0) {
	         System.out.println("str1 is equal to str2");
	      } else {
	         System.out.println("str1 is less than str2");
	      }
	      
	      System.out.println("The String after concat is "+str1.concat(str2));  //concat method
	      
	      
	}

}
