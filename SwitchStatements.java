import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("SWITCH STSTEMENTS IN JAVA");
        System.out.println("Enter a number betwenn 0 - 6");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number is not in range");
        }
        n.close();
    }
}
