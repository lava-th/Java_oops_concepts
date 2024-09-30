package languageFundamentals;

public class ReservedWords {
    public static void main(String[] args) {
        /*In java some words are reserved to represent the meaning or functionality such types of words are called reserved words
         * Total 53 reserved words are there 50 keywords are there and 3 literals are there
         * Literals words are True,False,null
         * In Keywords 43 are used keywords(if, if-else...e.t.c) are there and unused keywords are 2 they are goto, const
         * Keywords for Data types byte,short,int,long,float,double,boolean,char
         * Keywords for flow control if,if-else,switch,case,default,while,do,for,break,continue,return
         * keywords for modifiers public,private,protected,strictfp,static,final,abstract,synchronized,native,transient,volatile
         * Keywords for exception handling try,catch,final,throws,throw,assert
         * Keywords for class related ,interface,import,extend,implements,package
         * Keywords for object related new,instanceof,super,this
         * void return type keyword
         * if a method won't return anything then declare that method with void return type
         * But in c language type is optional and default return type is int
         * unused keywords usage of goto created several problems in old languages and hence and some people banned this keyword in java
         * const use final instead of const unused keyword. goto and const are unused keywords and if you are trying to use we will get compile time error
         * reserved literals true and false are values for boolean data types .Default value for object reference
         * we can use enum to define a group of named constants
         * Conclusions:
         * 1.All 53 reserved words in java contains only lower case alphabet letters
         * 2.There is no delete keyword is not there because destruction of useless objects is the responsibility of garbage collector
         * 3.The strictfp,enum,assert are following are new keywords in java
         * strictfp but not strictFp,import but not imports,instanceof but not instanceOf,extends but not extend,implements but not implement,const but not constant,synchronized but not synchronize
         * In java every variable and every expression has some type each and every type the data is clearly define every assignment should be checked compiler for type compatibility so because of above reasons we can conclude java language strongly typed programming language
         * java is not consider as pure objected oriented language because several oops features are not satisfied  by java like operator overloading and multiple inheritance e.t.c
         * more over we are depending on primitive data types which are non objects.
         * The primitive data types are 8 primitive data types and there are 2 types numeric data types and non numeric data types
         * Numeric data types are integral data types are byte,int,long,short and floating point data types are double, float.
         * And non numeric data types are char and boolean.
         * except boolean and char remaining data types are considered as signed data types because we can represent both positive and negative numbers.
         * Byte size  1 byte (8 bits) . max_value=127 and min_value=-128, range -128 to 127.
         * The most significant acts as sign bit o means positive number and 1 means negative number positive numbers will be represented directly in the memory where as negative numbers will represent in 2's complement form.
         *  */
        byte b = 10;
        byte b1 = 127;
//    byte b2=128;
//    byte b3=true;
//    byte b4="durga";
//    byte b5=10.5;
        /*Byte is the best choice If you want to  handle data in types of streams either from the file or from the network(file supported form and network supported form is byte)
         * Short data type most rarely used in java . size is 2 bytes(2 bits) range is -32768 to 32767*/
        short s = 32767;
//    short s1=32768;
//    short s2=true;
//    short s3=10.5;
        /*short data is suitable for 16-bit processors like 8085 but these processor completely out dated and hence short data type is also outdated data type*/
        /*int data type mostly common used data type in java.size 4 bytes(32 bits).range -2147483648 to 2147483647 */
        int i = 2147483647;
        //int i1=2147483648;//integer number too large
        // int l=2147483648l;
        /*sometimes int may not enough to hold big values then we should long type example the amount of distance the travelled by light in 1000 times to hold this value int may not enough we should go for long data type*/
        long l = 126000L * 60 * 60 * 24000;
        System.out.println(l);
        /*The number of characters present in a big file may access int range. Hence, the return length method is long but not int
        * long l=f.length(); size 8 bytes,Range -2^63 to 2^63-1
        * note: All the above data types byte,short,int,long meant for representing integral values.If you are represent floating point values then should go for floating data types
        * Floating point data types:Float and double
        * If you what 5 to 6 decimal parts accuracy go for float and for 14 to 15 the decimal parts accuracy go for double
        * Float flows single precision and double flows double precision
        * size 4 bytes in float and size 8 bytes in double
        * And the range in double is -1.7e38 to 1.7e38 and for float range is-3.4e38 to 3.4e38
        * In java size of boolean is not applicable real word virtual machine dependent and range is not applicable but allowed values are true/false
        * */
      /*  int x=0;
        if(x){//the required is boolean
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
        while(x){//the required is boolean
            System.out.println("hello");
        }*/

/*Char data type:old languages (c/c++) are ascii code based and the number of allowed difference ASCII code characters a<- 256 to represent this 256 characters 8 bits are enough.Hence the size of char in the old languages is byte
* But the java is unicode based and the number different unicode character is greater than 256 and less than are equal to 65536 to represent this characters 8 bits may not enough compulsory we go for 16 bits hence  the size of char in java is 2 bytes and range is 0 to 65536
* null is the default value for object reference and we can't apply for primitives if you are trying to for primitives then we will get compile time error.
*Literal:
* A constant value which can be assigned to the variable is called literal ex:int x=10, 10 is a constant value or literal.
* integral literals:For integral data types byte,short,int ,long we can specify literal value in the following ways.
* 1.decimal literals:(base 10) allowed digits are 0to9 int x=10;
* 2.Octal form base 8 allowed digits are 0 to7
* literal value should be prefixed with zero ex: int x=010
* 3.Hexadecimal form allowed digits are 0 to 9,a to f java is case-sensitive programming language.we can use both lower case and upper case characters.This is one of very few areas where java is not case-sensitive.
* The literal value should be prefixed with 0X or 0x ex:int x=0x10
*  These are only possible literal value for integral data types */
       int p=10;
       int k=010;
       int j=0x010;
        System.out.println(p+"..."+k+".."+j);
/*By default, every integral literal is of int type but we can specify explicitly is a long type by suffixed l or "L"*/
long m=10;
//int n=10l;//possible loss of precision
        /*There is no direct to specify byte and short literals explicitly but indirectly we can specify
        * when ever we are assigning integral literal  to the byte variable and if the value with in the range of byte then compiler treats it automatically as byte literal.
        * Similarly short literal also
        * Floating point literals:
        * By default every floating point literal is of double type and hence we can't assign directly to the float variable
        * But we can specify floating point literal as float type by suffixed with small f or capital F*/
        float h=123.456f;
        double o=123.456;
        /*we can specify explicitly floating point literal as double type by suffixed with D or d off course this convention is not required  */
        /*we can specify floating point literal only in decimal form and can't specify in octal and hexadecimal forms*/
        double d1=123.456;
        double d2=0123.456;
        //double d3=0x123.456;//malformed floating point literal
        /*we can assign integral literal directly  to floating point variables and that integral literal can be specified either in decimal or octal or hexadecimal forms */
        //double D1=0786;//integral number to large
        double D2=0XFACE;
        double D3=0786.0;
        //double D4=0XFACE.0;//
        double D5=10;
        double D6=0777;
        /*we cant assign floating point literal to integral types*/
        double g=10;
       // int b=10.0;
        /*we can specify floating point literal even in exponential form (scientific notation)*/
        double n =1.2e3;
        float b7=1.2e3f;
        /*Boolean literals*/
        /*The only allowed values of only allowed values are true or false*/
        /*Char literals*/
        /*we can specify char literals single character within single quotes */
        char ch='a';
        /*we can specify char literal as integral literal which represents unicode value of the character and the integral literal can be specified either in decimal or octal or hexadecimal forms but allowed range is 0 to 65535/**/
      char ch1=0XFACE;
      char ch2=0777;
      char ch3=65535;
        System.out.println(ch1+".."+ch2+".."+ch3);
      //char ch4=65536;//www.unicode.org
        char m1='\u0061';// 4 digit hexa decimal number itself is 'a';
        /*escape charaters present in java*/
        //'\n','\t','\r','\b','\f','\\','\'','\"'
        /*String literals
        * Any sequence of characters within double quotes is treated as String literals*/
        String s1="lava";
        /*Binary literals*/
        /*usage _ symbol in numerical literals*/
        /*from 1.7 version onwards we can use _ symbol between digits of numeric literals*/
        double j1=12345.789;
        double j2=1_23_45.7_8_9;
        double j3=123_456.789;
        /*At the time of compilation this underscore symbol remove automatically hence after compilation the above line will become double d=123456.789 */
                /*The main advantage of this approach is readability of code will be improved*/
        /*we can use more than one underscore also between the digits*/
        double n1=1_2_3_4_5_6.78_9;
        /*byte->short>int->long->float->double
        * char->int->long->float->double
        * 8 byte long value we can assign to 4 byte float variable because both are following different memory representation internally
        * */
        float g1=10l;
        System.out.println(g1);











    }
}
