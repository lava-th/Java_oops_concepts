package methodOverloading;
/**/
public class OverloadingCase5 {  public int m1(int i){
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
