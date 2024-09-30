package overriding.overridingCase1.overridingcase6;

public class ParentChildSunchronizedTest {
   public static void main (String[] args){
       ParentSynchroniozedClass p1=new ParentSynchroniozedClass();
       p1.m1();
       p1.m2();
       ChildSynchronizedClass c1=new ChildSynchronizedClass();
       c1.m1();
       c1.m2();
       ParentSynchroniozedClass p2=new ChildSynchronizedClass();
       p2.m1();
       p2.m2();
   }
}
