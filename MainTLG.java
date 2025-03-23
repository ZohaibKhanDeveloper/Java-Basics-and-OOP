public class MainTLG {
	public static void main(String[] args) {
		TimeLG t1 = new TimeLG();
		TimeLG t2 = new TimeLG(12, 30);
		boolean less = t1.lessThan(t2);
		t1.show(1);
		System.out.println();
		t2.show(2);
		if (less == true) {
			System.out.println("Time-1 is less than Time-2");
		} else {
			System.out.println("Time-2 is less than Time-1");
		}
	}
}
