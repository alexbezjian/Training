package Day13;

public class Main2 {
    public static void main(String[] args) {
        art art = new art(2, "black", 23);
        casual casual = new casual("red", 3, 1029, art);
        System.out.println("Casual computer information");
        System.out.println("Casual computer color " + casual.color);
        System.out.println("Casual computer ram" + casual.ram);
        System.out.println("Version number " + casual.versionnumber);


        gaming gaming = new gaming("crimson red", 1250, 10);
        System.out.println("Gaming color: " + gaming.color);
        System.out.println("Gaming;" + gaming.ram);
        System.out.println("Gaming;" + gaming.versionnumber);

    }
}
