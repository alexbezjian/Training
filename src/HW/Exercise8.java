package HW;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("give the first number: ");
        number1 = input.nextInt();

        System.out.print("give the second number: ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d\n", number1, number2);
        } else if (number1 != number2) {
            System.out.printf("%d != %d\n", number1, number2);
        } else if (number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        } else if (number1 > number2) {
            System.out.printf("%d > %d\n", number1, number2);
        } else if (number1 <= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        } else if (number1 >= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }
    }
}

