package varargs_introduction;

public class Var_argsMethod {
    /*Var_args method is variable number of arguments methode
    * until 1.4 version we can't declare a method with variable number of arguments if there is a change in number of arguments compulsory we should go for new method it increases length of the code and reduces readbility to overcome this problem some pepole introduced var arg methods in 1.5 version according this we declare a variable number of arguments such type of methods are called var arg methods*/
    public static void m1(int... a){//we can bypass by calling any number of int values including 0 number. m1(),m1(10,20),m1(10,20,30),m1(10,20,30,40,...)
        System.out.println("var-arg methods");
        /*internally var-arg parameter will be converted into one dimensional array.hence within the we can differentiate values by using  index*/
        System.out.println("var-arg methods"+a.length);

    }
    public static void sum(int... x){
        int total=0;
        for(int x1:x){
            total=total+x1;
        }
        System.out.println("the sum is"+total);
    }
    /*Case 1:
    * case2:we can mix var arg parameter with normal parameter
    * m1(int x,int... y)
    * m1(String s,int.. z)
    * case 3: if we mix normal parameter to var arg parameter then var arg parameter should be last parameter
    * m1(double.. d,int x)//invalid
    * m1(int x,double.. d)
    * Case 4:Inside the var arg method we can take only one var arg parameter and we can't take more than one var arg parameter
    * m1(int... x,double... y)//invalid
    * Case 5:inside a class we can't declare var arg method and corresponding one dimensional array method simultaneously otherwise we will get compile time error*/
 /*   public static void m2(int... x1){
        System.out.println("int... x1");
    }
    public static void m2(int[] x2){
        System.out.println("int[] x2");
    }*/
    /*Case 6:*/
    public static void m1(int x){
        System.out.println("General method");
    }
    /*In general var arg method will get the least priority that is if no other method matched then only var arg method will get chance it is exactly same as default case in side switch
    *  Equivalence between var arg method and one dimensional array:
    * where ever one dimensional array present we can replace with var arg parameter
    * m1(int[] x) can be replaced with m1(int... x)
    * main(String[] args)can be replaced with main(String... args)
    * where ever var arg parameter present we can't replace with one dimensional array it is invalid parameter
    * m1(int... x) is not replaced with m1(int[] x)
    * Note: m1(int... x) we can call this method by passing a group of int values and x will become one dimensional array int[]
    * m1(int[]... x) we can call this method by passing a group of one dimensional int arrays and x will become two-dimensional int array int[][]*/
    public static void test(int[]... y){
        for(int[]y1:y){
            System.out.println(y1[0]);

        }
    }
    public static void main(String[] args){
        m1(10,20,30);
        m1(10);
        m1();
        m1(10,20,30,40,50,60,70);
        System.out.println("the sum values are_____________________");
        sum(10,20,30);
        sum();
        sum(10,20,30,40,50,60,70);
        int[] a={10,20,30};
        int[] b={30,56,28};
        test(a,b);

    }

}
