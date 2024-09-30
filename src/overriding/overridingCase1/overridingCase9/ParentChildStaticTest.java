package overriding.overridingCase1.overridingCase9;
/*But the different between the overriding and method hiding it is method hiding the method resolution is always take care by compiler based on reference type*/
public class ParentChildStaticTest {
    public static void main(String[] args){


        ParentStaticClass.m3();

        ChildStaticClass.m3();

       ParentStaticClass.m3();

    }
}
