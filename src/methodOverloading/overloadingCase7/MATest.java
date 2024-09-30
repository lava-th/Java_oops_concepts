package methodOverloading.overloadingCase7;

import inheritance.A;

public class MATest {
    public void m1(Animal a){
        System.out.println("The animal class version");
    }
    public void m1(Monkey m){
        System.out.println("The monkey class version");
    }
    public static void main(String[] args){
        MATest t1=new MATest();
      Animal a1=new Animal();
      t1.m1(a1);
      Monkey mo=new Monkey();
      t1.m1(mo);
      Animal a2=new Monkey();//in overloading method resolution takes place by compiler based on reference type
      t1.m1(a2);

    }
}
