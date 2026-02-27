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
        maxIndex();
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
        double add = 0.0;
        double average = 0.0;

        for(int w = 0; w<nums.length;w++){
            add = (add +nums[w]);
        }
        average = add/nums.length;
        System.out.println("This is the average: " + average);
    }
    public void maxNum(){
        int max = nums[0];
        for(int p = 0; p<nums.length;p++){
            if (nums[p]>max){
                max = nums[p];
            }
        }
        System.out.println("This is the biggest number: " + max);
    }
    public void minNum(){
        int min = nums[0];
        for (int u = 0; u<nums.length; u++){
            if(nums[u]<min){
                min = nums[u];
            }
        }
        System.out.println("This is this smallest number: " + min);
    }
    //todo: make a method called maxIndex that finds the index aka bucket label that has the maximum number

    public void maxIndex(){
        int maxInd = nums[0];
        int index = 0;
        for(int t = 0; t<nums.length;t++){
            if (nums[t]>maxInd){
                maxInd = nums[t];
                index = t;
            }

        }

        System.out.println("This is the biggest bucket: " + index );
    }
}
