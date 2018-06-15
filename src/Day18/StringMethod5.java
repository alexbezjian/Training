package Day18;

public class StringMethod5 {
    public static void main(String[] args) {
        char array[] = {'a', 'b', 'c'};
        float f = 12.213F;
        long l = 1234L;
        double d = 1234123.231234;
        char ch = 'A';

        String str2 = String.valueOf(f);
        String str3 = String.valueOf(l);
        String str4 = String.valueOf(d);
        String str5 = String.valueOf(ch);
        String str6 = String.valueOf(array);
        System.out.println(str6);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


//    public static String string;


        String atmos = new String("dedWdwdc");
        String dolb = new String("Ddwewqqwetg");
        String bulb = new String("qwqddeffffFff");
        System.out.println("Index of B in str1: " + atmos.indexOf('W'));
        System.out.println("Index of B in str1 after 15th char:" + atmos.indexOf('D', 15));
        System.out.println("Indexjjkk:" + atmos.indexOf('F', 30));
        System.out.println("Index of string str2 in str1:" + atmos.indexOf(4));
    }
}