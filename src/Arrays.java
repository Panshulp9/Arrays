public class Arrays {
    public int[] nums;

    public static void main(String[] args) {
        System.out.println("Welcome to the awesome world of arrays!");
        new Arrays();
    }
    public Arrays (){
        nums = new int[10];
        //todo: fill the array with random numbers 1-100
        for(int y = 0; y< nums.length;y++){
            int randomNum = (int)(Math.random()*100)+1;
            nums[y] = randomNum;
        }

        System.out.println(nums[0]);
        displayArray();
        sumArray();
    }
    //todo: make a display Array method that prints everything in the array nums.

    public void displayArray(){
        for (int x = 0; x < nums.length; x++){
            System.out.println("this is bucket "+ x + ": " + nums[x]);
        }
    }
    //todo: make a method called sumArray that adds all the numbers in the nums together
    //todo: sout the total number

    public void sumArray(){
        int sum = 0;
        for(int q = 0; q< nums.length;q++){
            sum = sum + nums[q];
        }
        System.out.println("The sum is " + sum);
    }
}
