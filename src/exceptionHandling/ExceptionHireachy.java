package exceptionHandling;

public class ExceptionHireachy {
    public static void main(String[] args){}
/*Throwable class as route for java exception hire achy.
* Throwable class contain two hire achy 1.Exception 2.Error.
* Exception:Most of the times exception are caused by our program and these are recoverable.
* If ever program requirement is to read data from remote file locating at london at run time.
* If remote file is not available then we will get run time exception saying file not found exception.
* If file not found exception occur we can provide local file and continue rest of the programme normally.
* try{
* read data from remote file locate at london
* }
* catch(file not found exception e){
* use local file and continue rest of the programme normally
* }
* Error:Most of the time errors are not caused by our programme and these are due to lack of system resources.
* Errors are non recoverable.
* For example if out of memory occur being programmer we can't do anything and the programme will be terminated abnormally.
* System admin and server admin is responsible to increase heat memory.
* Throwable->Exception,Error.
*
* Exception->RunTimeException,IoException,ServletException,RemoteException,InterruptedException...
* RunTimeException->AirthmeticException,NullPointerException,ClassCastException,IndexOutOfRandomException.
* IndexOutOfRoundsException->ArrayIndexOutOfBoundException,StringIndexOutOfBoundException.
* IllegalArgumentException->NumberFormatException.
* IoException->EOFException,FileNotFoundException,InterruptedIoException.
* Error->VMError,AssertionError,ExceptionInitializeError etc...
* VMError->StackOverFlowError,OutOfMemoryError.
* */
}

