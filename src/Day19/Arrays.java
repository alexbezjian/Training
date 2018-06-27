package Day19;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {
        String[] arr = new String[15];
//        arr("1") = 5;
//        arr[2] = 18;
//        arr[3] = 12;
//        arr[4] = 123;
//        arr[5] = 76;
//        arr[6] = 98;
//        arr[7] = 29;
//        arr[8] = 11;
//        arr[9] = 43;

        arr[0] = "byui";
        arr[1] = "aaaaa";
        arr[2] = "adads";
        arr[3] = "qwerty";
        arr[4] = "wasd";
        arr[5] = "qw";
        arr[6] = "qgr";
        arr[7] = "zaasx";
        arr[8] = "asaq";
        arr[9] = "poiuy";
        arr[10]= "ftgh";
        arr[11]= "uhvg";
        arr[12]= "hyu";
        arr[13]= "qwetdxs";
        arr[14]= "dfvfc";

        arr[1] = "qwe";
        arr[0] = "null";

        for(String str : arr) {
            System.out.println(str);}
//        System.out.println(arr[5]);
        List<String> string = new ArrayList<>();
        System.out.println(string.size());

        string.add("ooooo");
        System.out.println(string.size());
        System.out.println(string.get(0));


//        for(int i= 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        arr[2] = 25;
//
//        for(int i= 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
    }





}
