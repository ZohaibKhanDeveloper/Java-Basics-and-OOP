public class TMAIN{
	public static void main(String[ ] args){
		System.out.println("<-(TIME OBJECTS ADDITION PROGRAM)->");
		TIME t1=new TIME();
		TIME t2=new TIME(12,30);
		TIME t3=t1.addTime(t2);
		System.out.print("TIME-I = >  ");
		t1.show();
		System.out.print("TIME-II = >  ");
		t2.show();
		System.out.print("TIME-III =>  ");
		t3.show();
	}
}


