class Pattern9
{
	public static void main(String args[])
	{
		int val=5;
		for(int i=val;i>=1;i--)
			{
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("_");
				
				}
				for(int k=val;k<4;k++)
				{
					System.out.print(k+" ");
					
				}
				
				System.out.println();
			}
	}	
}