package Day13.superClass;

public class ChildClass extends ParentClass {
    public int someNumber = 20;

    public ChildClass(){
        super("ooooo");
        System.out.println("Call from child class");
    }

    public void display(){
        System.out.println("Super call  " + super.someNumber);
        System.out.println("Local variable  " + someNumber);
        System.out.println("Call from Child class");
        super.display();
    }

    public static void main(String[]args){
        ChildClass childClass = new ChildClass();
        childClass.display();

//        System.out.println(super.someNumber);
    }
}
