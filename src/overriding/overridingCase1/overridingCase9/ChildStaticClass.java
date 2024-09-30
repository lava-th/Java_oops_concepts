package overriding.overridingCase1.overridingCase9;
/*object level method how you override with class level method that why we get compile time error*/
public class ChildStaticClass extends ParentStaticClass{
    /*public static void m1(){ //compile time error
        System.out.println("parent m1 method non static and child is static method");
    }*/
    /*public  void m2(){//compile time error
        System.out.println("parent m1 method static and child is non static method");
    }*/
    public static void m3(){
        System.out.println("parent m3 method static and child is  static method child class");
    }
}
