package overriding.overridingCase1;

public class ABtest {
    public static void main(String[] args){
        A a=new A();//parent method
        a.marry();
        B b=new B();//child method
        b.marry();
        A a1=new B();//child method will execute , overriding method it follow the run time polymorphism
        a1.marry();
    }
}
