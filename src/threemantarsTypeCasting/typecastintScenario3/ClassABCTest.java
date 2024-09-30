package threemantarsTypeCasting.typecastintScenario3;

public class ClassABCTest {
    public static void main(String[]args){
        ClassC c=new ClassC();
        System.out.println(c.x);
        System.out.println(((ClassB)c).x);
        System.out.println(((ClassA)((ClassB)c)).x);
        //Here the variable acts as overloading the method resolution takes place by compiler based on reference type
    }
}
