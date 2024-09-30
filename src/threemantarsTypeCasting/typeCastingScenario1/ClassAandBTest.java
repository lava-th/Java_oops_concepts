package threemantarsTypeCasting.typeCastingScenario1;

public class ClassAandBTest {
    public static void main(String[] args){
        ClassB b=new ClassB();

        b.m1();
        b.m2();
        ((ClassA)b).m1();
        //((ClassA)b).m2();//It is ClassA type m2 method is not there Class A a=new ClassB();
    }
}
