import java.util.Scanner;
public class InputsInJava {
    public static void main(String args[]){
        System.out.println("JAVA INPUTS PROGRAM");
        System.out.println("Enter Your Name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine(); 
        //nextInt(); next(); nextFloat(); etc.
        System.out.println("Enter Your Your age : ");
        Scanner sc2=new Scanner(System.in);
        int age=sc2.nextInt();
        System.out.println("Hello "+name+" Your age is "+age);
        sc2.close();
        sc.close();
    }
}
