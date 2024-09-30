package javaOperations;

public class TypeCastOperator {
    public static void main(String[] args){
        //There are two types of type casting
        //1.Implicit type casting
        //2.Explicit type casting
        /*1.Implicit type casting
        *whenever we are assigning smaller data type value to bigger data type variable then implicit type casting is performed
        * Is also known as widening or upcasting
        * In implicit type casting there is no loss of information
        * byte->short,->int->long->float->double
        * char->int->long->float->double
        * */
        int x='a';
        System.out.println(x);//97//internally compile converts char to int by automatically by implicit type casting
        double d=10;
        System.out.println(d);//10.0//compiler converts int to double automatically by implicit type casting
        /*Explicit type casting
        programmer is responsible to perform explicit type casting
        whenever we are assigning bigger data type value to smaller data type variable then explicit type casting is required
        It is also known as Narrowing and down casting
        there may be chance of loss of information in this type of casting*/
        int x1=130;
       // byte b=x;//compile time error possible loss of precision found int required type is byte
        byte b=(byte)x1;
        System.out.println(b);
        /*byte<=short<=int<=long<=float<=double
        * char<=int<=long<=float<=double
        *whenever we are assigning bigger data type value to smaller data type variable then explicit type casting is the most significance will be lost we have to consider only least significant list */
        int x2=150;
        short s=(short) x2;
        System.out.println(s);
        byte b1=(byte) x2;
        System.out.println(b1);
        double d1=130.349;
        int c=(int)d1;
        System.out.println(c);
        /*If we assign floating point values to the integral types by explicit type casting the digits after the points will be lost*/
        byte n=(byte)d1;
        System.out.println(n);


    }
}
