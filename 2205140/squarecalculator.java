import java.util.Scanner;

public class squarecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = calculateSquare(number);

        System.out.println("The square of " + number + " is: " + square);
    }

    private static double calculateSquare(double num) {
        return num * num;
    }
}