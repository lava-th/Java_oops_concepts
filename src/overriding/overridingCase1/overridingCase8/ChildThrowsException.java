package overriding.overridingCase1.overridingCase8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildThrowsException extends ParentThrowsException{
    public void m1(){
        System.out.println("child method not having throws exception");
    }
    /*public void m2() throws Exception{//it will get compile time error
        System.out.println("child method  having throws exception");
    }*/
    public void m3() throws IOException{
        System.out.println("child method  having throws IOexception parent has exception");
    }
    /*public void m4() throws Exception{//compile time error
        System.out.println("child method  having throws exception parent has IOexception");
    }*/
    public void m5() throws EOFException, FileNotFoundException {
        System.out.println("child method  having throws EOF exception and FNFE exception parent has IO exception");
    }
    /*public void m6() throws EOFException, InterruptedException {//compile time error
        System.out.println("child method  having throws EOF exception and IE exception parent has IO exception");
    }*/
    public void m7() throws EOFException, NullPointerException {
        System.out.println("child method  having throws EOF exception and Null pointer exception parent has IO exception");
    }
    public void m8() throws ArithmeticException,NullPointerException {
        System.out.println("child method  having throws arithmetic exception and Null pointer exception parent has IO exception");
    }
}
