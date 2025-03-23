public class CmdLineArgs{
	public static void main(String[ ] arguments){
		int sum=0;
		float avg;
		for(int i=0; i<arguments.length; i++){
			sum+=Integer.parseInt(arguments[i]);
		}
		avg=(float)sum/arguments.length;
		System.out.printf("The sum of passed using run command is %d",sum);
		System.out.printf("\nThe average of the eneterd values %f\n",avg);
		//System.out.println(Math.PI);
	}
}