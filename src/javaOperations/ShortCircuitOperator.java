package javaOperations;

public class ShortCircuitOperator {
    public static void main(String[] args) {
        //shortCircuitOperator(&& or ||)
        /*These are exactly same as bitwise operators (& |)except the following reference
         * Normal bit wise operators Both arguments should be evaluated always, Short circuit operators second argument evaluation is optional
         * Normal bit wise operators Relatively performs is low,Short circuit operators Relatively performs is high
         * Normal bit wise operators Applicable for both boolean and integral types,Short circuit operators Applicable for only boolean but not for integral types
         * Note:x&&y y will be evaluated if only if is x is true i.e if x is false then Y won't be evaluated
         * x||y 'y' will be evaluated if only if x is false i.e if x is true then Y won't be evaluated*/
        int x = 10, y = 15;
        int x1 = 10, y1 = 15;
        int x2 = 10, y2 = 15;
        int x3 = 10, y3 = 15;
        if (++x < 10 && ++y > 15) {
            x++;

        } else {
            y++;

        }
        System.out.println("x value is" + x + ",,,,,,,y values is" + y);

        if (++x1 < 10 || ++y1 > 15) {
            x1++;

        } else {
            y1++;

        }
        System.out.println("x value is" + x1 + ",,,,,,y values is" + y1);
        if(++x2<10 & ++y2>15){
            x2++;

        }else{
            y2++;

        }
        System.out.println("x value is"+x2+",,,,,,,,,y values is"+y2);
        if(++x3<10 | ++y3>15){
            x3++;

        }else{
            y3++;

        }
        System.out.println("x2 value is"+x3+",,,,,,,,,,,y2 values is"+y3);
        int x4=10;
        if(++x4<10 && (x4/0>10)){
            System.out.println("hi");

        }else{
            System.out.println("hello");

        }
        /*If we replace && and  replace with & then we will get run time exception saying arithmetic division by zero*/


    }
}
