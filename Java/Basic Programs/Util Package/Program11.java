package lang;

public class Program11 
{
	public static void main(String[] args) 
	{
		Program11 cls=new Program11();
		Program11 subcls=new Subclass();
		
		Class c=cls.getClass();
		System.out.println(c);
		Class c1=subcls.getClass();
		System.out.println(c1);
		
		Object retval = Compiler.command("javac Program11");
	    System.out.println("Return Value = " + retval); 
	}
}
class Subclass extends Program11
{
	
}
