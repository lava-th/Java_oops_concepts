package exceptionHandling;

public class DefaultExceptionHandling {
    public static void main(String[] args){
        /*Inside a method if any exception occurs the method in which it is raised is responsible to create exception object by including the following information.
        * 1.Name of exception
        * 2.Description of exception.
        * 3.Location at which exception occurs.(Stack Trace)
        * After creating an exception object methods hand ours that object to the JVM .      *
        *  will check weather the method contains any exception handling code are not.
        *If the method doesn't contain exception handling code then JVM terminates that method abnormally and removes corresponding from the stack.
        * Then JVM identify the collar method and checks weather collar method contains any handling code are not.
        * The collar method does not contain handling code then JVM terminates the collar methods abnormally.
        * And removes corresponding entry from the stack this process will be continued until main method.
        * And if main method also doesn't contain handling code then JVM terminates main method abnormally and removes corresponding entry from the stack.
        * Then JVM hand-overs the responsible to the default exception handler, which of the part of JVM.
        * Default exception handler prints exception information in the following format and terminates program abnormally.
        * Exception in thread "xxxx" Name of the exception : description stack trace.
        * */
       // doStuff();
       // doStuff1();
        doStuff2();
        System.out.println(10/0);
    }
    public static void doStuff(){
        domoreStuff();
    }
    public static void domoreStuff(){
        System.out.println(10/0);
    }
    public static void doStuff1(){
        domoreStuff1();
        System.out.println(10/0);
    }
    public static void domoreStuff1(){
        System.out.println("hello");

    }
    public static void doStuff2(){
        domoreStuff2();
        System.out.println("hi");

    }
    public static void domoreStuff2(){
        System.out.println("hello");

    }
    /*In program if at least terminate abnormally then the program is abnormal termination.If all methods terminated normally then only program termination is normal termination.
    * */
}
