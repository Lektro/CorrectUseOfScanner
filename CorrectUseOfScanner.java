import java.util.Scanner;

public class CorrectUseOfScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // GOOD CODE
        System.out.print("Enter an integer, e.g., 2: ");
        int v1 = input.nextInt();
        System.out.print("Enter a double value, e.g., 7,25: ");
        double v2 = input.nextDouble();

        double sum = v1 + v2;
        System.out.println("Sum of both values equals: " +sum);  // To visualize

        /*
            EXAMPLE OF BAD SCANNER USE

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int v1 = input.nextInt();
        Scanner input1 = new Scanner(System.in); --> BAD CODE (It creates two input objects unnecessarily and may lead to some subtle errors.
        System.out.print("Enter a double value: ");
        double v2 = input1.nextDouble();
         */
    }
}
