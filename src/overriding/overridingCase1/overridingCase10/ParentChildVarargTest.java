package overriding.overridingCase1.overridingCase10;

public class ParentChildVarargTest {
    public static void main(String[] args){
        ParentVarargMethods p1=new ParentVarargMethods();
        p1.m1(10,20,30);
        ChildVarargMethods c1=new ChildVarargMethods();
        c1.m1(10,2);
        ParentVarargMethods p2=new ChildVarargMethods();
        p2.m1(45,89,24,890);
        //Method overloading
        p1.m2(10);
        c1.m2();
        p2.m2(10);
    }
}
