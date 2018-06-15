package Day16;

public class Stringexample {
    public static void main(String[] args) {

//        System.out.println("A" + "B");
//
//        System.out.println(1+3);
//        System.out.println("1" + "3");
//        System.out.println(1+3 + "9");

        String name = "ASDF";
        name.replace("A", "p");
        System.out.println(name);


        String name2 = "POIU";
        String name3 =  name2.replace("P", "R");
        System.out.println(name3);

    }
}
