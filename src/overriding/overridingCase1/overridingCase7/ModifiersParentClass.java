package overriding.overridingCase1.overridingCase7;
/*can't reduce the scope of modifiers in the overriding methods but can increase the scope in overriding
* private<default<protected<public
* For overriding concept private modifier is not applicable*/
public class ModifiersParentClass {
    public void m1(){
        System.out.println("Modifier parent class public method");
    }
    protected void m2(){
        System.out.println("Modifier parent class protected method");
    }
   void m3(){
        System.out.println("Modifier parent class default method");
    }
    void m4(){
        System.out.println("Modifier parent class is default and child method as protected");
    }
    void m5(){
        System.out.println("Modifier parent class is default and child method as public");
    }
}
