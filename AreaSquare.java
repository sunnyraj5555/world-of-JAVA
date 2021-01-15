public class Area
{
	// Main function
	public static void main(String arg[])
	{
		int s=Integer.parseInt(arg[0]);
		double r=sqrArea(s);
		System.out.println("Area of the Square="+r);
	}
            //Function
		static double sqrArea(int s)
		{
		return (s*s); // returning area
		}
}
