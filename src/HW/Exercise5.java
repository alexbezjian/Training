package HW;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give first number please: ");
        int num1 = in.nextInt();

        System.out.print("Give second number please: ");
        int num2 = in.nextInt();

        System.out.print("Give third number please: ");
        int num3 = in.nextInt();

        System.out.println("Average =: " +
                (num1 + num2 + num3) / 3);
    }
}

