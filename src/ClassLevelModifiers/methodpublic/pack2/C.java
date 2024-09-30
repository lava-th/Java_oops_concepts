package ClassLevelModifiers.methodpublic.pack2;

import ClassLevelModifiers.methodpublic.A;

public class C extends A {

    protected void m1Protected(){
        System.out.println("this is protected method");
    }
    public static void main(String[]args){
        C c=new C();//child reference is only access the protected method of other package
        c.m1();
        A a=new A();//The protected access in A class in another package so reference of parent class is not possible
       // a.m1();
        C c1= (C) new A();//class casting error
        c1.m1();
        A a1=new C();//other packages methods parent reference is not possible for the protected methods
       // a1.m1()
    }
}
