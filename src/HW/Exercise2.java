package HW;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String [] args){
//        sum();
        division();
    }


    public static  void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Write down the first number: ");
        int num1 = input.nextInt();
        System.out.print("Write down the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: " + sum);
    }





    public static void division(){
        Scanner input = new Scanner (System.in);
        System.out.print("Write down the first number: ");
        double a = input.nextInt();
        System.out.print("Write down the second number: ");
        double b = input.nextInt();
        double d = (a / b);
        System.out.println();
        System.out.println("a/b is:" +d);
    }
}





