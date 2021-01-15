public class Area
{
    	public static void main(String arg[])  
    	{
		int b=Integer.parseInt(arg[0]);
		int h=Integer.parseInt(arg[1]);
		double r=triArea(b,h);
		System.out.println("Area of the Triangle="+r);
	}
		static double triArea(int b, int h)
		{
			return (0.5*b*h);
		}

}
