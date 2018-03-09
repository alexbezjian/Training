package Day12;

public class Encapsulation extends MyCalculation{
    private String name;
    private String blam;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBlam() {
        return blam;
    }

    public void setAge( int newAge) {
        this.age = age;
    }

    public void setName(String newName) {
        this.name = name;
    }

    public void setBlam( String newBlam) {
        this.blam = blam;
    }
}

