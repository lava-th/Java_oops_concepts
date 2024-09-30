package overriding.overridingCase1.overridingCase7;
/*private<default<protected<public*/

public class ParentChildModifiresTest {
    public static void main(String[] args){
        ModifiersParentClass p1=new ModifiersParentClass();
        p1.m1();
        p1.m2();
        p1.m3();
        p1.m4();
        p1.m5();
        ModifiersChildClass c1=new ModifiersChildClass();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
        c1.m5();


    }
}
