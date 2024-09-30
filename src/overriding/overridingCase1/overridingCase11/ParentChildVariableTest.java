package overriding.overridingCase1.overridingCase11;

/*Method overriding concept is applicable for only methods but not variables
* overriding of variable the method resolution is always take care by compiler based on reference type the rule is always same weather the variable is static or not static or instance
* This concept is called variable hiding or shadowing */

public class ParentChildVariableTest {
    public static void main(String[] args){
        System.out.println("parent and child is non static variables ");
        ParentVariable p1=new ParentVariable();
        System.out.println(p1.s);

        ChildVariable c1=new ChildVariable();
        System.out.println(c1.s);
        ParentVariable p2=new ChildVariable();
        System.out.println(p2.s);

        System.out.println("Parent is static and child is non static variables");
        System.out.println(p1.s1);
        System.out.println(c1.s1);
        System.out.println(p2.s1);
        System.out.println("parent is non static and child is static variables ");
        System.out.println(p1.s2);
        System.out.println(c1.s2);
        System.out.println(p2.s2);
        System.out.println("parent and child is static variables");
        System.out.println(p1.s3);
        System.out.println(c1.s3);
        System.out.println(p2.s3);

    }
}
