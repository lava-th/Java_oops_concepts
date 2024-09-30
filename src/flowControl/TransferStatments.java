package flowControl;

public class TransferStatments {
    public static void main(String[] args){
        /*we can use break statement in the following places inside switch to stop fall through */
        /*1.Inside switch*/
        System.out.println("Inside switch");
        int x=0;
        switch(x){
            case 0:
                System.out.println(0);

            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);

            case 3:
                System.out.println(3);

            default:
                System.out.println("def");

        }


        System.out.println("Inside loop");
        /*2.Inside loops:To break loop excution based on some condition*/
        for(int y=0;y<10;y++){
            if(y==5)
            break;
            System.out.println(y);
        }


        System.out.println("Inside label block");
        /*3.Inside label blocks to break block excution based on some condition*/
        int m=10;
        l1:
        {
        System.out.println("begin");
        if(m==10)
            break l1;
            System.out.println("end");
        }
        System.out.println("Hello");
        /*These are only the statments where we use break  if you use any where else we will get compile time error saying break outside switch or loop*/




//        int b=10;
//         if(b==10)
//          break;//Break statement outside switch or loop
//        System.out.println("true");

        /*Continue statement:we can use continue statement inside the loops to skip current iteration and continue for the next iteration*/
        /*continue st*/
        for(int u=0;u<10;u++){
            if(u%2==0)
                continue;

                System.out.println(u);
            }

//        int b1=10;
//       if(b1==10)
//         continue;//continue outside of loop
//       System.out.println("true");
            /*we can use continue statement only inside loops if we are using any where else we will get compile time error saying continue outside of loop*/


        /*labeled :labeled break and continue statement
        * */
//        l1:
//        for(){
//            l2:
//            for(){
//                l3:
//                for(){
//                    break l1;
//                    break l2;
//                    break l3;
//                }
//            }
//        }
        /*we can use labled break and continue to break or continue a particualr loop in nested loops
        *  */
        System.out.println("break ");
        l1:
        for(int h=0;h<3;h++){
            for(int j=0;j<3;j++){
                if(h==j)
                break;
                System.out.println(h+"-------------"+j);
            }

        }
        System.out.println("Break l1");

        l1:
        for(int h=0;h<3;h++){
            for(int j=0;j<3;j++){
                if(h==j)
                    break l1;
                System.out.println(h+"-------------"+j);
            }

        }
        System.out.println("continue ");

        l1:
        for(int h=0;h<3;h++){
            for(int j=0;j<3;j++){
                if(h==j)
                   continue;
                System.out.println(h+"-------------"+j);
            }

        }
        System.out.println("continue l1");

        l1:
        for(int h=0;h<3;h++) {
            for (int j = 0; j < 3; j++) {
                if (h == j)
                    continue l1;
                System.out.println(h + "-------------" + j);
            }
        }
            /*Dangerous combination:dowhile() vs continue*/
            System.out.println("dangerous combination");
            int e=0;
            do{
                e++;
                System.out.println(e);
                if(++e<5)
                    continue ;
                e++;
                System.out.println(e);


            }while(++e<10);




        }

    }

