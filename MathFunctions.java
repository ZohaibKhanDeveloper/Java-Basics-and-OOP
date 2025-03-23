import java.util.Scanner;
public class MathFunctions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float number;
        System.out.print("Enter a number : ");
        number=input.nextFloat();
        System.out.printf("Absolute of %f   is   %f",number,Math.abs(number));
        System.out.printf("\nFloor of %f   is   %f",number,Math.floor(number));
        System.out.printf("\nCiel of %f   is   %f",number,Math.ceil(number));
        System.out.printf("\nSin of %f   is   %f",number,Math.sin(number));
        System.out.printf("\nCos of %f is %f",number,Math.cos(number));
        System.out.printf("\nTan of %f is %f\n",number,Math.tan(number));
    }
}
