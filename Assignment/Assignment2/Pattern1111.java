public class Pattern1111

{
	public static void main(String Args[])
	
		{	
		
		int rows=5;
		 for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}