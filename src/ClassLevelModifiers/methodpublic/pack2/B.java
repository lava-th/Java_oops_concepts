package ClassLevelModifiers.methodpublic.pack2;

import ClassLevelModifiers.methodpublic.A;

public class B extends C {
    public static void main(String[] args){
        A a=new A();
        B b=new B();//child reference and child object is possible
        //B b1=new C(); //Child reference is parent object is not possible
       C c=new C();//parent reference and parent object is possible
        C c1=new B();//parent reference and child object is possible
        c1.m1Protected();

       c.m1Protected();
       b.m1Protected();




    }
}
