import java.util.*; // Import all the classes from the package utility
	public class Prog2{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			int a,b,sum;
			System.out.print(" Enter First number : ");
			a=input.nextInt();
			System.out.print(" Enter Second number : ");		
			b=input.nextInt();
			sum=a+b;
			System.out.println("The sum of " +a+" and "+b+" is "+sum);
		}
	}