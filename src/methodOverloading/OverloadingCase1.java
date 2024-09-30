package methodOverloading;
/*Automatic promotion in overloading is the method resolution if the exact match is not available the compiler wont rise complie time error immediately first it promote argument to next level and will check is there any matched method available are not if it available is not there it promote to the next level
* Byte->short->int->long->float->double
* char->int->long ->float->double*/
public class OverloadingCase1 {
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
       OverloadingCase1 mo=new OverloadingCase1();//refrence type=run time object
        mo.m1();//no argument
        mo.m1(10);//int argument method
        mo.m1(10.34);//double argument method
        mo.m1("hello");//string argument method
        mo.m1('c');//int argument method is display
    }
}
