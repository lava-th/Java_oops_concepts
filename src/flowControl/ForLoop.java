package flowControl;

public class ForLoop {
    public static void main(String[] args) {

        /*for loop:
         * syntax:for(initialization_section(1);conditional check_section(2)(5)(8);increment/decrement_section(4)(7)){
         * loop body_section(3)(6)(9)
         * }
         * For loop is the most commonly loop used in java if we know number of iteration in advance then for loop is the best choice*/
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
        /*curely braces are optional and without curly braces we can take only one statement and which should not be declaration statement*/

//        for(int i=0;i<10;i++)
//            System.out.println("hello");//valid

//        for(int i=0;i<10;i++);//valid

//        for(int i=0;i<10;i++)
//           int x=10;//invalid

        for (int i = 0; i < 10; i++) {//valid

        }
        System.out.println("...........................");
        /*this part will be executed in loop life cycle here we can declare and intialze local variables of for loop here we can declare any number of variables but should be of the same type by mistake if we are trying different data type variables then we will get compile time error*/
        int i = 0, j = 0;//valid
//        int i1=0,String p1="lava";//invalid
//        int i2=0,int j1=0;//invalid
        int i2 = 0;
        for (System.out.println("hello boss you are sleeping"); i2 < 3; i2++) {
            System.out.println("no boss u only sleeping");
        }
        /*in the initialization section we can take any valid java statement including sop  */
        System.out.println("...................");

//        int i3=0;
//        for(System.out.println("hello boss you are sleeping");;i3++){
//            System.out.println("no boss u only sleeping"+i3);
//        }
        /*Here we can take any varied java expression but should have the boolean
         * This part is optional and if we are taking anything then compiler always place true under conditional check section*/
        int i4 = 0;
        for (System.out.println("hello "); i4 < 3; System.out.println("hi")) {
            i4++;

        }
        /*In the increment/decrement  section we can take any valid java statement including sop*/
//        for(;;){//Infinite loop
//            System.out.println("hello");
//        }
        // for(;;);//Infinite loop


        /*All three parts for loop are independent of  each other and optional*/

        /*for(int k=0;true;k++){
            System.out.println("hello");
        }
        System.out.println("hi");//un reachable statement*/

//        for(int m=0;false;m++){
//            System.out.println("hello");//loop body it is unreachable
//        }
//        System.out.println("hi");

//        int a=10,b=20;
//        for(int l=0;a<b;l++){
//            System.out.println("hello");//infinite loop output will get
//        }
//        System.out.println("hi");

//        int a1=10,b1=20;
//        for(int l1=0;a1>b1;l1++){
//            System.out.println("hello");
//        }
//        System.out.println("hi");//Hi output will get

//        final int a2=10,b2=20;
//        for(int l2=0;a2>b2;l2++){
//            System.out.println("hello");//unreachable statement
//        }
//        System.out.println("hi");

//        final int a3=10,b3=20;
//        for(int l3=0;a3<b3;l3++){
//            System.out.println("hello");
//        }
//        System.out.println("hi");////unreachable statement










        /*For each loop is also known as enhanced for loop
        * introduced in 1.5 v it is special design loop it retrieve elements arrays and collections*/
        /*TO print elements of one dimensional array*/
        /*Normal for loop*/
        int []x={10,20,30,44};
        for(int v=0;v<x.length;v++){
            System.out.println(x[v]);

        }
        /*Enhanced For each loop*/
        for(int x1:x){
            System.out.println(x1);
        }
        /*2.To print elements of two-dimensional array*/
        /*Normal for loop*/
        int [][]y={{10,20,30},{40,50}};
        for(int h=0;h<y.length;h++) {
            for (int k = 0; k < y[h].length; k++) {
                System.out.println(y[h][k]);
            }
        }
        /*For each loop*/
        for(int[] g1:y){
            for(int g2:g1){
                System.out.println(g2);
            }
        }
        /*2.To print elements of three-dimensional array*/
        int[][][] r={{{10,20,30},{23,34,56}}};
        for(int[][] q1:r){
            for(int[] q2:q1){
               for(int q3:q2){
                   System.out.println(q3);
               }
            }
        }
        /*For each loop is the best choice to retrive arrays and collections but its limitation it is applicable only for arrays and collections and it is not a general purpose loop */
        for(int p=0;p<10;p++){
            System.out.println("hello");
        }
            /*we can't write equivalent for each loop directly*/
        int[] c={10,20,30,40};
        for(int f=c.length-1;f>=0;f++){
            System.out.println(c[f]);

        }
        /*By using normal for loop we can print array element either in original order or in reverse order but by using for each loop we can print only in original order but not in reverse order*/

        /*iterable interface: for each item x in target.This target element can be either array or collection.The target element for each element should be iterable object.
        * when the target element said to be iterable object if only if the corresponding class implements the java.lang.iterable interface
        * Iterable interface introduced in 1.5version
        * Iterable interface contain only one method that is iterator()*/
        //public Iterator iterator();
        //All array related class and collection implemented class already implement iterable interface being programmer we are not required to do anything just we should be aware the point
//        Syntax for(each-item x:target){
//
//        }
        /*Difference between iterator and iterable
        * Iterator interface  is related to collection
        * iterable interface  is related for each loop
        * Iterator interface we can use to retrieve the elements of the collections one by one
        * Iterable interface the target element in for each loop should be  iterable
        * Iterator interface  java.util.package
        * iterable interface java.lang.package
        * iterator interface has 3 methods hasNext(),next(),remove()
        * iterable interface has one method iterator()*/



    }
}
