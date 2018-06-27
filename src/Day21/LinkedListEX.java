package Day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListEX {
    public static void main(String[] args){
        ArrayList<String> bleeq = new ArrayList<>();
        bleeq.add("weqwe");
        bleeq.add("wertty");



        LinkedList<String> linked= new LinkedList<>();

        linked.add("Hello");
        linked.add("goodbye");
        linked.add("terty");
        linked.add("sweet");
        linked.add("werqw");
        linked.add("hi there");

        System.out.println("linked init "+linked);
        bleeq.addAll(linked);
        System.out.println(bleeq);

        Collection collection = new ArrayList();
        collection.add("helwwe");
        collection.remove("terty");
        ((ArrayList) collection).get(0);
        collection.stream();
        collection.add("yoiuerty");
        linked.push("sweet");
        System.out.println("List before rem " + linked);
        linked.removeFirst();
        System.out.println("List rem first " + linked);
        linked.removeLast();
        System.out.println("List" + linked);
        linked.addFirst("qawercasd");
        System.out.println("List after add first " + linked );
        System.out.println((" With size" + linked.size()));
        System.out.println("List final " + linked);

        linked.addAll(1, collection);

        System.out.println(linked);



     }
}
