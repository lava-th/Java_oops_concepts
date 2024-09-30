package collections;

import java.sql.SQLOutput;
import java.util.*;
import java.util.LinkedHashMap;

public class MapModule {
    public static void main(String[]args){
        /*Map(1.2v)->HashMap(1.2v)->LinkedHashMap(1.4v),IdentityHashMap(1.4v),weakHashmap(1.2v),sortedMap(1.2v)->NavigableMap(1.6v)->TreeMap(1.2v),
        Dictionary(1.0v)->Hashtable(1.0v)->Properties(1.0v) legacy version.
        Map is not child interface of collection.If we want to represent a group of objects key value pairs then we should go for map.
        Key value
        102 Durga
        103 hi
        104 hello
        105 how
        106 are
        both keys and values are objects only duplicate keys are not allowed but values can be duplicated each key value pair is called Entry.Hence Map is consider as a collection of entry objects.

        Map interface methods.
        put(Object key,Object value) to add one key value pair to the map if the key is already present then old value will be replaced with new value and returns old value.
        m.put(101,hi)
        m.put(102,hello)
        m.put(101,yes)
        void putAll(Map m)
        object get(Object key) --returns the value associated with specified key
        Object remove(Object key)---removes the entry associated with specified key
        boolean containsKey(Object key)
        boolean containsValue(Object value)
        boolean isEmpty()
        int size()
        void clear();--all the key values pair will be removed.
       Set keySet()
       Collections values()
       Set entrySet()
       three methods are default consider as collections view of Map.
       Entry interface:A map is a group of key value pairs and each key value pair is called an entry.hence the map is considered as a collection of entry objects.Without existing Map objects there is no chance of existing entry object.Hence entry interface is define inside map interface.
Interface Map{
Interface Entry{
Object getKey()
Object getValue()
Object setValue(Object newobject)
}
}
this three methods entry specific methods and we can apply only on entry objects.
HashMap:The underlying data structure is hash table.
Insertion order is not preserved and it is based on hash code of keys.
duplicate keys are not allowed but values can be duplicated.
Heterogenous objects are allowed for both key and value.
Null is allowed for key(only once).
Null is allowed for values any number of times.'
HashMap implements represent serializable and cloneable interfaces and random access
HashMap is the best choice is for frequency operation search operation.
        */
//        HashMap s=new HashMap();//default intial capacity is 16,default fill ratio is 0.75;
//        HashMap s1=new HashMap(int intialcapacity);
//        HashMap s2=new HashMap(int intialcapacity, float fillRatio);
//        HashMap s3=new HashMap(Map m);
       HashMap m=new HashMap();
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


        /*Different between hashmap and hashtable
        * Every method present in HashMap is not synchronized and Every method present hash table is synchronized.
        * At a time only multiple threads allow to operator on hashmap and hence it is not thread safe.
        * At a time only one thread allow to opreate on hashtable and hence it is thread safe.
        * Relatively perfomance is high because threads are not required to wait to operate on hash map object.
        * Relatively perfomance is low because threads are required to wait to operate on hash table object.
        * null is allowed for both key and value pair.
        * Null is not allowed for keys and values.otherwise we will get null pointer exception.
        * introduced 1.2 version, and it is not legacy.
        * introduced in 1.0 version and it is legacy.
        * How to get synchronized version of hash map object?
        * By default, hash map is non synchronized but we can get synchronized version of hash map by using synchronized map method of collectiions class.
        * HashMap m=new HashMap();
        * Map m1=Collections.synchronizedMap(m); m1 is synchronized and m is synchronized*/

    }
}
