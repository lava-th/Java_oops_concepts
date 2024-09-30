package overriding.overridingCase1.overridingCase8;

import java.io.EOFException;
import java.io.IOException;

public class ParentThrowsException {
    public void m1() throws Exception{
        System.out.println("the parent method having throws exception");

    }
    public void m2() {
        System.out.println("child method  having throws exception parent has no exception");
    }
    public void m3() throws Exception {
        System.out.println("child method  having throws IOexception parent has exception");
    }
    public void m4() throws IOException {
        System.out.println("child method  having throws exception parent has IOexception");
    }
    public void m5() throws IOException {
        System.out.println("child method  having throws EOFexception and FNFE parent has IOexception");
    }
    public void m6() throws IOException {
        System.out.println("child method  having throws EOFexception and IE exception parent has IOexception");
    }
    public void m7() throws IOException {
        System.out.println("child method  having throws EOF exception and Null pointer exception parent has IO exception");
    }
    public void m8() throws IOException {
        System.out.println("child method  having throws Airthmetic exception and Null pointer exception parent has IO exception");
    }
}
