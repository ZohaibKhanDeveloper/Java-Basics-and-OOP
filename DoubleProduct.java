public class DoubleProduct {
    public static void main(String[] args) {
        double product=1.0;
        for(int i=0; i<args.length; i++){
            product*=Double.parseDouble(args[i]);
        }
        System.out.println("Product is : "+product);
    }
}




