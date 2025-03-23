import java.util.Scanner;
public class IfElseInJava {
    public static void main(String[] args) {
        System.out.println("~*~(CONDITIONS IN JAVA)~*~");
        System.out.println("-----(PHASE-I)-----");
        System.out.print("Enter your age : ");
        Scanner ag = new Scanner(System.in);
        int age = ag.nextInt();
        if (age > 18) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("Your are not an Adult.");
        }
        System.out.println("-----(PHASE-II)-----");
        System.out.println("Enter a Number : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number.");
        } else {
            System.out.println(num + " is an odd Number.");
        }
        ag.close();
        n.close();
    }
}