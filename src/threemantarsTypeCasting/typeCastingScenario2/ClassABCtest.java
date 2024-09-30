package threemantarsTypeCasting.typeCastingScenario2;

public class ClassABCtest {
    public static void main(String[] args){
        ClassC c=new ClassC();
        c.m1();
        ((ClassA)c).m1();
        ((ClassB)c).m1();
        ((ClassA)((ClassB)c)).m1();//The methods are override then the method resolution takes place based on run object
        //when all this methods are static then the concept is method hiding. In method hiding the method resolution takes place by compiler based on reference type
//        ClassC c1=new ClassC();
//        ClassC.m1();
//        ClassA.m1();
//        ClassB.m1();
//        ClassA.m1();
    }
}
