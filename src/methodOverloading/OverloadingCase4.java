package methodOverloading;
/*The general int method and var-arg method are related based on the versions the general int is old version and var-arg is new version so here old version is take the priority when compare the both methods
* var-arg method is the least priority of the all the methods like switch case the default is the execute if no case is matches is similar as var-arg method
* var-arg is 0 int value and any number of int values*/


public class OverloadingCase4 {
    public void m1(int i) {
        System.out.println("this is int method");
    }
    public void m1(int... i){
        System.out.println("this is var-arg method");
    }
    public static void main (String[] args){
        OverloadingCase4 ov4=new OverloadingCase4();
        ov4.m1(10,20);//var arg method
        ov4.m1(10);//general int method
        ov4.m1();//var-arg method


    }
}
