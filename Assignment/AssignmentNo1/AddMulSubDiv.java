import java.util.Scanner;
public class AddMulSubDiv
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i1= sc.nextInt();
		System.out.println("First Number is "+i1);
		
		int i2=sc.nextInt();
		System.out.println("Second Number is "+i2);
		
		int i3=i1 + i2;
		int i4=i1 * i2;
		int i5=i1 - i2;
		int i6=i1 % i2;
		
		System.out.println(i1 +"+"+i2+"="+i3);
		System.out.println(i1 +"x"+i2+"="+i4);
		System.out.println(i1 +"-"+i2+"="+i5);
		System.out.println(i1 +"%"+i2+"="+i6);
	}
}