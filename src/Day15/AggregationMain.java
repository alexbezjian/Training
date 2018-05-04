package Day15;

public class AggregationMain {
    public static void main(String[]args){
        Aggregation2 Aggregation2 = new Aggregation2("wer", "fub", "qwe", 172);
        Aggregation3 Aggregation3 = new Aggregation3("qlib", "spluke", "hudba", Aggregation2);
        System.out.println("kjbfsjbf");
        System.out.println("shfbsfb " + Aggregation3.ret);
        System.out.println("shluba dub dub " + Aggregation3.Aggregation2);
        System.out.println("Sflipdip" + Aggregation3.Aggregation2.blub);


        Aggregation2 dsd = new Aggregation2("fergi","gime", "hif", 4234);
//        AggregationMain AggregationMain = new AggregationMain("fe", 4,);

        Aggregation4 ag4 = new Aggregation4("pooooo", 564, Aggregation2);

        System.out.println("Student age: " + ag4.dub);
        System.out.println("epileptic blun;" + Aggregation4.class) ;
        System.out.println("Student street;" + Aggregation3.ret) ;
    }
}


