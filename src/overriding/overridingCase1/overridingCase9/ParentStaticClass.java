package overriding.overridingCase1.overridingCase9;
/*Non static method to static method is not possible in overriding
* static method to non static method is not possible in overriding
* if both are static method is possible but it is not overriding it is a special concept is called as method hiding*/
public class ParentStaticClass {
    public void m1(){
        System.out.println("parent m1 method non static and child is static method");
    }
    public static void m2(){
        System.out.println("parent m2 method static and child is non static method");
    }
    public static void m3(){
        System.out.println("parent m3 method static and child is  static method");
    }
}
