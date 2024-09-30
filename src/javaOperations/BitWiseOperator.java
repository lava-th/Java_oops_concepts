package javaOperations;

public class BitWiseOperator {
    public static void main(String[] args){
        //Bitwise operator(&,^,|)
        /*&-And-->Return true if both arguments are true
        * |-or-->Return true if at least one argument is true
        * ^-XOR-->Return true if only is both arguments are different*/
        System.out.println(true&false);
        System.out.println(true|false);

        System.out.println(true^false);
        /*we can apply this operators for integral types also*/
        System.out.println(4&5);
        System.out.println(4^5);
        System.out.println(4|5);
        //BITWISE compliment operators
        /*we can apply this operator for only for integral types not for boolean if we are trying to apply boolean type then we will get compile time error
        * */
        System.out.println(~4);
        /*Note: 32 bit compliment to perform not for 4 bit
        * The most significant bit acts as signed bit o is positive number and 1 is negative number ,positive numbers will be represented directly whereas negative number will be acts as indirectly in memory in 2's complementary form

        //System.out.println(~true);
        * boolean compiment operator(!)
        * we can apply this operator only for boolean type not for integral type*/
        //System.out.println(!4);//operator negotiation cannot be applied int
        System.out.println(!false);
        /*&,^,| is applicable for both integral and boolean type
        * ~ is applicable for integral types not for boolean type
        * ! is applicable for boolean type not for integral type */
    }
}
