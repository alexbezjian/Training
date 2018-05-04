package HW;

public class Exercise4 {
    public static final double radius = 25.25;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("P = " + perimeter);
        System.out.println("A = " + area);
    }
}
