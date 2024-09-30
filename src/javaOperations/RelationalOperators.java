package javaOperations;

public class RelationalOperators {
    public static void main(String[] args){
        //(<,<=,>,>=)
        System.out.println(10<20);
        System.out.println('a'<10);
        System.out.println('a'<97.6);
        System.out.println('a'>'A');
        //System.out.println(true>false);
        /*we can apply relational operator for every primitive type expect boolean
        *we can apply relational operators for object types*/
       // System.out.println("lava123">"hi");
        /*distinct of relational operators  are not allowed we will get compile time error*/
        //System.out.println(10<20<30);//true<30;operator cannot be boolean,int


    }
}
