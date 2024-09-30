package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        /*Introduction ExceptionHandling: An unexpected unwanted event distribution normal flow of the program is called exception.
         * ex:tire punctured exception ,sleeping exception and file not found exception.
         * It highly recommended to handle exceptions and main objective of exception handling is graceful termination of the programme.
         * Exception handling does not mean repair an exception we have to provide alternative way to continue rest of the programme normally is concept of exception handling.
         * For example our programming requirement is to read data from remote file locate at london at run time london file is not available our programme should not be terminated abnormally we have to provide some local file to continue rest of the normally.
         * This way of defining alternative nothing but exception handling.
         * try{
         * read data from remote file locating at london.
         * }
         * catch(FileNotFountException e){
         * use local file and continue rest of the programme normally.
         * }
         * RunTime Stack Mechanism:
         * For every thread JVM will create a run time stack each and every method called performed by that thread will be stored in the corresponding stack. Each entry in the stack is called stack frame or activation record.After completion of every method called from the stack will be removed after completing all methods called the stack will become empty and that empty stack will be destroyed by the Jvm just before terminating the thread.
         *
         * */
        doStuff();
    }
        public static void doStuff(){
            domoreStuff();
        }
        public static void domoreStuff(){
            System.out.println("Hello");
        }





/*RunTime Stack Mechanism:*/
/*Here the run time stack for main thread is empty.
* And the main() method is stack frame activation record will be there.
* And after the main() method and doStuff() is added.
* After that main() method,doStuff() and domoreStuff() is added.
* After domoreStuff is removed after called to hello and only dostuff() and main() method is there.
* And after main() method is will be there.
* After last this empty stack will be destroyed by JVM.
* Everything goes fine in the flow */


}
