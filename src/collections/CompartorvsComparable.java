package collections;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
    String name;
    int eid;
    Employee(String name,int eid){
        this.name=name;
        this.eid=eid;
    }
    public String toString(){
        return name+"__"+eid;
    }
    public int compareTo(Object obj){
        int eid1=this.eid;
        Employee e=(Employee)obj;
        int eid2=e.eid;
        if(eid1<eid2){
            return -1;
        }
        else if(eid1>eid2){
            return 1;
        }
        else return 0;
    }

}

public class CompartorvsComparable {
    public static void main (String[] args){
        /*Comparable vs comparator for predefined comparable classes default natural sorting order already available if we are not satisfied with that default sorting order then we can define our own sorting by using comparator
         * For predefined non-comparable classes (like StringBuffer) default natural order not already available we can define our own sorting by using comparator
         * For our own class like employee, the person who is writing the class is responsible to define default natural sorting order by implementing comparable interface
         * The person who is using our class, if he is not satisfy with default natural sorting order then he defines own sorting by using comparator
         * pre-defined comparable classes String is comparator
         * pre-defined non-comparable classes String buffer is comparator
         * our own classes employee the person who is writing this class comparable(default natural sorting order)
         *  our own classes employee the person who is using this class comparator (customized sorting)*/
Employee e1=new Employee("NIKHIL",100);
        Employee e2=new Employee("NAG",120);
        Employee e3=new Employee("CHIRU",190);
        Employee e4=new Employee("BALA",130);
        Employee e5=new Employee("VENKI",546);
        Employee e6=new Employee("NANI",10);
        System.out.println("without comparator ");
        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);
        System.out.println(t);
        System.out.println("with comparator");
        TreeSet  t1=new TreeSet(new MyComparators()) ;

        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);
        System.out.println(t1);


    }

}
class MyComparators implements Comparator {
    public int compare(Object obj1, Object obj2) {
Employee e1=(Employee) obj1;
Employee e2=(Employee) obj2;
String s1=e1.name;
String s2=e2.name;
return s1.compareTo(s2);

    }
}
/*Comparison of comparable and comparator
* Comparable meant for default natural sorting order
* comparator is customised sorting order
* comparable present in java.lang package
* comparator present in java.util package
* comparable it defines only one method compareTo()
* comparator it defines  2 methods compare() and equals()
* comparable String and all wrapper classes implements comparable interface
* comparator The only implemented class of comparator or collator rule based collator*/

/*comparable table of set implemented classes
* property Hashset ,LinkedHashset and Treeset
* Underlying data structure is for hash set is hash table and linked set is lisnkedlist and Hashtable and treeset is balanced Tree
* duplicate objects are not allowed in hash set, linkedhash set and Tree Set
* Insertion order are not preserved in hashset and treeset, it is  preserved in linkedHashSet
* Sorting order is not applicable in Hashset and LinkedHashSet and only applicable in TreeSet
* Heterogeneous objects are allowed in Hashset and LinkedHashSet and not allowed in TreeSet
* Null acceptance allowed int HashSet and LinkedHashSet and for empty TreeSet as first element null is allowed
* Note:For empty treeset as the first element null is allowed but rule is applicable for until 1.6 v only from 1.7 v onwards null is not allowed even of the first element  */

