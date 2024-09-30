package javaOperations;

public class PrecedenceOfOperator {
    public static void main(String[] args){
        /*java operator precedence chat
        * 1.Unary operator
        * [],x++,x--
        * ++x,--x,~,!
        * new,<type>
        2.Arithmetic operators:
        * *,/,%
        * +,-
        * 3.shift operators:
        * >>,>>>,<<
        * 4.Comparison operators:
        * <,<=,>,>=,instanceof
        * 5.equality operators
        * ==,!=
        * 6.Bitwise Operators:
        * &
        * ^
        * |
        * 7.short circuit operators:
        * &&
        * ||
        * 8.conditional operators:
        * ?:
        * 9.Assignment operators:
        * =,+=,-=,*=,.....*/
        /*Evaluation order java operands
        * In java we have oly operator precedence but not operands precidence before applying any operators all operands will be evaluated from left to right*/
        System.out.println(m1(1)+m1(2)-m1(3)*m1(4)/m1(5)+" Result");
    }
    public static int  m1(int i){
        System.out.println(i);
        return i;
    }
}
