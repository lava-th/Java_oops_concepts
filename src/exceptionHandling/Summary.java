package exceptionHandling;

public class Summary {
    public static void main(String[] args) {
        /* Try To maintain risky code.
         * Catch to maintain exception handling code.
         * Finally block to maintain clean up code.
         * Throw keyword to hand over our created exception object to the JVM manually.
         * Throws Keyword to delegate responsibility of the exception handling to the caller.
         *
         * //////////////////////////////////////////////////////////////////
         * various possible compile time error in exception handling:
         *
         * 1.unreported exception xx; must be caught or declared to be thrown
         * 2.Exception xxx has already been caught
         * 3.Exception xxx is never thrown in body of corresponding try statement.
         * 4.unreachable statement
         * 5.incompatible types
         * found:Test
         * required:java.lang.Throwable
         * 6.try without catch
         * 7.catch without try
         * 8.finally without try */

        /*Customized or user defined exception:
         * Sometimes to meet program a requirements we can define our own exceptions such type of exception are called customized or user defined exceptions.
         * Examples:TooYoungException,TooOldException,InsufficientFundsException etc.*/
    }
}
    class TooYoungException extends RuntimeException{
        TooYoungException(String s){
            super(s);//to make description available to default exception handler.

        }
    }

    class TooOldException extends RuntimeException{
        TooOldException(String s){
            super(s);

        }
    }
    class custException{
        public static void main(String[] args){
            int age=Integer.parseInt(args[0]);
            if(age>60){
                throw new TooYoungException("Your age is already crossed marriage age..no chance of getting marriage.");
            }
            else if(age<18){
                throw new TooOldException("plz wait some more time ..You will get best match soon");

            }
            else{
                System.out.println("you will get match details soon by email..!");
            }

        }

}
/*note:Throw  keyword the best suitable for user defined or customized exception but not for predefined exception.
* It is highly recommended to define customized exception as unchecked that is we have to extends runtime exception but not exception*/



/*Top 10 exception based on the person who is raising an exception all exception are divided into two categories:
* Jvm exception,programmatic  exception.
* The exception which are raised automatically by JVM whenever a particular event occurs are called JVM exception.
* Example:Arithmetic exception, null pointer exception etc.
* Programmatic exception: The exception which are raised explicitly either by programmer or API developer to indicate that something goes wrong are called programmatic exceptions.
* example:To old exception ,illegal argument exception etc
* 1.Array index out of bounds of exception. It is the child class of runtime exception and hence it is unchecked.
* Raised automatically by JVM whenever we are trying to access array element without of arrange index.
* Example:int[] x=new int[4];
* int[0];//0
* sout(int[10])//array index out of bound exception;
* sout(int[-10])//array index out of bound exception;
* 2.Null point exception:it is the child class of runtime exception and hence it is unchecked null pointer exception.
* Raised automatically by JVM whenever we are trying to perform any operation on NULL
* String s=null;
* sout(s.length)//Null pointer exception.
* 3.Class cast Exception:It is the child class of runtime exception and hence it is unchecked.
* Raised automatically by JVM whenever we are trying to typecast parent object to child type.
* String s=new String("Durga");
* Object o=(Object) s;//valid.
*
* Object o=new Object();
* String s=(String)o;//not valid class cast exception.
*
* Object o1=new Object();
* String s=(String)o1;//valid
*
* 4.Stack overflow error:It is the child class of error, and hence it is unchecked.Raised automatically by JVM.Whenever we are trying to perform recursive method call.
* public static void m1(){
* m2();
* }
* public static void m2(){
* m1();
* }
* public static void main(String[] args){
* m1();
* }//Run time exception stack over flow error.
*
*5.NoDefError :It is the child class of error and hence it is unchecked.
* Raised automatically by JVM .Whenever JVM unable to find required .class file.
* Example:JVM test If test.class is not available than we will get runtime exception saying no class DefFoundError:Test.
* 6.Exception in initialized error:It is the child class of Error and hence it is unchecked.Raised automatically By JVM if any Exception occurs while executing static variable assignment and static blocks.
* class Test{
* static int x=10/0;
* }//Exception in initializer Error caused by java.lang.AE/by Zero.
* class Test{
* static {
* string s=10;
* sout(s.length());
* }
* }//Exception in initialized error caused by:java.lang.nullPointer Exception.
*
*
*
* 7.Illegal Argument Exception:It is the child class of runtime exception.And Hence it is unchecked.Raised explicitly either by programmer or by API develper to indicate that a method has been invoked illegal argument.
* Example:The valued range of thread priority is 1 to 10 if we are trying to set the priority with other value then we will get runtime exception saying illegal argument exception.
* Thread t=New Thread();
* t.setPriority(10);
* t.setPriority(15);//illegal argument exception.
*
* 8.Number format Exception:It is the direct child class of illegal argument exception.Which is the  child of runtime exception and hence it is unchecked.
* Raised explicitly either by programmer or by API developer to indicate that we are trying to convert string to number.And the string is not properly formatted.
* int i=Integer.ParseInt("10");
* int i=Integer.ParseInt("ten");//RE:Number format exception.
*
* 9.Illegal state exception:It is the child class of runtime excepotion and hence it is unchecked.Raised expicitly either by programmer or by API developer to incdicate that a method as been invoked at wrong time.
* Example:After starting of a thread we are not allowed to restart the same thread again otherwise we will get runtime exception saying illegal thread state exception.\
* Thread t=new Thread();
* t.start();-------------t.start();//illegal thread state exception.
*
* 10.AssertionError:It is the child class of error and hence it is unchecked.Raised explicity by the programmer or By API developer to incdicate that assert statements fail.
* Example:Assert(x>10);
* If x is not greater than 10 then we will get run time exception assertion error.
*
*
* Exception/Error:ArrayIndexOutOfBoundsException,NullPointerException,ClassCastException,StackOverflowError,NoClassDefFoundError,ExceptionInInitializerError are raised automatically by JVM and hence these are JVM exceptions.
* ExceptionInInitializerError,IllegalArgumentException,NumberFormatException,IllegalStateException,AssertionError are raised explicitly either by programmer(or) by API developer and hence these are programmatic exception.
*
*
* 1.7 version enhancement with version to exception handling in following two concepts introduced:
* 1.try with Resources.
* 2.multi catch block.
* 1.try with Resources:Until 1.6 version it is highly recommended to write finally block to close resources which are open as the part of try block.
* Buffer reader br=null;
* try{
* br=new BufferReader(new FileReader("input.txt"));
* //use br based on our requirement.
* }
* catch(IoException e){
* //Handling code
* }
* finally{
* if br(!=null){
* br.close();
* }
* }
* In this approach are
* 1.Compulsory programmer required to close resources inside finally block it increases complexity of programming.
* 2.we have to write finally block compulsory and hence it increases length of the code and reduces readability.
* To overcome above problems some people introduced Try with resources in 1.7 version.
* The main advantage of try with resources is what ever resources we open as the part of try block will be closed automatically ones control reaches end of try block either normally or abnormally and hence we are required to close explicitly so that complexity of the programming will be reduced.
* we are required to write finally block so that length of the code will be reduced and readability will be improved.
*
* 1.7 version
* try(BufferReader br=new Br(new FileReader("input.txt"))){
* //use br based on our requirement
* br will close automatically once control reaches end of try block either normally or abnormally and we are not responsible to close explicitly.
* }
* catch(IO Exception e){
* //handling code.
* }
*
*
*
*
* conclusion:
* 1.We can declare multiple resources these resources should be separated with the semicolon.
* Example:try{
* (FileWriter fw=new FileWriter("output.txt");FileReader fr=new FileReader("input.txt"))
* }
* 2.All resources should be auto closable resource.A resource said to autocloseable if only if crossponding class implements java.lang.autocloseable interface.All IO related resources, data based related resources and Network related resources are already implemented autocloseable interface.
* Being a programmer we are not required to do anything just we should ever the point.
* Autocloseable interface came in 1.7 version, and it contains only one method that is closed.
* public void close();
* 3.All resources reference variables are implicitly  final and hence with in the try block reassignment otherwise we will get compile time error.
* public static void main(String[] args){
* try(BufferReader br=new BufferReader(new FileReader("input.txt")))
* {
* //br=new BufferedReader(new FileReader("output.txt"));//CompileTimeError:Auto closeable resource br may not be assigned.
* }
* 4.until 1.6 version try should be associated with either catch or finally but 1.7 version onlwards we can take only try with resources without catch or finally.
* try(R){
* }
* The main advantage try with resources is we are not required to write finally block excplicitly because we are not required to close explicitily. Hence 1.6 version finally block is hero but from 1.7 version onwards it is dummy and becomes zero.
*
*5. Multi catch block:until 1.6 version even though multiple different exception having same handling code for ever exception type we have to write a separate catch blocks.It increases lenght and reduces readbility.
* try{
* }
* catch(AE e){
* e.printStackTrace();
* }
* catch(IOException e){
* e.printStackTrace();
* }
* catch(NPE e){
* sout(e.getMessage());
* }
* catch(InterruptedException e){
* sout(e.getMessage();
* }
* to overcome this problem some people introduced multi catch block in 1.7 version.
* According to this we can write a single catch block that can handle multiple different type of exception.
* try{
* }
* catch(AE/IOException e){
* e.printStackTrace();
* }
* catch(NPE/InterruptionException e){
* e.getMessage();
* }
*
* the main advantage of this approach length of the code will be reduced and readability will be improved.
*
* */
//try{
//    System.out.println(10/0);
//    String s=null;
//    System.out.println(s.lenth());
//        }catch(ArithmeticException | NullPointerException e){
//    System.out.println(e)
//        }

//In the above example weather raised exception is either arithmetic exception and null point exception the same catch block  listen.
/*In multi catch block there should not be relation between exception types (either child to parent)or (parent to child) or same type otherwise we will get compile time error
* try{
* }catch(AE|Exception e){
* sout(e)
* }//compile time error.
* alternatives in a multi catch statement cannot be related by subclasses.
*
*
*
* 6.Exception Propagation:Inside a method if an exception is raised and if we are not handling that exception then exception object will be propagated to collar then collar method responsible to handle exception.
* This process is called exception propagation.\
*
* m1(){
 * m2();
 * }
 * m2(){
 * sopln(10/0);
 * }
*
*
* 7.ReThrowing Exception:we can use this approach to convert one exception type to another exception type
*  try{
* sopln(10/0)
* }
* catch(AE e){
* throw new Null pointerException();
* }
*
* */