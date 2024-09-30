package mainMethodIntroduction;

public class MainMethod {
    private boolean empty;
    /* the class contain main method are not weather the main method is present or not according requirement are not this things won't be checked with compiler at run time the JVM responsible to check this things if JVM unable to find main method then we will get run time exception no such method error:main*/
    public static void main(String[] args){

        /*Always jvm searches for the main method with the following prototype  why it is public to call the jvm from anywhere
        * why it is static without existing object also jvm as to call this method
        * why it is void main method won't return anything to jvm
        * why main This is the name which is configured inside the JVM
        * Command line arguments
        * The above syntax is very strict if we perform any change then we will get run time exception saying no such method error main
        * Even though the above syntax very strict the following changes are exceptiable instead of public static we can take static public that is the order of modifiers is not important
        * we can declare string[] in any acceptable form main(String[] args),main(String []args),main(String args[])
        * instead of args we can take any valid java identifier main(String[] durgs)
        * we replace String[] with var arg parameter main(String... args)
        * we can declare the main method with the following modifiers final synchronized strictfp public static void main(String... lava){}
        * which of the following main method declaration are valid
        * public static void main(string args)//invalid
        * public static void Main(String[] args)//invalid
        * public  void main(String[] args)//invalid
        * public static int main(String[] args)//invalid
        * public static void main(String[] args)valid
        * final synchronized strictfp public void main(String[] args)//invalid
        * final synchronized strictfp public static void main(String[] args)//valid
        * public static void main(String... args)//valid
        * In which of the above cases we will get compile time error
        * There is no case we will not get compile time error expect the last two cases in remaining we will get run time exception saying no search method array:main
        * overloading of the main method is possible but jvm is always called string[] arg method only the over loaded we will call explicitly like normal method call */
        System.out.println("String[] args");//overloaded methods
        /*inheritance concept is applicable for main method hence while executing child class if child doesn't contain  main method then parent class main method will be executed
        * It seems overriding concept applicable for main method but it is not overriding and it is method hiding
        * Note:For main method inheritance and overloading concept are applicable but overriding concept is not applicable instead of overriding method hiding is applicable*/
        System.out.println("parent main");
/*until 1.6 version if the class doesn't contain main method then will get run time exception no such error method:main but in 1.6 version onwards  instead of no such error method
* we will get more elaborate error information like main method not found in class name ,please declare the main method as public static void main(String[] args)
* from 1.7 version onwards main method is mandatory to start execution even though class contain static block it won't be executed if the class doesn't contain main method
* without writing main method is it possible to print some statements to the console is it possible yes by using static block but this rule is applicable for 1.6 version onwards by 1.7version onwards it is impossible to print some statements to the console without writing main methods*/
/*the arguments which are passing from command prompt are called command line arguments with this command line arguments the jvm will create an array and by passing that array argument the jvm will call main method
* java test A B C
* arg[0] is A
* arg[0] is B
* arg[0] is C
* args.length is 3
* the main objective of command line argument is we can customised behaviour of the main method*/
        /*example 1*/
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        /*if we replace less than or equal to then we won't get any run time exception*/
        System.out.println("????????????????????????????????????");
        String[] argh={"x","y","z"};
        args=argh;
        for(String s:args){
            System.out.println(s);
        }
        /*within main method command line arguments are available  in string form*/
        System.out.println(args[0]+args[1]);
        /*usually space is the separate between the command line arguments if our command line itself contain a space then we have to enclose that command line arguments  with in double quotes
        * Java standards
        * when you are writing java code it is highly recommended to follow coding standards when ever we are writing any components it name should refelct the purpose of the component the main advantage of this approach is readability maintainability of the code will be improved
        * coding standards for classes
        * usually class names are noun should start with upper case character and its contain multiple words and every inner word starts with upper case character
        * String,StringBuffer,Account,Dog
        * coding standards for interfaces
        * usually interfaces names are adjectives should start with upper case character and its contain multiple words and every inner word starts with upper case character
        * Runnable,Serialized,Comparable etc
        * Coding standards for methods
        * usually method names are either verb or verb noun combination should start with Lower case character and its contain multiple words and every inner word starts with upper case character
        * print(),sleep(),run(),eat(),start(),getName(),getSalary() etc
        * Coding standards for variables
        * usually variables names are noun should start with Lower case alphabets symbol and its contain multiple words and every inner word starts with upper case character(camel case convention)
        * name,age,salary,mobileNumber
        * Coding standards for constants
        * usually constants names are noun should contain only upper case character and its contain multiple words then these words are separate with underscore symbol
        * MAX_VALUE,MAX_PRIORITY,NORM_PRIORITY,MIN_PRIORITY,PI
        * usually we can declare constants with public static final modifiers
        * Java bean coding standards
        *  A java bean is a simple java class with private property with public getter and setter methods
        * public class StudentBean{
        * private String name;
        * public void setName(String name){
        * this.name=name;
        * }
        * public void getName(){
        * return name;
        * }class name ends with Bean is not official conventional from sun
        * Syntax for setter methods
        * It should be public method and return type should be void and method name should be prefixed with set it should takes some arguments that is it should not be no argument method
        * Syntax for getter methods
        * It should be public method the return type should not be void and method name should prefixed with it should not take any argument
        * Note:For boolean properties getter method name can be prefix with get or IS and recommended to use is
        * Coding standards for listeners
        * Case 1:To register a listener
        * method name should be prefix with add
        * public void addMyActionListener(MyActionListener l)--valid
        * public void registerMyActionListener(MyActionListener l)--invalid
        * public void MyActionListener(MyActionListener l)--invalid
         * public void addMyActionListener(ActionListener l)--invalid
        * Case 2:To unregister listener
        * method name should be prefixed with remove
        * public void removeMyActionListener(MyActionListener l)--valid
        * public void unregisterMyActionListener(MyActionListener l) --invalid
        * public void removeMyActionListener(ActionListener l) --invalid
        * public void deleteMyActionListener(MyActionListener l) --invalid */


    }
    public static void main(int[] args){
        System.out.println("int[] argument");
    }
    public boolean getEmpty(){
        return empty;
    }
    public boolean isEmpty(){
        return empty;
    }
}
