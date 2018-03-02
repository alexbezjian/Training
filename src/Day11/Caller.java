package Day11;

public class Caller {

    public static void main(String[] args) {
        Puppy mypuppy = new Puppy("argd");
        mypuppy.barking();


        mypuppy.setFavoriteFood("fish");
        mypuppy.setIntelligence("aed");
        System.out.println(mypuppy.getFavoriteFood());
        System.out.println(mypuppy.getIntelligence());



        System.out.println(mypuppy.color);


//        Dog dog = new Dog();
//        System.out.println(dog.getColor());
//        dog.setColor("red");
//        System.out.println(dog.getColor());

    }
}
