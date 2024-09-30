package exceptionHandling;

public class ThrowVsThrows {
    public static void main(String[] args){
        /*sometimes we can create exception object explicitly we can hand over to the jvm manually. For this we have to use throw keyword.
        * throw new AE("/by Zero")
        * throw-> Hand-Over our created exception object to the JVM manually.
        * new AE("/by Zero")->Creation of arithmetic exception object explicitly.
        * Hence the main objective of throw keyword to hand over our created exception to the JVM manually.
        * Hence the result of the following to programs is exactly same.
        * */
        //System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at exceptionHandling.ThrowVsThrows.main(ThrowVsThrows.java:12)
        /*In this case main method is responsible to create exception object and handover the JVM.*/
        //throw new ArithmeticException("/ by zero");
        ////Exception in thread "main" java.lang.ArithmeticException: / by zero
        //        //at exceptionHandling.ThrowVsThrows.main(ThrowVsThrows.java:14)
        //throw new ArithmeticException("/ by zero explicitly");
        //Exception in thread "main" java.lang.ArithmeticException: / by zero explicitly
        //	at exceptionHandling.ThrowVsThrows.main(ThrowVsThrows.java:17)
        //In this case the programmer create exception handling created explicit and handover the JVM.

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        /* Best use of throw keyword is for user define exception or customized exception./**/
        //throw Test.e;
        throw Test.e1;


    }
}
 /* * case1: throw e if e reference null then we will get null pointer exception*/
class Test{
    static ArithmeticException e=new ArithmeticException();
    static ArithmeticException e1;//Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "exceptionHandling.Test.e1" is null

 }
 //case 2:After throw statement we are not allowed to write any statement directly otherwise we will get compile time error saying unreachable statement.
 class Test3{
     public static void main(String[] args){
         throw new ArithmeticException();
         //System.out.println("hello");//java: unreachable statement

     }
 }

class Test4{
    public static void main(String[] args){
        System.out.println(10/0);
        System.out.println("hello");//java: unreachable statement

    }
}
//case 3:We can use throw keywords for throwable types if we are trying to use for normal java objects we will get compile time error.Saying incompatible types.
class Test1{
    public static void main(String[] args){
        //throw new Test1();//compatible types
        /*found: Test1
        * required:java.lang.Throwable.
        * */
    }
 }
 class Test2 extends RuntimeException{
    public static void main(String[]args){
        throw new Test2();//java: incompatible types: exceptionHandling.Test1 cannot be converted to java.lang.Throwable
    }
 }