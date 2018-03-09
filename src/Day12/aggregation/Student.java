package Day12.aggregation;

public class Student {
    public String name;
    public int age;

    Address address;


    Student(String name, int age, Address address){
        this.name = name;
        this.address = address;
        this.age = age;
    }

}

