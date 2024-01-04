package MyPack;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int num=3;
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of "+num+" is: "+fact);
	}
}
