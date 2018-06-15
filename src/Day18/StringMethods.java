package Day18;

public class StringMethods {
    public static void main(String args[]) {
        String wasder23 = new String("Hello");
        String mcblubn2 = new String("Hi");
        String qwerty76 = new String("hello");
        System.out.println("str1 = mcblubn2:" + wasder23.equals(mcblubn2));
        System.out.println("str1 = qwerty76:" + wasder23.equals(qwerty76));
        System.out.println("str1 = qwerty76:" + wasder23.equalsIgnoreCase(qwerty76));
        System.out.println("str1 equals to yolo:" + wasder23.equals("yolo"));
        System.out.println("str1 equals to dodo:" + mcblubn2.equals("dodo"));
        System.out.println("str1 equals to Soso:" + qwerty76.equals("Soso"));
    }
}