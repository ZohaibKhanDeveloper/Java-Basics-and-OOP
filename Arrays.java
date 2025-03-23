import java.util.Scanner;
public class Arrays{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int size,sum=0,max,min;
		float avg;
		System.out.print("Enter the size of array : ");
		size=input.nextInt( );
		int[ ] numbers=new int[size];
		System.out.println("Now Enter Elements/Numbers of array.");
		for(int i=0; i<size; i++){
			System.out.printf("Enter number %d  : ",i+1,"\n");
			numbers[i]=input.nextInt();
			sum+=numbers[i];	
		}
		avg=(float)sum/size;
		max=numbers[0];
		for(int i=0; i<size; i++){	if(max<numbers[i]) max=numbers[i];	}
		min=numbers[0];
		for(int i=0; i<size; i++){	if(min>numbers[i]) min=numbers[i];	}
		System.out.print("Numbers you Entered : ");
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]+"   ");
		}
		System.out.println("\nSum of numbers : "+sum);
		System.out.println("Average of numbers in array : "+avg);	
		System.out.println("Maximum number in array : "+max);
		System.out.println("Minumum number in array : "+min);
	}
}