package Day13.superClass;

public class ParentClass {
    public String superString;
    public int someNumber = 100;

    public void display(){
        System.out.println("Display");
    }

    public ParentClass(String superString){
        System.out.println("Call from Parent class");
    }

    public ParentClass(){
        System.out.println("Call from Parent Known args constructor");
    }
}
