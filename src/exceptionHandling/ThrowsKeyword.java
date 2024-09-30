package exceptionHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class ThrowsKeyword {
    public static void main(String[] args){
        /*If there is a possibility of raising checked exception then compulsory we should handle that checked exception otherwise compile time error saying unreported exception "xxx" must be caught are declared to be thrown.
        * */
//        PrintWriter pe=new PrintWriter("abc.txt");
//        pe.write("hello");
        //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown.
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        //java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
        //we can handle this compile time error by using the following two ways by using try catch.

/*By using throws keyword:we can use throws keyword to delegate responsibility of the exception handling to the collar it may be another method or jvm then collar method is responsible to handle that exception.
* */

    }
}
class Test12{
    public static void main(String[]args) throws InterruptedException {
        Thread.sleep(1000);
    }
}
/*Throws keyword required for only for checked exceptions usage of throws keywords for unchecked exceptions there is no use are impact.
* Throws keyword required only to  convince for compiler and usage of throws keyword doesn't prevent abnormal termination of program.
* */
class PratciseTest{
    public  static void main(String[] args)throws InterruptedException {
        oneDoStuff();
    }
    public static void oneDoStuff()throws InterruptedException{
        doMoreStuff();
    }
    public static void doMoreStuff()throws InterruptedException{
//        try {
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//
//        }
        Thread.sleep(1000);
    }

}
/*In the above programe if we remove atlease one throws statment than the code won't compile.
*  Throws clause:1.we can use ti delegate responsibility of exception handling to the caller(it may be method or JVM)
* 2.It is required only for checked exceptions and usage of throws keyword for unchecked exceptions there is no impact.
* 3.It is required only to convience compiler and usage of throws does not prevent abnormal termination of program.
* Note:It is recommended to use try catch over throws keyword.
* case1:we can use throws keyword for methods and constructors but not for classes.
* */
class Testwee{
    Testwee()throws Exception{

    }
    public void m1()throws Exception{

    }
}
/*CASE 2:we can use throws keyword only for thrwoable types if we are trying to use for normal java classes than we will get compile time error saying incompatable types.
* */
class Test56{
    //public void m2() throws Test56{//java: incompatible types: exceptionHandling.Test56 cannot be converted to java.lang.Throwable

    }

class Demo extends RuntimeException{
    public void m4() throws Demo{

    }

}
/*Case 3: */
class Demo1{
    public static void main(String[]args){
        //throw new Exception();//Compile time error unreported exception java.lang.Exception; must be caught or declared to be thrown
    }
}
class Demo2{
    public static void main(String[]args){
        throw new Error();//RunTime Exception: Exception in thread "main" java.lang.Error at Demo2.main()

    }
}
/*Case4:within the try block if there is no chance of raising a exception then we can't write catch block for that exception otherwise we will get compile time error saying exception xxxx is never thrown in body of crossponding try statement.
* But this rule is applicable only for fully checked exception.*/
class CaseOne{
    public static void main(String[] args){
        try {
            System.out.println("Hello");
        }catch(ArithmeticException e){

        }
    }
}

class CaseTwo{
    public static void main(String[] args){
        try {
            System.out.println("Hello");
        }catch(Exception e){

        }
    }
}
//class CaseThree{
   // public static void main(String[] args){
//        try {
//            System.out.println("Hello");
//        //}catch(java.io.IOException e){//Exception 'java.io.IOException' is never thrown in the corresponding try block
//
//        }
//    }
//}
//class CaseFour {
   // public static void main(String[] args) {
//        try {
//            System.out.println("Hello");
//        }catch(java.io.InterruptedIOException e){//Exception 'java.io.InterruptedIOException' is never thrown in the corresponding try block
//
//        }
//    }
//    }

//    class CaseFive {
//        public static void main(String[] args) {
//            try {
//                System.out.println("Hello");
//            } catch (Error e) {//Exception 'java.io.IOException' is never thrown in the corresponding try block
//
//            }
//
