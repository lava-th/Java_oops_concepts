package collections;


import java.util.*;

public class LinkedHashMapPractice {
    public static void main(String[] args) throws InterruptedException {
    /*It is the child class of hashMap
    * It is exactly same as hashMap(including methods and constructors except the following difference)
    * difference between HashMap and LinkedHashMap
    * HashMap The underlying data structure is hashtable
    * LinkedHashMap The underlying data structure linked list and hashtable hybrid data structure.
    * HashMap Insertion order is not preserved and it is based on hash code of keys.
    * LinkedHashMap Insertion order is preserved.
    * HashMap Introduced in 1.2 version.
    * LinkedHashMap Introduced in 1.4 v
    * In the above hashmap program if we replace hashmap with linked hashMap then output is that is insertion order is preserved
    * linked hash set and linked hash map are commonly used for developing cache based applications*/
        LinkedHashMap m=new LinkedHashMap();
        m.put("chiranjeevi",799);
        m.put("balaiah",899);
        m.put("venkatesh",699);
        m.put("Nagarjuna",500);
        System.out.println(m);
        System.out.println(m.put("chiranjeevi",800));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"-----"+m1.getValue());
            if(m1.getKey().equals("Nagarjuna")){
                m1.setValue(10000);

            }

        }
        System.out.println(m);
        /*Difference between double equal(==) and .equals()
        * In general double equal operator meant for reference comparison and address comparison
        * where as .equals() meant for contain comparison.*/

        Integer I1=new Integer(10);
        Integer I2=new Integer(10);
        System.out.println(I1==I2);
        System.out.println(I1.equals(I2));

       HashMap m2=new HashMap();
        Integer i3=new Integer(10);
        Integer i4=new Integer(10);
        m2.put(i3,"pavan");
        m2.put(i4,"kiran");

        /*IdentityHashMap:It is exactly same as hashmap including methods and construction except the following different.
        * In the case of normal hashMap JVM will use .equals method to identify duplicate keys which is meant for content comparison
        * But in the case of Identity hashMap Jvm will use double equal operator to identify duplicate keys which is meant for reference comparison (address comparison)
        * */
        IdentityHashMap m1=new IdentityHashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        m1.put(i1,"pavan");
        m1.put(i2,"kiran");
        System.out.println(m1);//i1 and i2 are duplicate keys i1.equals(i2) returns true
        /*If we replace hashmap with identity hashmap then iq and i2 are not duplicates keys  i1==i2 returns false in this case output is 10=pavan and 10=kalyan*/

/*Weak hash Map:It is excatly same as hashMap except the following differnt in the case of hashmap even though object doesn't have any reference it is not elgible for GC IF IT IS ASSOCIATED WITH HASHMAP that is hashmap dominates Garabage collector.
* But in the case of weakhashmap if object doesn't contain any references it is eligible for GC even though objects associated with weak hash map that is garabage collector dominates weak hash map*/
        HashMap h=new HashMap();
        Temp t=new Temp();
        h.put(t,"kiran");
        System.out.println(h);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(h);
        /*in the above example temp object not eligible for GC because it is associated with hashmap in this case output is temp=kiran and temp=kiran
        * In the above program if we replace hashmap with weak hashmap then temp object eligible for GC in this case oupput is temp=kiran finalized method called {}*/

        WeakHashMap h1=new WeakHashMap();
        Temp t1=new Temp();
        h1.put(t1,"kiran");
        System.out.println(h1);
        t1=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(h1);
        /*SortedMap:it is the child interface of Map if we want to represent the a group of key value pairs according to some sorting order of keys then we should go for sorted map.
        * sorting is based on the key but not based on value.
        * sorted MAP defines the following specific methods.
        * Object firstKey();
        * Object lastKey();
        * SortedMap headMap(Object key);
        * SortedMap tailMap(Object key);
        * SortedMap subMap(Object key1,Object Key2)
        * Comparator comparator()
        * 101->A,103->B,104->C,107->D,125->E,136->F
        * firstKey()->101
        * lastKey()->136
        * headMap(107)->{101=A,103=b,104=c}
        * tailMap(107)->{107=D,125=E,136=F}
        * subMap(103,125)->{103=B,104=C,107=D}
        * comparator()->null
        * TreeMap:The underlying data structure is red black tree
        * And the insertion order is not preserved, and it is based on some sorting order of keys.
        * Duplicate keys are not allowed but values can be duplicated.

        * If we are depending on default natural sorting order then keys should be homogenous and comparable otherwise we will get run time exception saying class cast exception.
        * If we are defining our own sorting by comparator then keys need not be homogenous and comparable.
        * we can take heterogenous non-comparable objects also.
        * weather we are depending on default natural sorting order or customized sorting order there are no restriction for values we can take heterogenous non comparable objects also.
        * null acceptance:For non-empty tree map if we are trying to insert entry then we will get run time exception saying null pointer exception.
        * For empty tree map as the first entry with null key is allowed but after inserting that entry if we are trying to insert any other entry then we will get run time exception saying null pointer exception.
        * The above expectancy rule applicable only 1.2 version for after 1.7 version null is not allowed.
        * But for values we can use null any number of times there is no restriction weather it is 1.6 version or 1.7 version.
        * Constructors:TreeMap t=new TreeMap();
        * TreeMap t=new TreeMap();//default natural sorted order of keys.
        * TreeMap t=new TreeMap(Comparator c);//customized sorting order
        * TreeMap t=new TreeMap(Map m)//
        TreeMap t=new TreeMap(SortedMap m);
        * Demo program for default natural sorting order*/
        TreeMap p=new TreeMap();
        p.put(100,"zzz");
        p.put(103,"YYY");
        p.put(101,"xxx");
        p.put(104,106);
        //p.put("fff","xxx");//cce
        //p.put(null,"vvv");//npe
        System.out.println(p);
        /*Demo program for customized sorting*/
        TreeMap p1=new TreeMap(new Mycomparators());
        p1.put("zzz",100);
        p1.put("YYY",300);
        p1.put("xxx",599);
        p1.put("UUU",106);
        System.out.println(p1);



    }
}
class Temp{
    public String toString(){
        return "temp";

    }
    public void finalize(){
        System.out.println("finalized method called");
    }
}
class Mycomparators implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1=obj1.toString();
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}
