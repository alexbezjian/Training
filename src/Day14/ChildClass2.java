package Day14;

public class ChildClass2 extends ParentClass23 {
    public int sdd = 2;

    public ChildClass2(){
        super("asda");
        System.out.println("Call from Child Class 2");
    }
    public void display(){
        System.out.println("call from super" + super.sdd);
        System.out.println("asddqwe" + sdd);
        System.out.println("Call from Child Class 2");
        super.display();


    }
    public static void main(String[] args){
        ChildClass2 childClass2 = new ChildClass2();
        childClass2.display();


    }
}
