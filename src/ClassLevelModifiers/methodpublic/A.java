package ClassLevelModifiers.methodpublic;
/*If member is the public the class should be visible if class is not visible then you will get compile time error
* The class should be public and members should be public then only access
* If the members declare as default it accesses with in the package only
* If the members declare as private it accesses in the class only
* Private means class level
* default means package level
* public means global level
* private is highly recommended modifier for variables because the private members cannot access from outside
* Data hiding is very important in oops so recommended modifier is private
* our data should not access directly from outside
* Recommended modifier of methods is public
* protected=default+kids
* when members are declare as protected it access within the package are outside the package only child class */
public class A {
 protected void m1(){
        System.out.println("This is m1 method A class");
    }

}
