package exceptionHandling;

public class CheckedExceptionVsUncheckedExceptions {
    public static void main(String[] args){
        /*CheckedExceptionVsUncheckedExceptions:The Exceptions which are checked by compiler for the smooth execution of the program are called checked Exception.
        * ex:HallMissingException,PenNotWorkingException,FileNotFoundException e.t.c.
        * In our program chance of rise of checked exception then compulsory we should handle the checked exception. Either by try catch or throws keywords.Otherwise we will get compile time error.
        * The Exceptions which are not checked by compiler weather programmer handling are not such type of exception are called unchecked exception.
        * Ex:ArithmeticException,bombBlastException etc.
        * Note:weather it is checked or unchecked every exception occurs at run time only.There is no chance of occurring any exception at compile time.
        *Note:Run time exception and its child classes, error child classes are unchecked except these remaining are checked.
        * FullyChecked vs PartiallyChecked:A checked exception said to be fully checked.If and only if all its child classes also checked.
        * Ex:Io exception and interrupted exception.
        * A checked exception is said to be partially checked if and only if some of its child classes are unchecked
        * Ex:Exception,Throwable.
        * Note:The only possible partially checked exception in java are: 1.Exception 2.Throwable.
        * Describe the behaviour of the following exception.
        * IOException-->Checked(FullyChecked)
        * RuntimeException-->unChecked
        * InterruptedException-->Checked(FullyChecked)
        * Error-->UnChecked
        * Throwable-->Checked(PartiallyChecked)
        * ArithmeticException-->UnChecked
        * NullPointerException-->UnChecked.
        * Exception-->Checked(PartiallyChecked)
        * FileNotFoundException->Checked(FullyChecked)*/
    }
}
