import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet? ");
        int width = input.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        //calculate the area in square feet
        int f2 = width * length;
        //convert square feet to square meters
        double m2 = f2 * 0.09290304;
        System.out.printf("The area is \n%d square feet \n%f square meters\n", f2, m2);
    }
}
