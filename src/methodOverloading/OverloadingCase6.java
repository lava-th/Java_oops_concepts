package methodOverloading;

public class OverloadingCase6 {
    public void m1(int i,float f){
        System.out.println("int-float method");
    }
    public void m1(float f, int i){
        System.out.println("float-int method");
    }
    public static void main(String[] args){
        OverloadingCase6 ov6=new OverloadingCase6();
        ov6.m1(10,10.5f);
        //ov6.m1(10,10);//ambiguous method
       // ov6.m1(10.5f,10.5f);//ambiguous method
    }
}
