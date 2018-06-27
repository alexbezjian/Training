package Day19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListColors {
    public static void main(String[] args) {
//        String[] are = new String[5];
//        are [0] = "black";
//        are [1] = "Red";
//        are [2] = "Orange";
//        are [3] = "Yellow";
//        are [4] = "Blue";
//
//        for(String color:are) {
//            System.out.println(color);
//        }



        List<String> color = new ArrayList<>();
        System.out.println(color.size());


        color.add("blue");
        color.add("white");
        color.add("orange");
        color.add("black");
        color.add("yellow");
        color.add("green");
        color.add("red");
        System.out.println("List color  " + color);
        List<String> color2 = new ArrayList<>();
        color2.add("wer");
        color2.add("qwe");
        color2.add("tery");
        color2.add("braw");

        System.out.println("List color2: " + color2);
        color.addAll(color2);
        System.out.println("Lst color new " + color);

        if(!color.isEmpty()) {
//            for(int i = 0; i < color.size(); i++) {
//                System.out.println(i + ". " + color.get(i));
//            }
//            for (String aww: color){
//                System.out.println(aww);
//            }
//            if (color.contains("black")){
//                System.out.println(color);
//            }
//            System.out.println(color.get(0));
//            System.out.println(color.get(1));
//            System.out.println(color.get(2));
//            System.out.println(color.get(3));
//            System.out.println(color.get(4));
//            System.out.println(color.get(5));

            color.set(2, "Black");
            color.set(5, "blue");
            color.remove(5);
            System.out.println(color);
//            Collections.sort(color);

            // to change color's content with color2 content
            Collections.copy(color, color2);
            System.out.println(color);
            System.out.println(color2);
//            Collections.shuffle(color);
//            Collections.shuffle(color2);



        }
    }
}
