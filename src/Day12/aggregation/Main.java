package Day12.aggregation;

public class Main {
    public static void main(String[]args){
        Address address = new Address("as", "wff", "sdf", 23);
        College college = new College("Cantebury", "UK", "hgf", address);
        System.out.println("College information");
        System.out.println("College name " + college.name);
        System.out.println("College address " + college.Address);
        System.out.println("Street " + college.Address.street);


        Address bboo = new Address("Belfast","Ireland", "fewe", 023421124);
        Student Student = new Student("george", 4, bboo);
        System.out.println("Student age: " + Student.age);
        System.out.println("Student address;" + Student.address) ;
        System.out.println("Student street;" + Student.address.country) ;
    }
}
