package overriding.overridingCase1.OverridingCase3;
/*It is valid the same private method also in child class but not overriding
* Final overriden methods also can't be overriding*/

public class PrivateMethodtest {
    public static void main(String[] args){
        ParentPrivateMethod p1=new ParentPrivateMethod();
       // p1.m1();
        ChildPrivateMethod c1=new ChildPrivateMethod();
        //c1.m1();
    }
}
