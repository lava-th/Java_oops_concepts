package flowControl;

public class SelectionStatment {
    public static void main(String[] args) {
        /*flow control describe the order the statements will be executed at run time
         * 1.Selection Statements:If else,switch
         * 2.Iterative statements:While(),dowhile(),for(),for-each loop(1.5v).
         * 3.Transfer statements:Break,continue,return,try catch finally,assert(1.4v).*/
        /*Selection statements:If else*/
        /*if(b){-->if b should be boolean type
         * action if b is true
         * }else{
         * the action b is false
         * }*/
        /*The argument of if should be boolean type by mistake we provide any other type then we will get compile time error
         * */
        int x = 10;
//        if(x){
//            System.out.println("hi");
//        }else{
//            System.out.println("hello");
//        }
//        if(x=20){
//            System.out.println("hi");
//        }else{
//            System.out.println("hello");
//        }
        if (x == 20) {
            System.out.println("hi1");
        } else {
            System.out.println("hello1");
        }
        boolean b = true;
        if (b = false) {
            System.out.println("hi2");
        } else {
            System.out.println("hello2");
        }
        boolean b1 = false;
        if (b1 == false) {
            System.out.println("hi3");
        } else {
            System.out.println("hello3");
        }
        if (true) {//valid
            System.out.println("hello45");
        }
        if (true) ;//valid
        if (true) {//valid
            int x1 = 10;
        }
//        if(true)
//            int x1=10;//invalid
        /*else part and curly braces are optional without curely braces only one statement is allowed under if which should not be declarative statement
         * ; is valid java statement which also know as empty statement
         * There is no daglling else problems in java every else is mapped to the nearest if statement*/
        if (true) {
            if (true) {
                System.out.println("hello5");
            }
        } else {
            System.out.println("hi5");
        }

    /*If several options are available then it is not recommened to use nested if else because it reduces readability.To handle this requirement we should go for switch statement
    Syntax:*/
//    switch(y){
//        case 1:action 1;
//        break;
//        case 2:action 2;
//            break;
//        case 3:action 3;
//            break;
//        default:default action;
//
//    }
        /*The allowed argument type 'y' for the switch statements are byte,short,int,char until 1.4v but from 1.5v onwards crossponding wrapper class and enum from 1.7v onwards String type is also allowed
         * curly bases are mandatory except switch
         * Both case and default are optional i.e an empty switch statement is valid java syntax */
//        int v = 10;
//        switch (v) {
//            System.out.println("hello");
//        }
        /*Inside switch every statement should be under case or default that is independent statements or not allowed inside switch otherwise we will get compile time error*/

        int m = 10;
        final int n = 20;
        switch (m){
            case 10:
            System.out.println(10);
            break;
            case n:
            System.out.println(20);
            break;
        }
        /*every caselabel should be compile time constant that is (constant expression)
        * if we declare n as final then we won't get compile time error*/
        /*Both switch argumetn and case label can be expression but case label should be constant expression*/
        int k=10;
        switch(k){
            case 10:
                System.out.println(10);
            case 10+20+30:
                System.out.println(60);
        }
//        byte t=10;
//        switch (t){
//            case 10:
//                System.out.println(10);
//                break;
//            case 100:
//                System.out.println(100);
//                break;
//            case 1000:
//                System.out.println(1000);
//                break;
//        }
        byte h=10;
        switch (h+1){
            case 10:
                System.out.println(10);
                break;
            case 100:
                System.out.println(100);
                break;
            case 1000:
                System.out.println(1000);
                break;
        }
        /*every case label should be in the range of switch argument type otherwise we will get compile time error*/

//        byte h1=10;
//        switch (h1){
//            case 97:
//                System.out.println(97);
//                break;
//            case 98:
//                System.out.println(98);
//                break;
//            case 99:
//                System.out.println(99);
//                break;
//            case 'a'://here 'a' is 97
//                System.out.println('a');
//        }
        /*duplicate case labels are not allowed otherwise we will get compile time error*/
        /*summary:
        * 1.It should be constant expression
        * 2.The value should be in the range of switch argument type
        * 3.Duplicate case labels are not allowed*/
        /*Fall through inside switch:*/
        System.out.println(".........................................");
       int r=0;
        switch (r){
            case 0:
                System.out.println(0);

            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);

            default:
                System.out.println("default");

        }
        /*within the switch if any case is matched from that case onwards all statements will be executed until break are end of the switch this is called fall through inside switch.
        * The main advantage of fall through inside the switch is we can define common actions for multiple access(code reusability)*/
        int o=6;
        switch (o){
            case 0:


            case 1:

            case 2:
                System.out.println("q-4");
                break;
            case 4:


            case 5:

            case 6:
                System.out.println("q-1");
                break;

            default:
                System.out.println("default");

        }
        /*default case:
        within the switch we can take default statement recommened use at most once (at zero time or once)
        default statement will be executed if and only if there is no case matched within switch we can write default case anywhere but it is recommended to write as last case*/
        int m1=1;
        switch(m1){
            default:
                System.out.println("def");
            case 0:
                System.out.println(0);
                break;

            case 1:
                System.out.println(1);

            case 2:
                System.out.println(2);
        }
    }
}
