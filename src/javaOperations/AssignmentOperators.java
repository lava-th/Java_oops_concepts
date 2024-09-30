package javaOperations;

public class AssignmentOperators {
    public static void main(String[] args){
        /*There are three types of assignment operators
        * simple assignment*/
        int x=10;
        System.out.println(x);
        /*chained assignment
        * we can't be performed chained assignment directly at the time of declaration*/
        int b,c,d;
        c=b=d=67;
        System.out.println(b+",,,,,"+c+",,,,"+d);
        int a=b=c=d=45;
        System.out.println(a+",,,"+b+",,,,,"+c+",,,,"+d);
        /*compound assignment        *  operators mixed some other operators such type of operators are called compound assignment operators
        * The following are all possible compound assignment operators in java
        * +=,-=,%=,/=,*=,|=,&=,^=,>>=,>>>=,<<=*/
        int a1=10;
        a1+=90;
        System.out.println(a1);
        /*In the case of compound assignment operators internal typecasting is perform automatically*/
        byte b1=10;
       // byte b=b+1;
        b1++;
        System.out.println(b1);
        byte b2=10;
        b2+=1;
        System.out.println(b2);
        byte b3=127;
        b3+=3;
        System.out.println(b3);
        int p1,q1,w1,g1;
        p1=q1=w1=g1=45;
      p1+= q1 -= w1 *= g1 /= 45;
        System.out.println(p1+",,,"+q1+",,,,,"+w1+",,,,"+g1);


    }
}
