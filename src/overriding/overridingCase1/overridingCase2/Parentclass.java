package overriding.overridingCase1.overridingCase2;
/*In Overriding the return type must be same but this rule is applicable until 1.4v
* After 1.5v onwards co-variant return types are allowed
* what is co-variant return type child method return type is need not be parent method return type its child type also allowed, child type means String,StringBuffer,int any type is allowed such type of return type is called co-variant return type concept
* covariant return type is not applicable for primitives applicable for objects */
public class Parentclass {
    public Number m1(){
        return 10.25;
    }
}
