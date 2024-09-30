package overriding.overridingCase1;
/*If the child class is not satisfied with parent method implementation then the child is allowed to redefine the method based on the requirement
* This process is called overriding
* In overriding the method resolution takes place by JVM based on the run time object
* that's why overriding is also called dynamic polymorphism ,run polymorphism or late binding polymorphism*/

public class A {
    public void property(){
        System.out.println("cash+gold+land");

    }
    public void marry(){//override method
        System.out.println("Subbalaxmi/sofia");
    }

}
