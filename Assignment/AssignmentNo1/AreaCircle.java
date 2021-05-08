import java.util.Scanner;
class AreaCircle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius =");
		double radius=sc.nextDouble();
		double Pm,Area;
		float pi=3.14F;
		Pm=(2*pi*radius);
		Area=(pi*radius*radius);
		System.out.println("Perimeter ="+ Pm);
		System.out.print("Area ="+ Area);
		
		
	}
}