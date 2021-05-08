import java. util.Scanner;
class Swaping
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
}