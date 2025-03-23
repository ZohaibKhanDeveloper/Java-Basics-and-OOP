public class MainDisMY {
    public static void main(String[] args) {
        DistanceMY d1=new DistanceMY();
        DistanceMY d2=new DistanceMY(3,700);
        DistanceMY d3=d1.addDistances(d2);
        System.out.println("<< Distance-I (0 arg contructor) >>");
        d1.show();
        System.out.println("<< Distance-II (2 arg contructor) >>");
        d2.show();
        d1.setDistance(20,1740);
        System.out.println("<< Distance-I (After using set method) >>");
        d1.show();
        System.out.println("<< Distance-III (returned distance after addition) >>");
        d3.show();
    }
}
