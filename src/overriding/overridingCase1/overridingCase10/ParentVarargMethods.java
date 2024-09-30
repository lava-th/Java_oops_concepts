package overriding.overridingCase1.overridingCase10;

public class ParentVarargMethods {
    public void m1(int...i){
        System.out.println("parent");
    }
    public void m2(int i){
        System.out.println("parent without var arg method only general integer");
    }
}
