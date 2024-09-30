package overriding.overridingCase1.overridingcase6;

public class ChildSynchronizedClass extends ParentSynchroniozedClass{
    public  void m1(){
        System.out.println("child class non-synchronized method");
    }
    public synchronized void m2(){
        System.out.println("child class synchronized method");
    }
}
