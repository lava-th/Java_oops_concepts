package overriding.overridingCase1.overridingCase8;
/*Throwable is the root of the all java exceptions and errors
* Throwable contain two child classes exception and error
* Under Exception child classes contain RuntimeException,IO exception,IE(interrupted) exception and servlet exception e.t.c
* under Runtime exception contain child classes are arithmetic exception,null point exception,class cast exception e.t.c
* under IO exception child classes contain final not found exception and EOF exception e.t.c
* under Error exception Virtual memory exception e.t.c
* under Virtual memory exception child classes contain out of main memory error and stack over flow error e.t.c
* In this which are checked exception and unchecked exception
* Run time exception and its child classes and error and its child classes are unchecked exception compiler never checked you are handling are not
* Excepted this all remaining are by default checked exception
* The rule in overriding is if the child class method throws any  checked exception the  compulsory parent class method should throw same checked exception or its parent exception otherwise compile time error
* Unchecked exception is no rule in overriding can use anywhere and any number of times
*  */

public class ParentChildThrowsExceptionTest {
    public static void main(String[] args) throws Exception {
        ParentThrowsException p1=new ParentThrowsException();
        p1.m1();
        ChildThrowsException c1=new ChildThrowsException();
        c1.m1();
    }
}
