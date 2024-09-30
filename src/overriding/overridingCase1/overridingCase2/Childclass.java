package overriding.overridingCase1.overridingCase2;
/*From 1.5 onwards parent return type to child return type of same methods is not possible
* parent is Object and child return types are Object,string,stringBuffer
* Number parent method return type for child return type methods are Number,Integer,float,long ,double,Byte*/
public class Childclass extends Parentclass{
    public Number m1(){
        return 10;
    }
}
