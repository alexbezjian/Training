package Day12;

public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }

    public static void main(String args[]) {
        int a = 24536, b = 1000;
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
