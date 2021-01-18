// Matrix multiplication by not passing arrgument 
public class MatrixMultiplication
{  
	public static void main(String args[])
	{  
		//creating two matrices    
		int a[][]={{1,5,6},{4,7,2},{9,3,6}};    
		int b[][]={{2,6,1},{6,2,7},{8,4,9}};    
   
		int c[][]=new int[3][3]; 
       
		for(int i=0;i<3;i++)
		{    
				for(int j=0;j<3;j++)
				{    
					c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
			c[i][j]+=a[i][k]*b[k][j];      
		}
			System.out.print(c[i][j]+" "); 
				}
			System.out.println();   
		}    
	}
}
