package inheritance;

public class TestAB {
    public static void main(String[] args){
        A a=new A();
        a.m1();
        //a.m2();//On the parent reference the child specific method you can't call
            B b=new B();
            b.m1();//Child class reference can call the parent class specific method
            b.m2();//with child class reference can call reference class method
        A a1=new B();//parent reference and child object
        a1.m1();
        //a1.m2();//parent reference we can't call child specific method
       // B b1=new A();//child reference we can't hold parent object

    }
}
