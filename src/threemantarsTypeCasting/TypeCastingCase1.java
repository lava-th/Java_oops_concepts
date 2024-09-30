package threemantarsTypeCasting;
/*The syntax for type casting is A b=(C) d;
* Here we are converting d type object to C type now it becomes C type and this C type object we are assigning with A type reference variable as b.
* In this what compiler will check and what JVM will check they are 3 mantars are there to check
* They are 2 rules or checked by compiler and 1 rule or checked by JVM
* 1.compile Time checking: The type of d and c must have some relationship either parent to child or child to parent or same type otherwise the compile time error will get
The conversion of d type object to C type this conversion is legal or not the compiler will check
* 2.Compile Time checking:Here the C is must be same as A or its child type
* once it checked above rule is legal as compiler will check is the assignment(assigning with A type reference variable as b) itself is legal are not
*3.CompileTime checking: The internal run type object type of d type must be either same as C or its child type of C, otherwise will get class cast error
* */
public class TypeCastingCase1 {
    public static void main(String[] args){
        String o=new String("durgs");
        String s=new String("hello");
        //StringBuffer sb=(StringBuffer) o;//Here the object 'o' and StringBuffer as parent to child relationship is there rule 1 is passed
        //StringBuffer sb1=(StringBuffer) s;//Inconvertible type error
       // StringBuffer sb1=(String) s;//Assignment is the error String is not the child type of StringBuffer. String cannot be converted to string Buffer
        //StringBuffer sb21=(StringBuffer) o;//At run time the internal object type of 'o' is new String type and it is not same as StringBuffer so it get run time error as class cast error.
        String s1= (String) o;//No issue
        System.out.println(s1);
        String s2=(String) s;
        System.out.println(s2);
    }
}
