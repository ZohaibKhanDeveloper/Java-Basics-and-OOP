public class PatternsQuestionsP3 {
    public static void main(String[] args) {
        System.out.println("~(Patterns Questions Part-III)~");
        System.out.println("<-Triangular Shapes->");
        for(int i=0; i<10; i++){
            //Loop for space
            for(int j=0; j<=9-i; j++){
                System.out.print("  ");
            }
            //Star printing loop
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=9; i>=0; i--){
            //Loop for space
            for(int j=0; j<=9-i; j++){
                System.out.print("  ");
            }
            //Star printing loop
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
