package Day13.superClass;

public class Baby extends ParentClass2 {
    public int mumbers2 = 34;

    public Baby(){
        super("kk", 7);
        System.out.println("Call from Baby");
    }

    public void he(){
        System.out.println("Calling" + super.mumbers);
        System.out.println("Varubials" + mumbers2);
        System.out.println("Call from baby class");
//        super.he();
    }

    public void callMethods(){
        he();
        super.he();
    }

    public static void main(String[]args){
        Baby baby = new Baby();
        baby.callMethods();
    }
}
