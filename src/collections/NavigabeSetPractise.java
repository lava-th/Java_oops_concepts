package collections;

import java.sql.SQLOutput;
import java.util.*;

public class NavigabeSetPractise {
    public static void main(String[] args) {
        /*1.6v enhancement in collection framework
         * As the part of 1.6 v the following two concepts introduced in collection framework
         * 1.NavigableSet
         * 2.NavigableMap
         * 1.NavigableSet:It is the child interface of sorted set and it defines several methods for navigation purposes.
         * Collection->set->sortedset->navigableset->treeset.
         * NavigableSet methods:Navigable set defines the following methods
         * floor(e)//it returns highest element which is <=e
         * lower(e)//it returns highest element which is <e
         * ceiling(e)//it returns lowest element which is >=e
         * higher(e)//it returns lowest element which is>e
         * pollFirst() //remove and return first element
         * pollLast()//remove and return last element
         * descendingSet()//it returns NavigableSet in reverse order.*/
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);
        System.out.println(t);
        System.out.println(t.ceiling(2000));
        System.out.println(t.higher(2000));
        System.out.println(t.floor(3000));
        System.out.println(t.lower(3000));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);

    /*Navigable Map is the child interface of sorted Map it defines several methods for  navigation purposes.
    Map->sortedMap->NavigableMap->TreeMap
    Navigable Map defines the following methods
    floorKey(e)//it returns highest element which is <=e
         * lowerKey(e)//it returns highest element which is <e
         * ceilingKey(e)//it returns lowest element which is >=e
         * higherkey(e)//it returns lowest element which is>e
         * pollFirstEntry() //remove and return first element
         * pollLastEntry()//remove and return last element
         * descendingMap()//it returns NavigableSet in reverse order.*/
        TreeMap<String,String> t1=new TreeMap<String,String>();
        t1.put("b","banana");
        t1.put("c","cat");
        t1.put("a","apple");
        t1.put("d","dog");
        t1.put("g","gun");
        System.out.println(t1);
        System.out.println(t1.ceilingKey("c"));
        System.out.println(t1.higherKey("e"));
        System.out.println(t1.floorKey("e"));
        System.out.println(t1.lowerKey("e"));
        System.out.println(t1.pollFirstEntry());
        System.out.println(t1.pollLastEntry());
        System.out.println(t1.descendingMap());
        System.out.println(t1);
        /*Collection class defines several utility methods for collection objects like sorting,searching,reversing etc.
        * Sorting elements of list:
        * Collections class defines the following two sort methods
        * 1.public static void sort(List l)//to sort based on default natural sorting order.
        * in this case list should compulosry contain homogenous and comparable objects otherwise we will get run time exception saying classcastException.
        * Null should not contain null otherwise we will get null pointer exception.
        * 2.public static void sort(List l ,Comparator c)//to sort based on customized sorting order
        * Demo program for sorting of list according to default natural sorting order
        * */
        ArrayList sl=new ArrayList();
        sl.add("Z");
        sl.add("A");
        sl.add("K");
        sl.add("L");
        sl.add("N");
        //sl.add((Integer)10);CCE
        //sl.add(null);//NPE
        System.out.println("Before sorting:" +sl);
        Collections.sort(sl);
        System.out.println("After sorting:"+sl);
        /*Demo program to sort elements of list according to customized sorting*/
        ArrayList sl1=new ArrayList();
        sl1.add("Z");
        sl1.add("A");
        sl1.add("K");
        sl1.add("L");
        sl1.add("N");
        //sl.add((Integer)10);CCE
        //sl.add(null);//NPE
        System.out.println("Before sorting:" +sl1);
        Collections.sort(sl1,new Comparatormm());
        System.out.println("After sorting:"+sl1);
/*Searching element of list:collection class define the following binary search methods
* public static int binarySearch(List l,Object target)//if the list is sorted according to default natrual sorting order then we have to use this method.
* public static int binarySearch(List l,Object target,Comparator c)//we have to use this method if the list is sorted according to customized sorting order.
* Conclusions:The above search methods internally will use binary search alogerthem successful search returns index.Unsuccessfull search returns insertion point.
* Insertion point is the location where we can place target element in the sorted list.
* Befor calling binary search method compulsory list should be sorted otherwise will get unpredectable result.
* If the list is sorted according to comparator then at the time of search operation also we have to pass same comparator objects otherwise we will get undpredictable results.
* Collection search demo*/
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,"Z"));//
        System.out.println(Collections.binarySearch(l,"J"));//insertion

        ArrayList l1=new ArrayList();
        l1.add(15);
        l1.add(0);
        l1.add(20);
        l1.add(10);
        l1.add(5);
        System.out.println(l1);
        Collections.sort(l1,new MyComparatorsss());
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1,10,new MyComparatorsss()));//
        System.out.println(Collections.binarySearch(l1,13,new MyComparatorsss()));//insertion
        System.out.println(Collections.binarySearch(l1,17));
        System.out.println(Collections.binarySearch(l1,17,new MyComparatorsss()));

/*For the list of n elements in the case of binary search elements
* Successful result range o to n-1
* unsuccessful result range -(n-1) to -1
* Total result range -(n+1) to n-1
* Example: 3elements A K Z
* Here the Successful search result range is 0 to 2
* the Unsuccessful search result range is -4 to -1
* Total result range is -4 to 2
* Reversing element of list:Collections class defines the following reverse method to reverse element of list.
* public static void reverse(List l);*/
        ArrayList al=new ArrayList();
        al.add(15);
        al.add(0);
        al.add(20);
        al.add(10);
        al.add(5);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);

/*reverse vs reverse order : we can reverse method to reverse order of elements of list.
* where as we can use reverse order method to get reverse comparator
* Comparator c1=Collections.reverseOrder(Comparator c)
* c1 is meant for ascending order and c is meant for descending order*/
    }
}
class Comparatormm implements Comparator{
    public int compare(Object obj1,Object obj2) {
        String s1 = (String) obj1;
        String s2 = obj1.toString();
        return s2.compareTo(s1);

    }

    }
    class MyComparatorsss implements Comparator{
        public int compare(Object obj1,Object obj2){
            Integer i1=(Integer) obj1;
            Integer i2=(Integer) obj2;
            return i2.compareTo(i1);

    }
}
