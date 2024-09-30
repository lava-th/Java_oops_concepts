package constructor;

import java.sql.SQLOutput;

public class NeedOfConstructor {
    String name;
    int roll_no;
    /*constructor must be same as class name below is the constructor of this class*/
   NeedOfConstructor(String name,int roll_no){
       this.name=name;
       this.roll_no=roll_no;


    }
    public static void main (String[] args){
        /*once we create an object compulsory we required perform initialization.
        perform initialization for instant variable is very important task.
        * How To perform initialization for the object some special character concept is required that is constructor.
        * How many objects will create based on that those number of constructor will execute */

        NeedOfConstructor needOfConstructor1=new NeedOfConstructor("hi",102);
        NeedOfConstructor needOfConstructor2=new NeedOfConstructor("hii",103);
        System.out.println(needOfConstructor1.name+",,,,,,,,,,"+needOfConstructor1.roll_no);
        System.out.println(needOfConstructor2.name+",,,,,,,,,,"+needOfConstructor2.roll_no);

    }
}
class SampleTest{
    /*How many objects will create based on that those number of constructor will execute*/
    SampleTest(){
        System.out.println("constructor");
    }
    public static void main(String[] args){
        SampleTest Test1=new SampleTest();
        SampleTest test2=new SampleTest();
        SampleTest test3=new SampleTest();
        SampleTest test4=new SampleTest();
        SampleTest test5=new SampleTest();

    }

}
/*Rules of Constructor: While writing the constructor
* 1.Name of the constructor under name of the class must be same.
* 2.what is the return type for the constructor concept is not applicable.when you created as void type then it is a method.
* 3.The only modifier are applicable for constructors are public, default,private,protected.
* And automatically compiler will write default constructor.If you're not writing least one constructor.
* If you are writing one constructor then default constructor will not be there.
* Every class in java including abstract also container constructor.
*  Prototype of constructor:1.Default constructor It is always no arg constructor.
* And if arg constructor is not default constructor.
* 2.Access modifiers of default constructor is same as class modifiers.this rule is applicable only for public and default
* 3.If default constructor contain any code.It contain only this(),super().It is a no-arg call to super class constructor.
* If */
class CaseOne{
    CaseOne(){
        System.out.println("construcotr");
        //super();//call to 'super()' must be first statement in constructor body
    }

    public static void main(String[]args){

    }

}
class CaseTwo {
    CaseTwo() {
        super();
        System.out.println("construcotr");

    }

    public static void main(String[] args) {

    }
}

class CaseThree {
    CaseThree() {
        super();
        //this();//Call to 'this()' must be first statement in constructor body//but not take both simultaneously,as first line take as either super or this
        System.out.println("construcotr");

    }

    public static void main(String[] args) {

    }
}
class CaseFour {
   public void m1(){
       //super();//Call to 'super()' must be first statement in constructor body and not in a method
       System.out.println("constructor");
   }

    public static void main(String[] args) {

    }
}
/*super() :You are calling no arg super class constructor directly.
* this() means you are calling this class constructor.
* You can call constructor another class constructor only but not the method.
* we can use only inside constructors.
* we should use only in first Line.
* we can use only one but not both simultaneously.
* Different between this and super keywords */
class p{
    String s="parent variable";
}
class c extends p {
    String s = "child variable";

    public void m2() {
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);

    }
    public static void m3() {
//        System.out.println(s);
//        System.out.println(this.s);
   //    System.out.println(super.s);//'constructor.c.super' cannot be referenced from a static context

    }
    /*super and this keyword anywhere you can use except at static area.
    * In Static area it is not allowed to use this and super keywords.*/
}
class TestTwo{
    public static void main(String[] args){
        c c=new c();
        c.m2();
    }
}
/*Different between Super and this keywords and super() and this() methods.
* 1.super() and this() methods,These are constructor calls, to call super class and current class constructors.
* 1.super and this keywords to refer super class and current class instance members.
* 2.super() and this() methods are can use only in constructor,as first statement only.
* 2. super and this keywords can use anywhere expect static area.
* 3.super() and this() methods are can use only one but not simultaneously.
* 3.super and this keywords can use any number of times.*/
class TestFour{
    TestFour(double d){
        this(10);
        System.out.println("double arg constructor");
    }
    TestFour(int i){
        this();
        System.out.println("int-arg constructor");
    }
    TestFour(){
        System.out.println("no arg constructor");
    }
    /*same class name but different arguments is called overloading and above all TestFour  are called overloaded constructors*/
    public static void main(String[] args){
TestFour test=new TestFour(10.5);
        System.out.println("--------------------------------");
        TestFour test1=new TestFour(10);
        System.out.println("--------------------------------");
        TestFour test2=new TestFour();

    }
}
/*overriding concept and inheritance concept are not applicable for the constructors and applicable for methods
* constructor concept is not applicable for interface.*/
class Test_1{
    Test_1(){

    }
}
abstract class Test_2{
    Test_2(){

    }
}
interface Test_3{
//    Test_3(){//Not allowed in interface
//
//    }
}
/*Inside the interface there is no chance to get instance variable*/
/*Recursive method and constructor call*/
class Sampleone{
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args){
       // m1();//Run time error for stack overflow error
        System.out.println("Hello");
    }
}

class SampleTwo{
//    SampleTwo(){
//      this(10);
//    }
//    SampleTwo(int i){
//        this();
//
//    }//Compile time error saying Recursive constructor invocation
    public static void main(String[] args){
        // m1();//Run time error for stack overflow error
        System.out.println("Hello");
    }
}
/*Highly recommended when you are writing argument constructor recommended to write no argument constructor also so that */
class Parent{
//default parent constructor and super method will create
}
class Child extends Parent{
    //default here child constructor and super method will create
}

class Parent1{
Parent1(){

}
}
class Child1 extends Parent1{
    //Here default  child constructor and super method will create
}
class Parent2{
    Parent2(int i){


    }

}
//class Child2 extends Parent2{
//    //There is no default constructor available in 'constructor.Parent2'
//}
//To avoid above error.you are writing argument constructor recommended to write no argument constructor also so that
class Parent3{
    Parent3(int i){


    }
    Parent3(){


    }

}
class Child3 extends Parent3{
    //There is  default constructor available in 'constructor.Parent3'
}
class Parent4{
    Parent4(int i) {


    }

}
class Child4 extends Parent4{
    Child4(){
        super(10);
    }


}