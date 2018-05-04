package HW;

public class Exercise6 {
    public static void main(String[] strings) {

        final double width = 2.99;
        final double height = 10.34;

        double perimeter = 2*(height + width);

        double area = width * height;

        System.out.printf("P is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("A is %.1f * %.1f = %.2f \n", height, width, area);
    }
}
