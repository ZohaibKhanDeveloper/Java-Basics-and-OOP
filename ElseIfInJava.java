import java.util.Scanner;

public class ElseIfInJava {
    public static void main(String[] args) {
        System.out.println("Else if conditions in java");
        System.out.println("---------------------------");
        System.out.println("Enter A number : ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        if (number > 0 && number < 30)
            System.out.println("Number lies between 0 and 30.");
        else if (number > 29 && number < 60)
            System.out.println("Nummber Lies between 30 and 60.");
        else
            System.out.println("Number is greater than 60 or less than 0");
        n.close();
    }
}