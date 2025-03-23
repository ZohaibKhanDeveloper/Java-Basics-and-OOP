public class LoopsInJava {
    public static void main(String[] args) {
        System.out.println("Loops in Java");
        System.out.println("--(First 10 numbers printing using for loop)--");
        for (int i = 0; i < 11; i++) {
            System.out.print(i + "  ");
        }
        System.out.print("\n");
        System.out.println("--(First 10 Even numbers printing using While loop)--");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
            i++;
        }
        System.out.print("\n");
        System.out.println("--(First 10 Odd numbers printing using Do-While loop)--");
        i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
            }
            i++;
        } while (i <= 20);
        System.out.print("\n");
    }
}
