package methodOverloading;
/*Method overloaded is said if the methods having the same name but different arguments type
* Below methods all are overloaded methods
* In  overloading method resolution always takes care compile based on reference type not based on runtime
* overloading is alo called compile time polymorphism or static polymorphism or Early binding*/

public class MethodOverl {
    public int m1(int i){
        System.out.println("int argument method");

        return i;
    }
    public String m1(String j){
        System.out.println("String argument method");

        return j;
    }
    public double m1(double k){
        System.out.println("double argument method");

        return k;
    }
    public void m1(){
        System.out.println("no argument method");

    }
    public static void main( String[] args){
        MethodOverl mo=new MethodOverl();//refrence type=run time object
        mo.m1();//no argument
        mo.m1(10);//int argumethod
        mo.m1(10.34);//double argu method
        mo.m1("hello");//string argu method
    }
}
