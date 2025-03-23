public class PatternsQuestionsP4 {
    public static void main(String[] args) {
        System.out.println("~(Patterns Questions Part-IV)~");
        System.out.println("<- Half Pyramids With Numbers ->");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
