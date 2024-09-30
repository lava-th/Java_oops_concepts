package methodSignature;
/*what is method signature is contain method name and followed by argument types
* And here the return type is int
* Compiler use method signature while resolving method calls
* with in the class two methods with the same signature it is not allowed*/

public class MethodSign {
    public void m1(int i){

    }
    public void m2(String s){

    }

    public static void main(String[] args){
        MethodSign ms=new MethodSign();
        ms.m1(10);
        ms.m2("hello");
    }
}
