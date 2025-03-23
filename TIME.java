public class TIME{
	private int hours;
	private int mins;
	public TIME(){
		hours=10;
		mins=30;
	}
	public TIME(int h, int m){
		hours=h;
		mins=m;
	}
	public TIME addTime(TIME t){
		int h=hours+t.hours;
		int m=mins+t.mins;
		if(m>=60){
			h++; 
			m-=60;
		}
		return new TIME(h,m);
	}
	public void set(int h, int m){
		hours=h;
		mins=m;
	}
	public void show(){
		System.out.printf("%d  :  %d\n",hours,mins);	
	}
}