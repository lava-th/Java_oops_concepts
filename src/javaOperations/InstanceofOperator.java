package javaOperations;

import encapsulation.Student;

import java.sql.SQLOutput;

public class InstanceofOperator {
    public static <Customer> void main(String[] args){
        /*we can use instance of operator to check weather the given object is of particular are not*/
        int[] l=new int[4];
        Object o=l[0];
        if(o instanceof Student){
            Student s=(Student)o;
            //perform student specific functionality

        }
        else  {

            Customer c=(Customer)o;
            //perform student specific functionality
        }
        /*r instanceof x here r is object reference and x is class/interface Name*/
        /*Thread is parent is object and runnable is the interface of thread implementation*/
        Thread t=new Thread();
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);
        //System.out.println(t instanceof String);//Inconvertible types; cannot cast 'java.lang.Thread' to 'java.lang.String'
        /*to use instance of operator  compulsory there should be have relationship between argument child to parent or parent to child otherwise we will get error is inconvertible
        * for any interface or class x null instanceof x is always false*/
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Runnable);




    }
}
