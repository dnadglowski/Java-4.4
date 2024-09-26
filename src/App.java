import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side:");
        double side = scanner.nextDouble();
        double intsqr = side * side;
        double area = (6 * intsqr)/(4 *  Math.tan(Math.PI/ 6));
        double roundedNumber = Math.round(area * 100.0) / 100.0;
        System.out.println("The area of the hexagon is " + roundedNumber);
    }
}
