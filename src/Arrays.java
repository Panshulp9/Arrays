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
        averageNum();
        maxNum();
        minNum();
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
        System.out.println("The sum is: " + sum);
    }
    public void averageNum(){
        int average = 0;

        for(int w = 0; w<nums.length;w++){
            average = (average +nums[w]);
        }
        average = average/nums.length;
        System.out.println("This is the average: " + average);
    }
    public void maxNum(){
        int maxNum = nums[0];
        for(int p = 0; p<nums.length;p++){
            if (nums[p]>maxNum){
                maxNum = nums[p];
            }
        }
        System.out.println("This is the biggest number: " + maxNum);
    }
    public void minNum(){
        int minNum = nums[0];
        for (int u = 0; u<nums.length; u++){
            if(nums[u]<minNum){
                minNum = nums[u];
            }
        }
        System.out.println("This is this smallest number: " + minNum);
    }
}
