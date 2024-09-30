package languageFundamentals;
/*Identifiers,Reserved words,Data types,Literals,arrays,Types of variables,var-arg methods,main methods,command line arguments,java coding standards.
* A name in java program is called identifier which can be used for identification purpose it can be method name or variable name, class name or label name*/

public class Identifiers {
    public static  void main(String[] args){
       int x=10;
       //how many identifiers are there in this class are 5 they are name of the class,name of the method,predefined String class name,name of the array is args and name of the variable
        /*Rules for defining java identifiers
        * 1.The only allowed characters are a to z ,A to Z,1 to 9,$,_ if you are using any other character we will get compile time error
        * total_number -valid
        * total# - invalid
        * 2.Identifiers can't  start with digits
        * total123 - valid
        * 123total - invalid
        * 3.java identifiers are case-sensitive of  course java language itself is treated as case-sensitive programming language*/
        int NUMBER=10;
        int number=18;
        int Number=90;
        /*4.There is no length limit for identifiers for java identifiers, but it is not recommended to take to lengthy identifiers
        * 5.we can't use the reserve words as identifiers*/
        int x1=9;
        //int if=90;
        /*6.All predefines java class name and interface names we can use as identifiers  even though it is valid but it is not a good programming practise because it reduces readability and creates confusions*/

        int String=999;
        System.out.println(String);
        int Runnable=9;
        System.out.println(Runnable);






    }
}
