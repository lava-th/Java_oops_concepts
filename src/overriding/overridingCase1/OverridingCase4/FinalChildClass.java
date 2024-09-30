package overriding.overridingCase1.OverridingCase4;
/*Parent class is final and child class is final or non final the overriding method is not applicable
* Parent class is non final and child class is final overriding is applicable*/
public class FinalChildClass extends FinalParentClass {
    public final void m1(){
        System.out.println("final method child class");
    }
}
