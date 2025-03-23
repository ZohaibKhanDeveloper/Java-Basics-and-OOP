public class PatternsQuestionsP2 {
    public static void main(String[] args) {
        System.out.println("~(\"Patterns Questions in Java Part-II\")~");
        System.out.println("<~(Tringular Shapes)~>");
        for(int i=0; i<10; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        System.out.println("");
        for(int i=10; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
