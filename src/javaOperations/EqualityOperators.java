package javaOperations;

public class EqualityOperators {
    public static void main(String[] args){
        //(==,!=)
        /*we can apply equality operator for every primitive type including boolean type also*/
        System.out.println(10==20);
        System.out.println('a'=='b');
        System.out.println('a'==97.0);
        System.out.println(false==false);
        System.out.println("lava"=="lava");
        /*we can apply equality operators for object type also for object  reference r1,r2 r1==r2 returns true if and only if both reference is pointed to same object only reference comparison or address comparison*/
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);
        Thread t=new Thread();
        Object o=new Object();
        String s=new String();
        System.out.println(t==o);
        //System.out.println(t==s);////java: incomparable types: java.lang.Thread and java.lang.String
        /*If we apply relation operators for object types then compulsory there should some relation should be argument types either child to parent or parent to child are same type otherwise we will get compile time error saying incomparable types*/
        System.out.println(o==s);
        /*what is different == equal operator and .equals() operator
        * == operator is meant for reference comparison (address comparison) and .equals() is meant for content comparison  */
        String s1="lava";
        String s2="lava";
        System.out.println(s1==s2);//false
        s1.equals(s2);//true
        /*note:For any object reference are r==null is always false*/
        String s4=new String("lava");
        System.out.println(s==null);
        /*but null==null is always true*/
        String s5=null;
        System.out.println(s==null);
        System.out.println(null==null);


    }
}
