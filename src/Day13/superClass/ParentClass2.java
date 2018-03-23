package Day13.superClass;

public class ParentClass2 {
    public String superstring2;
    public int mumbers = 290;
    public void he(){
        System.out.println("hoho");
    }
    public ParentClass2(String superstring2,int numbers){
        System.out.println("Incoming call");
    }
    public ParentClass2(){
        System.out.println("Call from known constructor of parentclass2");
    }
}
