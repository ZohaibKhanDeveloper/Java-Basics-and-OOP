public class VarLengthArgs{
    public static void add_numbers(int...nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        System.out.println("Sum of numbers is "+sum);
    }
    public static void main(String[] args) {
        add_numbers(23,45,36);
        add_numbers(25,34);
        add_numbers(new int[] {2,3,4,5,6,7});
        int[] numbers={19,20,24,35,66};
        add_numbers(numbers);
    }
}