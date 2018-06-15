package Day18;

public class StringMethod6 {
    public static void main(String[] args) {
        String string = new String("qwer");
        String string2 = new String("poulh");

        if (!string.isEmpty()){
            if (string.contains("q")) {
                System.out.println("contains the character Q");

            }
            if (string.equalsIgnoreCase(string2)){
                System.out.println("String are equal");
            }
            if (string.startsWith("qwe")){
                System.out.println("String starts with qwe");
            }
        }






    }
}
