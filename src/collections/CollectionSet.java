package collections;

import Interface.Interf;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionSet {
    public static void main(String[] args){
        /*Set:set is child iterface of collection
        If we won't  represent a group of individual objects as a single entity where duplicates are not allowed and insertion order not preserved
        * set->hashSet->linkedHash
        * set->sortedset->NavigableSet->TreeSet
        set interface doesn't contain any new methods, and we want to use only collection interface methods

        HashSet:The underlying of hash set is hash table
        duplication order is not preserved Insertion order is not preserved and it based on hash code objects.
        null insertion is possible(only once) . heterogeneous objects is allowed .Implements serializable,cloneable but not random access interface
        hash set is the best choice if ever frequent operation is search operation.
        Note: In hash set duplicates are not allowed if we are trying to insert duplicates then we won't get any compile time run time errors and add method simply returns false.
        Constructors:*/
        HashSet h=new HashSet();//creates any empty hashset objects with default initial capacity is 16 and default fill ratio is 0.75
        System.out.println(h.add("A"));//true
        System.out.println(h.add("A"));//false
        // HashSet h=new HashSet(int initialCapacity);//creates an empty hash set object with specifies initial capacity and default fill ratio is 0.75
        HashSet h1=new HashSet( 27);
        //HashSet h=new HashSet(int initialCapacity,float fillRatio);
     //HashSet h=new HashSet(Collection c);//creates an equivalent hash set for the given collection
        /*This constructor meant for interconversion between collection objects.
        * Fill Ratio or load factor:After filling how much ratio a new hash set object will be created, this ratio is called fill ratio or load factor for example fill ratio 0.75 means after filling 75% ratio a new hash set object will be created.
        * */
        System.out.println("Hashset---------------------");
        h.add("B");
        h.add("D");
        h.add("Z");
        h.add("C");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h);
        /*LinkedHashSet:it is the child class of hashset it is exactly same as hashset (including constructors and methods) except the following differences.
        * Different between LinkedHashSet and HashSet.
        * Hashset insertion order is not preserved and linked hash set insertion order is preserved
        * the underlying structure is Hashset is hashtable and the underlying datastructures is linked hash set is hash table+ linked list
        * Hash set Introduced in 1.2 version and Linkedhash set introduced in 1.4 version
        * If the above program replace  hash set with linkedHashSet is [B, D, Z, C, null, 10]that is insertion order preserved */
        System.out.println("LinkedHashSet------------------------");
        LinkedHashSet l=new LinkedHashSet();
        l.add("B");
        l.add("D");
        l.add("Z");
        l.add("C");
        l.add(null);
        l.add(10);
        System.out.println(l.add("Z"));
        System.out.println(l);
        /*Note: In general we can use linked hash set to develop cache based application where duplicates are not allowed and insertion order preserved.
        * SortedSet:it is the child interface of set if we want to represent a group of individual objects according to some sorting order with out duplicates then we should go for sorted set
        * sorted set interface defines the following specific methods
        * Object first(); returns first element of the sorted set
        * Object last();returns last element of the sorted set
        * SortedSet headSet(Object obj)//returns sortedset whose elements less than object
        * SortedSet tailSet(Object obj)//returns SortedSet whose elements are >=obj
        * SortedSet subSet(Object obj1,Object obj2)//returns SortedSet whose elements are >=Obj1 and <Obj2
        * Comparator comparator()
        * returns Comparator object that describes underlying of sorting technique.If we are using default natural sorting order then we will get null
        * Note:default natural sorting order for numbers are ascending order
        * default natural sorting order for String is Alphabetical order
         */
       // SortedSet is {100,104.106,110,115,120};
        /*first()=100;
        * last()=120
        * headSet(106)=[100,101,104]
        * tailSet(106)=[106,110,115,120]
        * subset(101,115)=[101,104,106,110]
        * comparator() is null*/
        /*TreeSet:The underlying data structure is balanced tree.Duplicate objects are not allowed.Insertion order not preserved.Heterogenous objects are not allowed otherwise we will get run time exception saying class cast exception.Null insertion is possible (only once)
        * TreeSet implements serilazable and colonoable but not random access all objects will be inserted based on some sorting order it may be default natural sorting order or customized sorting order.
        *  constructors:TreeSet t=new TreeSet()//creates any empty tree set object where the elements will be inserted according to default natural sorting order.
        * TreeSet t=new TreeSet(Comparator c)//creates any empty tree set object where the elements will be inserted according to customized sorting order specified by comparator objects
        * TreeSet t=new TreeSet(Collection c)
        * TreeSet t=new TreeSet(SortedSet s)*/
        System.out.println("treeSet---------------------------");
        TreeSet t=new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
       // t.add(new Integer(10));//CCE:ClassCastException//heterogeneous object is not allowed only homogenous are allowed
        //t.add(null);
        System.out.println(t);
        /*Null Acceptance:For non empty tree set if we are trying to insert null then we will get null pointer exception
        * For empty tree set as first element null is allowed but after inserting that null if we are trying to insert any other then we will get runtime exception saying null pointer exception
        * Note*:until 1.6 version null is allowed as first element to the empty tree set but from 1.7 version onwards null is not allowed even as the first element that is null such type of story not applicable for treeset from 1.7 version onwards.
        * */
        System.out.println("Treeset stringBuffer-----------------");
        TreeSet t1=new TreeSet();
        t1.add(new StringBuffer("A"));
        t1.add(new StringBuffer("a"));
        t1.add(new StringBuffer("B"));
        t1.add(new StringBuffer("Z"));
        t1.add(new StringBuffer("L"));
        System.out.println(t1);//runtime exception saying cc
        /*if we are depending on default natural order compulsory the object should be homogenous and comparable otherwise we will get runtime exception saying class cast exception
        * An object is said to be comparable if and only if corresponding class implements comparable interface
        * String class and all wrapper classes already implement comparable interface but string buffer class doesn't implement comparable interface.
        * Hence we got class cast exception in the above example.
        * Comparable Iterface it is present in java.lang package and it contains only one method that is compareTo()
        * public int compareTo(Object obj)
        * obj1.compareTo(obj2)
        * returns -ve iff obj1 has to come before obj2
        * returns +ve if obj1 has to comes after obj2
        * returns 0 if obj1 and obj2 are equal*/
        System.out.println("Comparable interface------------");
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("K"));
        System.out.println("A".compareTo("A"));
        //System.out.println("A".compareTo(null));
        /*if we are depending on default natural sorting order then while adding objects into the tree set JVM will call compare to method */
        System.out.println("default natural sorting order then while adding objects into the tree set JVM will call compare to method--------------");
        TreeSet t2=new TreeSet();

        t2.add("K");
        t2.add("Z");
        t2.add("A");
        t2.add("A");
        System.out.println(t2);
        /*obj1.compareTo(obj2)//here obj1 is the object, which is to be inserted.The object which is already inserted.
        * If default natural sorting order is not available or if we are not satisfied with default natural order then we can go for customised sorting by using comparator.
        * comparable meant for default natural sorting order whereas comparator meant for customised sorting order. */
/*Comparator:comparator present in java.util package and it defines two methods compare and equals */
/*public int compare(Object obj1,Object obj2)
* returns -ve if obj1 has to come before obj2
* returns +ve if obj1 has to come after obj2
* returns 0 if obj1 and obj2 are equal
* public boolean equals(Object obj)
* when ever we are implementing comparator interface compulsory we should provide only for compare method and we are not required to provide implementation for equals method because if already available to our class from object class through inheritance
* write a program to insert integer objects to reset where the sorting order is descending order*/
        System.out.println("comparator-----------------------");
//        TreeSet c=new TreeSet(new MyComparator());
//        c.add(10);
//        c.add(0);
//        c.add(15);
//        c.add(5);
//        c.add(20);
//        c.add(20);
        //System.out.println(c);
        /*The comparator order is in order traversal
        * At line 1 we are not passing comparator object then internally the jvm call comparator method which is meant for default natural order in this case the output is 0,5,10,15,20
        * At line 1 if we are passing comparator object then jvm will call compare method which is meant for customised sorting in this case the output is [20, 15, 10, 5, 0]
        * various possible of implementation of compare method
        *  */

        TreeSet c2=new TreeSet(new MyComparator());
        c2.add("hi");
        c2.add("hello");
        c2.add("me");
        c2.add("where");
        c2.add("are");
        c2.add("you");
        System.out.println(c2);
        /*To insert stringBuffer objects in the tree set where the sorting order is alphabetical order */
        System.out.println("StringBuffer-------------------------");
        TreeSet c3=new TreeSet(new MyComparator());
        c3.add(new StringBuffer("A"));
        c3.add(new StringBuffer("L"));
        c3.add(new StringBuffer("U"));
        c3.add(new StringBuffer("Z"));
        c3.add(new StringBuffer("O"));
        c3.add(new StringBuffer("B"));
        System.out.println(c3);
        /*If we are depending on natural default order compulsory object should be homogenous and comparable otherwise we will get run time exception saying class cast exception
        * If we are defining our own sorting by comparator then objects need not be comparable and homogenous that is we can add heterogeneous non-comparable objects also
        * Write a program to insert string and string buffer objects into tree set where sorting order is increasing length order
        * If two objects having same length than consider there alphabetical order*/
        System.out.println("StringBuffer sorting order is increasing lenght order----------------");
        TreeSet c4=new TreeSet(new MyComparator());
        c4.add("A");
        c4.add(new StringBuffer("LFG"));
        c4.add(new StringBuffer("UUU"));
        c4.add("ZCV");
        c4.add("OM");
        c4.add("B");
        System.out.println(c4);


    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
//        Integer I1=(Integer) obj1;
//        Integer I2=(Integer) obj2;
//        if(I1<I2)
//            return +1;
//        else if(I1>I2)
//            return -1;
//        else return 0;
        //return I1.compareTo(I2);
        //return -I1.compareTo(I2);
//        return I2.compareTo(I1);
//        return -I2.compareTo(I1);
//        return +1;
//        return -1;
//        return 0;


        /*To insert string objects into the tree set where all elements should be inserted according to reverse of alphabetical order */
//String s1=obj1.toString();
//String s2=(String)obj2;
//return s2.compareTo(s1);
////return -s1.compareTo(s2);
        String s1=obj1.toString();
        String s2=obj2.toString();
        int l1=s1.length();
        int l2=s2.length();
        if(l1<l2)
            return -1;
        else if(l1>l2)
            return 1;
        else

        return s1.compareTo(s2);


    }
}
