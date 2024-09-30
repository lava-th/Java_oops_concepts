package arrays_introduction;

import java.sql.SQLOutput;

/*An array is an indexed collection of fixed number of homogenous data elements
* The main advantage of arrays is we can represent a huge number of values by using single variable so that readable of the code will be improved.
* But the  main disadvantage of arrays is fixed in size that is ones we create an array there is no chance of increasing or decreasing size based our requirement
* Hence to use arrays concept compulsory we should know the size in advance, which may not possible always*/
public class Array_1 {
    public static void main(String[] args) {
        /*one dimensional array declaration*/
        int[] x;//here name is clearly separated from type
        int[] x1;
        int x2[];
        /*At the time of declaration we can't specify the size otherwise we will get compile time error
        int [6]x;
        /*Two dimensional array*/

        int y[][];
        int[][] y1;
        int[][] y2;
        int[][] y3;
        int[] y4[];
        int y5[][];

        int[] a, b;
        int[] a1[], b1;//a is 2 and b is 1
        int[] a2[], b2[];//a is 2 b is 2
        int[][] a3, b3;//a is 2 and bis 2
        int[][] a4, b4[];//a is 2 and b is 3
        // int[] []a5,[]b5;//This is not valid ,if you want to specify dimension before the variable that facility is applicable only for first variable in a declaration if we are trying to apply for next variable onwards we will get compile time error.
        // int[] []a6,[]b6,[]c6;// This is not valid
        /*Three dimensional declaration*/
        int p[][][];
        int[][][] p1;
        int[][][] p2;
        int[][] p3[];
        int[] p4[][];
        int p5[][][];
        int[][] p6[];
        int[][][] p7;
        int[][] p8[];
        int[] p9[][];

        /*Array creation*/
        /*every array in java is an object only hence we can create arrays by using new operator*/
        int[] l = new int[3];
        System.out.println(l.getClass().getName());//[I
        int[][] l1 = new int[3][2];
        System.out.println(l1.getClass().getName());//[[I
        /*For every array corresponding class name will be available part of java language and not available to the programmer level*/
        /*At the time of array creation compulsory we should specify the size otherwise we will get compile time error*/
        int[] k = new int[6];
        //int[] k1=new int[];//invalid
        /*it is legal to have an array with size 0 in java*/
        int[] o = new int[0];
        System.out.println(o.length);
        /*If you array size with some negative int value then we will get run time exception saying negative array size exception*/
        /*To specify array size the allowed data types are byte,short,char,int if we are trying to specify any other type then we will get compile time error*/
        int[] o1 = new int[10];
        int[] o2 = new int['a'];
        short s = 98;
        int[] o3 = new int[s];
        byte B = 89;
        int[] o4 = new int[B];
        // int[] o5=new int[8l];//invalid
        /*The maximum allowed array size in java is 2147483647 which is the maximum value of int data type
         * even in the first case we may get run time exception if sufficient heap memory is not available*/
        /*Two dimensional array creation
         * In java two-dimensional not implemented by using matrix style some people followed array of arrays approach for multidimensional creation. The main advantage of approach is memory utilization of memory is related
         * */
        int[][] m = new int[2][];
        System.out.println(m);//[[I@404b9385
        System.out.println(m[0]);//null
        //System.out.println(m[0][0]);//null pointer exception
        /*If we are trying perform any operation on null then we will get run time exception saying null pointer exception*/
       /* v[0]=new int[2];
        v[1]=new int[3];*/
        int[][][] h = new int[2][][];
        /* h[0]=new int[3][]
           h[0][0]=int[1]
           h[0][1]=int[2]
           h[0][2]=int[3]
           h[1]=int[2][2]

         */
        /*Array initialization*/
        /*ones we create an array every element by default initializers with default values*/
        System.out.println(k);
        System.out.println(k[0]);
        /*When ever we are trying to print any reference variable internally tw string method will be called which is implemented by default to return the string in the following form class name hash code in hexadecimal form*/
        /*Ones we create an array every array element by default initializer with default values if we are not satisfied with default values then we can override this values with our customised values*/
        int n[] = new int[6];
        n[0] = 10;
        n[1] = 10;
        n[2] = 10;
        n[3] = 10;
        n[4] = 10;
        n[5] = 10;
        // n[6]=10;//array index out of bound exception
        //n[-6]=10;
        // n[2.8]=0;//compile time error
        /*if we are trying to access array element with out of range index (either positive value or negative int value then run time exception saying array index out of bound exception*/
        //1.Erwtesnsoep,pannenkoeken,poffertjes,bami goreng,stamppot,hutspot,sate,hachee,appeltaar,boterkoekrt
        /*we can declare create and intialize an array in a single line (shortcut representation)*/
        int V[];
        V = new int[3];
        V[0] = 10;
        V[1] = 20;
        V[2] = 30;
        int[] v = {10, 20, 30};
        int[] v3;
        //v3={10,20,39};//illegal start of expression
        char[] v1 = {'a', 'e', 'i', 'o', 'u'};
        String[] v2 = {"aa", "anu", "uik"};
        /*we can extend this shortcut even in multidimensional array also*/
        int[][] j1 = {{10, 20}, {45, 67, 89}};
        int[][][] j2 = {{{10, 20, 30}, {67, 90}}, {{70, 80}, {90, 78, 90}}};
        //System.out.println(j2[0][1][2]);
        System.out.println(j2[1][0][1]);
        //System.out.println(j2[2][0][0]);
        //System.out.println(j2[1][2][0]);
        System.out.println(j2[1][1][1]);
        //System.out.println(j2[2][1][0]);
        /*If you want to use this shortcut compulsory we should perform all activities in a single line if you are trying to divide then we will get compile time error*/
        /*Length vs length()*/
        int[] hp = new int[6];
        //System.out.println(hp.length());//cannot find symbol
        System.out.println(hp.length);//length variable
        /*length is a final variable applicable for arrays and length variable represents the size of the array */
        String o12 = "lava";
        System.out.println(o12.length());
        //System.out.println(o12.length);//cannot find symbol
        /*length method is final method applicable for string objects length method returns number of characters present in the String*/
        /*length variable applicable for arrays but not for string objects
         * whereas length method applicable for string objects but not for arrays */
        String[] kl = {"qq", "lko,lkop", "ol,ujhi,jih"};
        System.out.println(kl.length);
        System.out.println(kl[0].length());
        // System.out.println(kl.length());
        // System.out.println(kl[0].length);
        /*In multi dimensional array only base size but not total size */
        int[][] l34 = new int[6][9];
        System.out.println(l34.length);
        /*There is no direct away to specify total length of multi dimensional array but indirectly we can find as follows */
        //x[0].length+x[1].length+x[2].length+....;
        /*Anonymous array: A array without name is called annymous array
         * the main purpose anonymous array is just for instant use (one time usage)*/
        /*we can create anonymous array as follows*/
        //new int[]{10,20,30}
        //while creating anonymous array we can't specify the size otherwise we will get compile time error.
        //new int[3]{10,20,30}//in valid
        /*we can create anonymous nulti dimensional also
        * new int[][]{{10,20}.{10,20,30}}/
        Based on our requirment we can give the name for anynomous array then it is no longer anynomous
        * int s=new int[]{10,20,30}        */
        sumarray(new int[]{10, 20, 30});
        /*Array element assignments:
        * Case1: In case of primitive type array as array elments we can provide types which can be implicitly promoted to declared type*/
        int[] c=new int[5];
        c[0]=1;
        c[1]='v';
        byte z=89;
        c[2]=z;
        short s34=90;
        c[3]=s34;
        //c[4]=10l;//compile time error
        /*In the case float type arrays the allowed data type are byte,short,char,int,long ,float
        * Case2:If it is object type arrays*/
        Object[] r=new Object[6];

        r[0] =new Object();
        r[1]=new String("durga");
       // r[2]=new Integer(10);
        /*Case 3:if it is abstract class type arrays  In the case of object type arrays as array element we can provide either declared type objects or its child class objects*/
Number[] num=new Number[6];
num[0]=new Integer(34);
num[1]=new Double(10.5);
/*Case4:for interface type arrays as array element its implmentation class objects are allowed*/
        Runnable[] run=new Runnable[3];
        run[0]=new Thread();
        //run[1]=new String();




    }
        public static void sumarray(int[] d){
            int total=0;
            for(int ml:d){
                total=total+ml;

            }
            System.out.println("the sum is:"+total);
            /*In the above example just call sum array method but after completing sum method call we are not using that array anymore hence for this one time requirement anonymous array is the best choice*/








    }
}
