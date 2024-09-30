package threemantarsTypeCasting.typecastingExample;

public class ParentChildSubChildTest {
    public static void main(String[] args){
        Base2ChildClass base2ChildClass=new Derv4SubchildBase2Class();
        Derv4SubchildBase2Class b1=(Derv4SubchildBase2Class)base2ChildClass ;
       b1.m7();
       b1.m1();
       b1.m3();
       //Base1ChildClass b1=(Base1ChildClass) base2ChildClass;//compile time error
       Base2ChildClass b2=(Base2ChildClass) base2ChildClass;
       b2.m3();
       b2.m1();

       //ObjectParentClass o=(Derv3SubChildBase2Class) base2ChildClass;//run time error
       //Base2ChildClass b3=(Base1ChildClass) base2ChildClass;//compile time error
        System.out.println(b1==b2);//here the object is same but here the reference variable of object is different
    }
}
