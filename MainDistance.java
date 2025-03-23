public class MainDistance{
	public static void main(String[] args){
		Distance d1=new Distance();
		Distance d2=new Distance(7,8);
		System.out.println("<<Class Information>>");
		Distance.classInfo();
		System.out.println("<<Object One>>");
		d1.show();
		System.out.println("<<Object Two>>");
		d2.show();
	}
}