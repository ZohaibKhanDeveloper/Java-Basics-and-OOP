public class TimeLG { // LG means Less than and Greater
	private int hours;
	private int mins;

	public TimeLG() {
		hours = 10;
		mins = 20;
	}

	public TimeLG(int h, int m) {
		hours = h;
		mins = m;
	}

	public boolean lessThan(TimeLG t) {
		if ((hours < t.hours) || (hours == t.hours) && (mins < t.mins))
			return true;
		else
			return false;
	}

	public void show(int n) {
		System.out.printf("< -- TIME- %d -->", n);
		System.out.println();
		System.out.printf("%d  :  %d", hours, mins);
		System.out.println();
	}
}