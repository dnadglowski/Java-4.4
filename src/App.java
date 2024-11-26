import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length:"); //user enters side length 
        double side = scanner.nextDouble();
        scanner.close();
        //checks if input is valid 
        if (side <= 0) {
            System.out.println("Invalid input. The side length must be positive.");
            scanner.close();
            return;
        }
        double intsqr = side * side; //finds the squared value
        double area = (6 * intsqr)/(4 *  Math.tan(Math.PI/ 6));  //finds area
        double roundedNumber = Math.round(area * 100.0) / 100.0;   //rounds value
        System.out.printf("The area of the hexagon is: %.2f\n", roundedNumber);
    }
}
