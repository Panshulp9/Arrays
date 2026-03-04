public class Star {
    public String color;
    public int points;
    //todo: make a constructor for the star class set default values for color and points

    //todo: make a printInfo that prints the instance variables

    public Star(){
        color = "Royal Blue";
        points = 9;
    }
    public void printInfo(){
        System.out.println("This is the number of points the star has: " + points + ".");
        System.out.println("And the color of the star is: " + color + "!");
    }

}
