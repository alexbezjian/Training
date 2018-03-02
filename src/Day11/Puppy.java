package Day11;

public class Puppy extends Dog{

    String color = "green";

    private String intelligence;
    private int secondage;
    private String favoriteFood;


    public Puppy() {
    }

    public Puppy(String name) {
        System.out.println("Passed Name is" + name);
    }
    void barking() {
        System.out.println("no");
    }


    public String getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(String intelligence){
        this.intelligence = intelligence;

    }

    public int getSecondage() {
        return secondage;
    }
    public void setSecondage(int secondage){
        this.secondage = secondage;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
