package javaOperations;

public class StringConcatenationOperator {
    public static void main(String[] args){
        //StringConcatenationOperator(+)
        //The only overloaded operator is + operator sometimes it acts as arithmetic addition operator and sometimes it acts as String concatenation operator.
        String s="lava";
        int d=10;
        int h=20;
        int g=30;
        System.out.println(s+d+h+g);
        System.out.println(d+h+g+s);
        System.out.println(d+h+s+g);
        System.out.println(d+s+h+g);
        /*If at least one argument is string type then + operator acts as concatenation and if both arguments are number type then + operator acts as arithmetic addition operator
        * Consider the following declaration */
        String a="Hi";
        int b=10;
        int c=20;
        int k=30;
        /*Which of the following expressions are valid*/
       //a=b+c+k;//String=int is not valid
       a=a+b+c;//String=String is valid
       //b=a+c+k;//int=String is not valid
       b=b+c+k;//int=int//is valid


    }
}
