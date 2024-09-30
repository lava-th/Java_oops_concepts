package variables_introduction;

import java.util.Arrays;

public class Variables_1 {
    int d=10;//instance primitive
    static  int f=10;
    double u;//instance variable
    String s;
    boolean m;
    static double u1;
    static String s1;//static reference
    static boolean m1;
    int[] g;
    int[] r=new int[3];
    static int[] g1;
    static int[] r1=new int[3];
    public void m4(){//instance area
        System.out.println(d);
    }
    public static void main(String[] args){//static area

        /* Division 1:based on type of value represent by a variable all variables are divided into two types 1.primitive variables can be used primitive values ex:int x=10; and 2.reference variables can be used to refer objects ex:Student s=new Student();*/
        /*Division 2:based on position on declaration and behaviour all variables are divided into 3 types 1.instance variables,2.static variables,3.local variables*/
        /*if value of variable varied from object to object such type of variables are called instance variables,for every object a separate copy of objects will be created.
         * instance variables should be declared with in the class directly but outside any block or constructor.
         * instance variable will be created at the time of object creation and destroyed at the time of object destruction hence the scope of instance variable is stored as the part of object.
         * instance variable is stored in the heap memory as part of object.
         * we can't access instance variables directly from static area, but we can access by using object reference creation, but we can access instance variables directly from instance area.*/

       Variables_1 jk=new Variables_1();
        System.out.println(jk.d);
        /*For instance variables JVM always provide default values, and we are not required perform initialization explicitly.*/
        System.out.println(jk.m);
        System.out.println(jk.s);
        System.out.println(jk.u);
        /*Instance variable is also called as object level variables or attributes*/
        /*Static variables
         * If the value of variable is not varied from object to object then it is not recommend to declare variable as instance variable we have to declare such type of variables at class level by using as static modifier.
         * in case of instance variables for every object separate copy will be created but in case of static variable a single copy will be created at class level and shared by every object of the class.
         * static variables should be declared with in the class directly but outside any method or block or constructor.
         * static variable will be created at the time of class loading and destroyed at the time of class unloading hence the scope of static variable is exactly same as dot class file.
         * java test is a program.
         * 1.start jvm
         * 2.create and start main thread.
         * 3.Locate test.class file
         * 4.load test.class--static variable creation
         * 5.And execute main method
         * 6.unload test.class--static variable destruction
         * 7.terminate main thread
         * 8.shutdown jvm
         * static variables will be stored in method area.
         * we can access static variables either by object reference or class name but recommended to use class name,and within the same class it is not required to use class name and we can access directly.*/
        System.out.println(jk.f);
        System.out.println(Variables_1.f);
        System.out.println(f);
        /*we can access static variables from both instance and static areas
         * For static variables jvm provide default values, but we are not required performs initialization explicitly.*/
        System.out.println(u1);
        System.out.println(m1);
        System.out.println(s1);
        /*static variables also called class level variables or fields*/
        jk.f=777;
        jk.d=89;
        Variables_1 jk1=new Variables_1();
        System.out.println(jk1.f+";;;"+jk1.d);
        /*sometimes to meet temporary requirements of the programmer we can declare a variables inside a method or block or constructor,such type of variables are called temporary variables or stack variables or local variables or automatic variables.
        * local variables stored inside the stack memory.
        * local variables will be created while executing the blocks in which we declared it ones block execution completed automatically local variable will be destroyed.Hence, the scope of local variable is the block in which we declared it.
        * */
        int i=0;
        for(int j=0;j<=3;j++){
            i=i+j;
        }
        //System.out.println(i+"..."+j);//compile time error cannot find symbol ,Symbol :variable j
        try{
            int j=Integer.parseInt("ten");
        }
        catch(NumberFormatException e){
            int j=10;
        }
       // System.out.println(j);//compile time error cannot find symbol ,Symbol :variable j
        /*For local variables jvm won't provide default values ,compulsory we should perform initialization explicitly. before using that variable ,that is if we are not using then it's not required to perform initialization.*/
        int v;
        //System.out.println(v);//variable v might not have been initialized.
        int x;
        if(args.length>0){
            x=10;
        }
        //System.out.println(x);////variable x might not have been initialized.
        int x1;
        if(args.length>0){
            x1=10;//local primitives
        }else{
            x1=20;
        }
        System.out.println(x1);
        /*Note:It is not recommended to perform initialization for local variables inside the logical blocks because there is no grantee for the execution of these blocks always at run time.
        * Note 2:It is highly recommended to perform initialization for local variables at the time of declaration at least with default values.
        * The only applicable modifier for local variable is final by mistake if we are trying to apply any other modifier then we will get compile time error.
        * */
//        public int b1=10;illegal start of expression
//        private int b1=10;illegal start of expression
//       static int b1=10;illegal start of expression
//        protected int b1=10;illegal start of expression
//        transient int b1=10;illegal start of expression
//       volatile int b2=10;//illegal start of expression
        final int b2=10;//valid.
        /*If we are not declaring with any modifier than by default it is default but this rule is applicable for only for instance and static variables but not for local variables.
        * conclusions:For instance and static variables jvm will provide default values, and we are not required initialization explicitly but for local variables jvm won't provide default variables compulsory we should perform initialization explicitly before using that variable.
        * instance and static variables can be accessed by multiple threads simultaneously hence these are not thread safe but in case of local variables for every thread will separate copy will be created and hence local variables are thread safe
        * every variable in java should be either instance or static or local.
        * every variable in java should be either primitive or reference hence various possible combinations of variables in java are instance primitive and instance reference,static primitive and static reference,local primitive and local reference
        * un initialized arrays */
        System.out.println(jk.g);
       // System.out.println(jk.g[0]);//Null pointer exception
        System.out.println(jk.r);
        System.out.println(jk.r[0]);
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(g1);
        // System.out.println(jk.g1[0]);//Null pointer exception
        System.out.println(r1);
        System.out.println(r1[0]);

        /*once we create an array every array element by default initialized with default values irrespective of weather it is instance or static or local array.*/
        System.out.println("================");
      jk.m1();
    }
    public void m1(){
        System.out.println(d);
        System.out.println(f);//static variable
        System.out.println("---------------------------------");
        int[] g2;
//        System.out.println(g2);
//        System.out.println(g2[0]);local level variable x might not have been initialized
        int[] r2=new int[3];
        System.out.println(r2);
        System.out.println(r2[0]);

    }
    }

