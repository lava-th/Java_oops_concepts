package overriding.overridingCase1.OverridingCase4;

public class ParentChildFinalTest {
    public static void main(String[]args){
        FinalParentClass p1=new FinalParentClass();
        p1.m1();
        FinalChildClass c1=new FinalChildClass();
        c1.m1();
        FinalParentClass p2=new FinalChildClass();
        p2.m1();
    }
}
