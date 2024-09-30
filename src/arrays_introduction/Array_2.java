
package arrays_introduction;

public class Array_2 {
    int d=10;
    static  int f=10;
    double u;
    String s;
    boolean m;
    static double u1;
    static String s1;
   static boolean m1;
    public static void main(String[] args){
        /*Array variable assignments        */
        /*element level promotion are not available at array level
        * for example char element promoted int type where as char array cannot prompted to  int array*/
        int[] x={10,20,30,40};
        char[] y={'a','c','f','h'};
        int[] b=x;
       // int[] n=y;//compile time error
        //String[]-Object[];//is valid
        //String-Object
        /*But in the case of object type arrays the child type class arrays are promoted to parent type class arrays*/
        String[] s={"abd","avgt","aeft"};
        Object[] h=s;
        /*Case2: when ever we are assigning one array to another array internal elements won't be copied just reference variable elements will be re-assigned*/
        int[] a= {10,67,89,4};
        int[] c= {10,4};
        a=c;
        c=a;
        //case 3:when ever we are assigning one array to another array the dimension must be matched in the place of one dimensional we should provide one dimensional array only if we provide any other dimension we will get error.
        int[][] l=new int[4][];
        //l[0]=new int[4][3];//invalid
        l[0]=new int[3];
        //l[0]=10;//invalid
        /*when ever we are assigning one array to another array both types should match but sizes are not be match*/
        for(int k=0;k<= args.length;k++){
            //System.out.println(args[k]);
        }
        String[] argh={"x","y","z"};
       args =argh;
       for(String str:args){
           System.out.println(str);
       }
        int[][] v=new int[4][3];
       v[0]=new int[4];
       v[1]=new int[2];
       v=new int[2][3];
       /*total How many objects created is 11
       * total how many objects are created in garbage collection is 7*
       * based on type of value represent by a variables all variables are divided into two types primitive variables can used primitive values and reference variables can be used to refer objects*/
        /*based on position on declaration and behaviour all variables are divided inti instance variables,static variables,local variables*/
        /*if value of variables varied from object to object such type of variables are called instance variables.for every object a separate copy of objects will be created
        * instance variables should be declared with in the class directly but outside of any block or constructor
        * instance variable will be created at the time of object creation and destroyed at the time of destruction hence the scope of instance variable is stored as the part of object
        * we can't access variables directly from static area but we can access by using object creation but we can access directly from instance area*/

        Array_2 jk=new Array_2();
        System.out.println(jk.d);
        /*For instance variables JVM always provide default values and we are not required perform explicitly*/
        System.out.println(jk.m);
        System.out.println(jk.s);
        System.out.println(jk.u);
        /*Instance vaiable is also called as object level or attributes*/
        /*Static variables
        * If the value of variable is not varied from object to object then it is not recommend to declare variable as instance variables we have to declare such type of variables at class level by using as static modifier
        * in case of instance variables for every object separate copy will be created but in case of static variable a single copy will be created at class level and shared by every object of the class
        * static variables should be created with in the class directly but outside of any method block or constructor
        * static variable will be created at the time of class loading and destroyed at the time of class unloading hence the scope of static variable is exactly same as dot class file
        * java test is a program
        * 1.start jvm
        * 2.create and start main thread.
        * 3.Locate test.class file
        * 4.load test.class--static variable creation
        * 5.And execute main method
        * 6.unload test.class--static variable destruction
        * 7.terminate main thread
        * 8.shutdown jvm
        * static variables will be stored in method area
        * we can access static variables either by object reference or class name but recommended use class name within the class name not required the class name we can access directly*/
        System.out.println(jk.f);
        System.out.println(Array_2.f);
        System.out.println(f);
        /*we can access static variables from both instance and static areas
        * For static variables jvm provide default values, but we are not required performs initialization explicitly*/
        System.out.println(u1);
        System.out.println(m1);
        System.out.println(s1);
        /*static variables also called class level variables or fields*/
        jk.f=777;
        jk.d=89;
        Array_2 jk1=new Array_2();
        System.out.println(jk1.f+";;;"+jk1.d);
    }
    public void m1(){
        System.out.println(d);
        System.out.println(f);//static variable
    }
}
