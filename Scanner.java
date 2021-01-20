import java.util.Scanner;  // Import the Scanner class

class Scanner
{
   public static void main(String[] args)
	{
	Scanner myObj = new Scanner(System.in);
      	//classname -> ref. var -> = -> new -> constructor;
      	//new -> keyword
	//myObj -> referance variable
	// . is access specifier
	System.out.println("Enter Your name");
	String name = myObj.nextLine();  //read user input
	// mextLine() Method is used to read Strings
	System.out.println("Helllo" + name); // Output user input
	}
}
