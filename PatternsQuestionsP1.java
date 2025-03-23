public class PatternsQuestionsP1 {
    public static void main(String[] args) {
        System.out.println("~(\"Patterns Questions in Java Part-I\")~");
        System.out.println("<=(Rectangular Shapes)=>");
        for(int i=0; i<6; i++){
            for(int j=0; j<10; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<6; i++){
        for(int j=0; j<10; j++){
            if(i==0||j==0||i==5||j==9){
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}
