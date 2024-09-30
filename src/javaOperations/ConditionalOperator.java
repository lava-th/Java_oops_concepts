package javaOperations;

public class ConditionalOperator {
    public static void main(String[] args){
        //Conditional operator (?:)
        /*The only possible ternary operator  in java is conditional operator
        */

        int x=(10<20)?30:46;
        System.out.println(x);
//          * we can perform nesting of operator also*/
        int y=(10>20)?30:((46>67)?68:90);
        System.out.println(y);
        /*we use new operator: To create a object
        **/
        ConditionalOperator conditionalOperator=new ConditionalOperator();
        /*After creating an object constructor will be executed to perform initialization of an object.Hence, constructor not for creating an object it uses for initialization of object
        * In java we have new keyword but not delete keyword because the destruction useless object responsible for garbage collection*/
        /*[] operator:To declare and create arrays concept use this operator
        */
        int[] a=new int[10];

    }
}
