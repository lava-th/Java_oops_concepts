package basic2;

import java.util.ArrayList;
import java.util.regex.*;

public class Import {
    public static void main (String[] args){
        java.util.ArrayList l=new java.util.ArrayList();//This type of name is called fully qualified name
        /*If you used 10 times like above pattern it is not a readable code is down and length of the code is increases.
        for that shortcut have to say the compiler when ever use the  array list consider the java.util package the way is import the statement
        For the import statement the code is reduced and readable
        import statements are best typing shortcut
        They are two import types are there 1.Explicit import 2.Implicit import
        Explicit import is the where directly (import.java.util.AL) act if you want a particular array list class only such type of import  is called Explicit import
         All class present in java.util.* package can make it available such type of import is called Implicit import
         But which is import statement recommended should use even you are using 100 classes of the same package you should go compulsory explicit import because it improves the readability of the code wise is too good, and it is not recommended to implicit import
         Every java IDE the explicit import is generated
         some java packages are available default like
         1.java.lang package are commonly required for every program example String class
          All class under interface present in java.lang package access without writing an import statement.
          2.If you are using class in the current package import statement is not required that is called Default package in current working Directory
          If you are using the class in other package then should write the import statement is required.
          when ever you are importing the regex package all classes  interface present in that package by default available but not sub package classes.
          you should import subpackages required import statement java.util.regex.*
          Inside any java program at most one package statement is allowed if you take more than one package in a program then it get compile time error
          Inside any java program any number of import statement and any number of class/interface/enum are acceptable.
          The first package statement and next import statement and after class/interface/enum is required the order is important for the program if it is not there in ordered than will get compile time error

          */
        ArrayList al=new ArrayList();
        Pattern p= Pattern.compile("ab");
    }
}
