package Day18;
import java.util.Locale;

public class StringMethods4 {
    public static void main(String[] args) {
        String dert = new String("!@# IS NOT EQUAL TO $%^");
        System.out.println(dert.toLowerCase());
        System.out.println(dert.toLowerCase(Locale.CHINESE));

    }

    public class UpperCaseExample {
        {
            String str = new String("qwert is npt wertoing dqwrw der einstein");
            //Standard method of conversion
            System.out.println(str.toUpperCase());

            System.out.println(str.toUpperCase(Locale.JAPAN));
        }
    }
}
