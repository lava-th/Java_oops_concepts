package javaOperations;

public class ArithematicOperators {
    public static void main(String []args){
        /*if we apply any arithmematice operertor between two variables a and b the result type is always will be max(int,type of a,type of b)
        * byte=>short=>int=>long=>float=>double
        * char=>int=>long=>float=>double*/
        /*byte+byte=int;
        byte+double=double;
        byte+short=int;
        short+short=int;
        short+long=long;
        byte+long=long;
        float+long=float;
        float+double=double;
        char+char=int;
        char+double=double;*/
        System.out.println('a'+'b');
        System.out.println('a'+0.89);
          /*In normal mathematics anything divided by zero is infinity
        //System.out.println(10/0);//.ArithmeticException: / by zero
        /*Infinity :
        * In intergal arthemtic byte,short,int,long there is a no way to represent infinity
        * If the infinity is the result we will get ArithmeticException in intergal arthemetic
        * But in floating point arithmetic(float and double) there is a way to represent infinity for this Float and Double classes contains the following two constants
        * Positive_Infinity
        * Negative_Infinity. Hence even though result is infinity we won't get any ArithmeticException in floating arithemetic*/
        System.out.println(10/0.0);//Infinity

        System.out.println(-10.0/0.0);//-Infinity
        //In normal mathemetics 0/0 is undefined
        //System.out.println(0/0);//ArithmeticException: / by zero

        System.out.println(0.0/0);//NaN(not a number) In integral arithmetic (byte,short,int,long) there is no way to represent undefined results, hence the result is undefined we will get run time exception saying ArithmeticException /zero
        //but in floating point arithemetic (float,double) there is a way to represent to undefined result for this float and double classes contain NaN constant,Hence if the result is undefined we not get ArithmeticException in floating point arthemetic
        System.out.println(-0.0/0);//NaN
        System.out.println(10<Float.NaN);//false
        System.out.println(10<=Float.NaN);//false
        System.out.println(10>=Float.NaN);//false
        System.out.println(10>Float.NaN);//false
        System.out.println(10==Float.NaN);//false
        System.out.println(Float.NaN==Float.NaN);//false
        System.out.println(Float.NaN!=Float.NaN);//true
        System.out.println(10!=Float.NaN);//TRUE
        /*Arithemetic expression:It is run time expection but not compile time error
        * It is possible in integral arithemetic but not floating point arithemetic
        * The only operators which cause AE are / and %*/




    }
}

