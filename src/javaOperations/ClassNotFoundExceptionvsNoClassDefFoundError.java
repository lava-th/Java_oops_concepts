package javaOperations;

public class ClassNotFoundExceptionvsNoClassDefFoundError {
    public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*for hard coded class names, at run time if the crossponding .class file is not available then we will get run time exception no class def found error,which is unchecked */
        //Test t=new Test();
        /*At run time if test .class file is not available we will get run time exception by saying
        * for dynamically provide class name at run time the crossponding is not available then we will get run time exception by saying, checked exception*/
        Object o=Class.forName(args[0]).newInstance();
        /*java test Student at run time if stundent .class not available then we will get run time exception saying class not found exception:Student*/
        /*what is the different between instanceof vs isInstanceof()
        * we can use instanceof is the operator of to check the operator is the particular object are not*/
        Thread t=new Thread();
        System.out.println(t instanceof Runnable);
        /*Java Test Runnable -------output:False
        * Java Test String  ----output:False*/
        /*Instanceof is an operator in java we can use Instanceof to check weather the given object is of particular type are not and we know the type at the begining
        * isInstance() is a method present in java.lang.Class we can use isInstance() method to check weather the given object is of particular type are not and we don't the type at the begining and it is available dynamically at run time
        * isInstance() is method equivalent of instanceof operator*/
    }
}
