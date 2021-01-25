// program to show constructor overloading

class MyClass
{
    int i,j;
	//default constructor
	MyClass()
	{}
    
	//Constructor with 2 parameters
	MyClass(int x,int y)
	{
		i=x; j=y;
	}
	
	//Constructor with 1 parameter
	MyClass(int z)
	{
		i=j=z;
	}		
}


public class Constructor_overloading
{
        public static void main(String[] args)
		{
            MyClass myObj = new MyClass(50,60);
            System.out.println(myObj.i); //i=50
            System.out.println(myObj.j); //j=60

			//Making a new reference variable and assigning it to MyClass

			MyClass ref = myObj;
			System.out.println(ref.i); //i=50
			System.out.println(ref.j); //j=60
			
			//Updating the value of i using ref var.
			
			ref.i =40;
			System.out.println(ref.i); // i=40
			
			//calling a single parametrised constructor.
			
			MyClass myObj1 = new MyClass(500);
			System.out.println(myObj1.i);  //i=j=500
            System.out.println(myObj1.j);  //i=j=500
        }
}

