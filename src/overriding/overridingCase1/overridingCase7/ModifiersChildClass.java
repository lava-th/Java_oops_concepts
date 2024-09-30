package overriding.overridingCase1.overridingCase7;

public class ModifiersChildClass extends ModifiersParentClass{
    public void m1(){
        System.out.println("child class public  method and parent as protected");
    }
    protected void m2(){
        System.out.println("Modifier child class and parent as protected method");
    }
    void m3(){
        System.out.println("Modifier parent class and child default method");
    }
    protected void m4(){
        System.out.println("Modifier parent class is default and child method as protected");
    }
    public void m5(){
        System.out.println("Modifier parent class is default and child method as public");
    }
}
