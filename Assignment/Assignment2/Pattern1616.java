public class Pattern1616

{
	public static void main(String Args[])
	
	{	
		
		int rows=5;
		 for (int i=1; i<=rows; i++)
        {
           
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
           
            for (int k=1; k<=i; k++)
            {
                if( k == 1 || k == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}