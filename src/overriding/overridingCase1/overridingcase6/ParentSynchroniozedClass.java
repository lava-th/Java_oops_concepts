package overriding.overridingCase1.overridingcase6;

public class ParentSynchroniozedClass {
    public synchronized void m1(){
        System.out.println("parent class synchronized method");
    }
    public  void m2(){
        System.out.println("parent class non-synchronized method");
    }
}
