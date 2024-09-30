package javaOperations;

public class IncrementAndDecrementOperators {
    public static void main(String[] args){
        /*pre increment=>++x
        post increment=>x++
        * pre decrement=>--x
        post increment=>x--
        */
        int x=10;
        int x1=10;
        int x2=10;
        int x3=10;
        //int y4=++10;//not valid
       // int y5=++(++x);// * distecting of increment and decrement operators are not allowed*/
        int y;
        int y1;
        int y2;
        int y3;
        y=x++;
        System.out.println("value of Y:"+y+"value of x:"+x);
        y1=++x1;
        System.out.println("value of Y:"+y1+"value of x:"+x1);
        y2=x2--;
        System.out.println("value of Y:"+y2+"value of x:"+x2);
        y3=--x3;
        System.out.println("value of Y:"+y3+"value of x:"+x3);
        /*we apply increment and decrement operator only for variables but not for constant values if you are try to apply constant values then we will get compile time error
        * listing of increment and decrement operators are not allow
        * For final variables we cannot apply increment and decrement operators
        * */
/* final int x4=10;

x4++;
        System.out.println(x4);*/
        /*we can apply increment and decrement for every primitive types expect boolean*/
        char ch='a';
        ch++;
        System.out.println(ch);
        double d=10.34;
        d++;
        System.out.println(d);
        boolean b=true;
   //b++;//is not valid
        System.out.println(b);
        /*different between v++ and v+1
        * if we apply any arithmetic operator between two variables a and b the result type is always max(int,type of A,type ofB)*/
        byte v=10;
       // v=v+1;not valid
        v=(byte)(v+1);
        v++;
        byte a=20;
        byte n=30;
       // byte l=a+n;not valid
        byte l=(byte)(a+n);
        System.out.println(l);
        /*But in the case of increment and decrement operators internal type casting is will be performed automatically
        * b++ is (type of b)(b+1)*/

    }
}
