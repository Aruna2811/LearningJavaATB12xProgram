import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first side of triangle: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second side of triangle: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third side of triangle: ");
        int num3 = scanner.nextInt();

        // Determine the largest
        int largest;

        if (num1 == num2 && num1 == num2 && num2 == num3) {
            System.out.println("The triangle is equilateral");
        } else if (num1 == num2 || num1 == num2 || num2 == num3) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("scalene");
        }
    }

}