package methodOverloading;
/*String buffer and string class argument type has no relation so they are independent
* both are child class only object is the parent class of both String and string Buffer
* so if the call null it get compile time error as ambiguous method because the method are same and same argument type*/
public class OverloadingCase3 {
    public void m1(String s){
        System.out.println("the string method");
    }
    public void m1(StringBuffer b){
        System.out.println("the stringBuffer method");
    }
    public static void main(String[] args){
        OverloadingCase3 ov3=new OverloadingCase3();
        ov3.m1("hello");
        ov3.m1("hi");
        //ov3.m1(null);//ambiguous error
    }
}
