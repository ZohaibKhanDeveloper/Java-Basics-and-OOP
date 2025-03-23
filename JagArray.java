public class JagArray {
    public static void main(String[] args) {
        int[][] jar=new int[3][];
        jar[0]=new int[4];
        jar[1]=new int[3];
        jar[2]=new int[5];
        for(int i=1; i<=jar[0].length; i++){
            jar[0][i-1]=i*2;
        }
        for(int i=1; i<=jar[1].length; i++){
            jar[1][i-1]=i*4;
        }
        for(int i=1; i<=jar[2].length; i++){
            jar[2][i-1]=i*10;
        }
        for(int i=0; i<jar.length; i++){
            for(int j=0; j<jar[i].length; j++){
                System.out.print(jar[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
