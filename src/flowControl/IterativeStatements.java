package flowControl;

public class IterativeStatements {
    public static void main(String[] args){
        /*2.Iterative statements:While(),dowhile(),for(),for-each loop(1.5v).*/
        /*If we don't know number of iteration for advance then we will go for while loop
        * while(rs.next),while(itr.hasNext),while(e.hasMoreElements)*/
        /*syntax:
        * while(b){
        * }
        * the argument should be boolean type if you are trying to provide any other type then we will get compile time error*/
//        while(1){
//            System.out.println("hello");
//        }
        /*Incompatible types found int required boolean
        * curly braces are optional without curely braces we can take only one statement under while which should not be declarative statements*/
//       while(true)
//           System.out.println("hello");//valid
//        while(true);//vaild

//       while(true)
//           int x=10;//invalid

//       while(true){
//           int x=10;//valid
//       }
//       while(true){
//           System.out.println("hello");
//       }
        //System.out.println("hi");//unreachable statement//Invalid

//       while(false){//Loop condition is always false making the loop body unreachable statement//invalid
//           System.out.println("hello");
//
//       }
//        System.out.println("hi");

//       int a=10,b=20;
//        while(a<b){//hello hello multiple will execute//valid
//            System.out.println("hello");
//
//        }
//        System.out.println("hi");
//        int a1=10,b1=20;
//        while(a1>b1){//false //hi is the output//valid
//            System.out.println("hello");

//        }
//        System.out.println("hi");
//        final int a3=10,b3=20;//un reacheable statement //invalid
//        while(a3<b3){
//            System.out.println("hello");
//
//        }
//        System.out.println("hi");
//        final int a4=10,b4=20;
//        while(a4>b4){//false//unreachable statement //invalid
//            System.out.println("hello");
//
//        }
//        System.out.println("hi");
        /*the final variables will be replaced by the value at compile time only*/
        final int v=10;
        int n=20;
        System.out.println(v);
        System.out.println(n);
        /*if every argument is final variable compile time constant then the operation should be performed at compile time only*/
        final int v1=10;
       final  int n1=20;
       int m=20;
        System.out.println(v1+n1);
        System.out.println(v1+m);
        System.out.println(v1<n1);
        System.out.println(v1<m);
        /*If we want to execute loop body at least once then we should go for do while
        * Syntax:do{
        *body
        * while(b){
        * }
        * curely braces are optional and without the curly braces we can take only one statement between do and while which should not be declaration statement */
//        do//valid
//            System.out.println("hi");
//        while(true);
//
//        do;//valid
//        while(true);

//        do//invalid
//            int x4=10;
//        while(true);
//        do {//valid
//            int x8=10;
//        }
//        while(true);
//
//        do//invalid
//        while(true);
//        do
//            while(true)
//                System.out.println("hello");//infinite statement
//            while(false);
//        do
//            while(true)
//                System.out.println("hello");//infinite statement
//        while(true);
//        System.out.println("hi");//Unreachable statement//invalid
//        do
//
//                System.out.println("hello");
//        while(false);
//        System.out.println("hi");//valid
//        int a1=10,b1=20;
//        do
//
//            System.out.println("hello");//infinite statement//valid
//        while(a1<b1);
//        System.out.println("hi");
//        int a1=10,b1=20;
//        do
//
//            System.out.println("hello");//infinite statement//valid
//        while(a1>b1);
//        System.out.println("hi");//valid
//        final int a1=10,b1=20;
//        do
//
//            System.out.println("hello");
//        while(a1>b1);
//        System.out.println("hi");//valid
//        final int a1=10,b1=20;
//        do
//
//            System.out.println("hello");
//        while(a1<b1);
//        System.out.println("hi");//unreachable statement






   }
}
