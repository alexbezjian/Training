package Day11;

public class Dog {
    private String breed;
    private int age;
    private String color = "black";

    void barking() {
        System.out.println("yes");
    }

    void hungry() {
        System.out.println("all the time");
    }

    void sleeping() {
        System.out.println("Very little");
    }


    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getBreed() {
        return  breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
