public class Distance{
	private int feet;
	private int inches;
	public static int inchesPerFoot=12;
	public Distance(){
		inches=3;
		feet=5;
	}
	public Distance(int i, int f){
		inches=i;
		feet=f;
	}
	public static void classInfo(){
		System.out.print("This class have only on static member => inchesPerFoot : ");
		System.out.print(inchesPerFoot+"\n");
		System.out.println("This class also contain two instance members. I.inches II.feets");
	}
	public void set(int i, int f){
		inches=i;
		feet=f;
	}
	public void show(){
		System.out.printf("Inches : %d",inches);
		System.out.println();
		System.out.printf("Feets : %d",feet);
		System.out.println();
	}
}