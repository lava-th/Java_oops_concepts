package overriding.overridingCase1.overridingCase10;

public class ChildVarargMethods extends ParentVarargMethods{
    public void m1(int...i){
        System.out.println("child var-arg method");
    }
    public void m2(int...i){
        System.out.println("child var-arg method");
    }
}
