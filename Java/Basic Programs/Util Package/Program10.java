package lang;

public class Program10 
{
	public static void main(String[] args)
	{
		System.out.println("Programming in " + Language.C.toString());       
	    System.out.println("Programming in " + Language.Java.toString());  
	    System.out.println("Programming in " + Language.PHP.toString());  

	}
	enum Language {
		   C, Java, PHP;
		}

}
