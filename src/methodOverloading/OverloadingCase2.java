package methodOverloading;
/*null is valid for string and object argument method
* Object is the parent class and String is the child class
* In overloading the parent argument and child argument the child argument will get the highest priority when compare with parent argument
* suppose child method is not there the parent method will get the chance */

public class OverloadingCase2 {
    public void m1(Object o){
        System.out.println("the object argument method");
    }
//    public void m1(String s){
//        System.out.println("the string argument method");
//    }
    public static void main(String[] args){
        OverloadingCase2 ov=new OverloadingCase2();
        ov.m1(new Object());
        //ov.m1("hello");
        ov.m1(null);
    }
}
