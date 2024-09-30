package javaOperations;



public class DifferentNewAndnewInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*new vs newInstance()
        * we can use new operator to create an object if we know class name as begining */
        DifferentNewAndnewInstance differentNewAndnewInstance=new DifferentNewAndnewInstance();
        ConditionalOperator conditionalOperator=new ConditionalOperator();
                /*newInstace() is a method present in Class class we can use newInstance() to create object if we don't know class name at begining and it is available at run time*/
        Object o=Class.forName(args[0]).newInstance();
        System.out.println("Object created for : "+o.getClass().getName());
        /*In the case of new operator based on our requirement we can invoke any constructor
        * But new instance() internally called no arg constructor to use newinstance() compulsory corrsponding contain no argument constructor otherwise we will get run time exception instantiation exception
        * while using new operator at run time the corresponding .class file is not available then we will get run tume exception no class def found error:Test */
        //Test t=new Test();
        /*if run time the test class file is not available then we will get run time exception saying no class def found exception:
        * while using new instance method at run time if the corsopnding .class not available then we will get run time exception saying class not found exception*/
        Object o1=Class.forName(args[0]).newInstance();
        /*At run time if test123 is not available then we will get run time exception class not found exception:test123*/

    }

}

