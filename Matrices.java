import java.util.Scanner;
public class Matrices {
    public static void inputMatrix(int[][] X){
        Scanner input=new Scanner(System.in);
        for(int i=0; i<X.length; i++){
            for(int j=0;j<X[i].length; j++){
                X[i][j]=input.nextInt();
            }
        }
    }
    public static void showMatrix(int[][] X){
        for(int i=0; i<X.length; i++){
            for(int j=0;j<X[i].length; j++){
                System.out.print(X[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void AddMatrix(int[][] X,int[][] Y,int[][] Z){
        for(int i=0; i<X.length; i++){
            for(int j=0;j<X[i].length; j++){
                Z[i][j]=X[i][j]+Y[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rows,columns;
        System.out.println("<<~ Matrix Addition Program ~>>");
        System.out.print("Enter rows of the matrix : ");
        rows=input.nextInt();
        System.out.print("Enter columns of the matrix : ");
        columns=input.nextInt();
        int[][] A=new int[rows][columns];
        int[][] B=new int[rows][columns];
        int[][] C=new int[rows][columns];
        System.out.println("Enter Matrix A Elements:");
        inputMatrix(A);
        System.out.println("Enter Matrix B Elements:");
        inputMatrix(B);
        AddMatrix(A,B,C);
        System.out.println("<< Matrix A >>");
        showMatrix(A);
        System.out.println("<< Matrix B >>");
        showMatrix(B);
        System.out.println("<<- Sum of Matrices (C=A+B) ->>");
        showMatrix(C);
    }
}
