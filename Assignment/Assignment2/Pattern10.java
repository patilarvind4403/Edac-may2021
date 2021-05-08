class Pattern10
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
			{
				int x=69;
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print((char)x+" ");
					x--;
				}
				
				System.out.println();
			}
			
			
	}	
}
