package Day14.association;

public class Driver extends Car {
    public String Gender;
    public String mentalhealth;
    public String Name;

    public Driver(String Gender, String name, int ID, String carname){
        super(carname, ID);
        this.Gender = Gender;
        this.Name = name;



    }

}
