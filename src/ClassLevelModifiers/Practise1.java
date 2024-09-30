package ClassLevelModifiers;
/*If the class is public you can access in any where
* If the class is not public the class is called default class and can access with in the package only
* If the class is abstract class you cannot create a object and if it is not an abstract class is able to create object
* The JVM decided the class is abstract are not by based on class level modifiers
* object creation is also called instantaneous
* If class is final child class creation is not possible
* By using operator modifier we describe behaviour of the class
* For top level classes the 5 modifiers are allowed public>default>abstract>final>strictfp
* But for inner classes 8 modifiers are available public,default,abstract,final,strictfp,private,protected,static*/

 public class Practise1 {
     public static void main (String[] args){
         Class1 cl=new Class1();
     }

}
