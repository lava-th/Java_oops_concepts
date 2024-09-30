package collections;

public class KeyInterfaces {
    public static void main (String[] args){
        /*Nine KEY INTERFACES of collection framework*/
        /*1.Collection
        * 2.List
        * 3.Set
        * 4.SortedSet
        * 5.NavigableSet
        * 6.Queue
        * 7.Map
        * 8.SortedMap
        * 9.NavigableMap*/
        /*1.Collection:Is an interface
        * If we want to represent a group of individual objects as a single entity then we should go for collection.
        * Collection interface defines the most common methods which are applicable for any collection object
        * In general collection interface is consider as root interface of collection framework.
        * There is no concert class which implements collection interface directly.
        * What is different between collection and collections?
        * Collection is an interface if we want to represent a group of individual objects as a single entity than we should go for collection
        * Collections is a utility class present in java.util.package to define several utility methods for collection objects (like sorting,searching etc.)
        * List (I) :It is the child interface of collection. If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for list.
        * Collection(I)(1.2v)->list(I)(1.2v)-->Array List(1.2v)-->Linked List(1.2v)-->vector(1.0)->Stack(1.0v --legacy class)
        * In 1.2V vector and stack classes are re engineering to implement list interface.
        * Set(I) interface is child interface of collection(I).
        * If we want to represent a group of individual objects as a single entity where duplicates are not allowed and insertion order not required then we should go for set(I)
        * Set(I)(1.2v) implements Hashset(1.2v)  and linked hash set(1.4v)
        * Sorted Set(I) it is the child interface of Set
        * If we want to represent a group of individual objects as a single entity where duplicates are not allowed and all objects should be inserted according to some sorting order
        * Collection(I)(1.2v) -->set(I)(1.2v) -->Sorted set(I)(1.2v)-->Navigable set(I)(1.6v)-->TreeSet(1.2v)
        * Navigable set(I): It is the child interface of sorted set it contains several methods for navigation purposes.
        * which provides navigation purposes of navigable set
        * Difference between list and set
        * Duplication are allowed for list and Duplications are not allowed for set
        * Insertion order is preserved for list and Insertion order is not preserved for set
        * Collection(I)->Queue(I)
        * Queue: It is the child interface of collection if we want to represent a group of individual object prior to processing then we should go for queue.
        * Usually Queue follows first in first out order but based on our requirement we can implement our own priority order also.
        * Example:Before sending a mail all mail Id's we have to store in some data structure. In which order we added mail I'd's in the same order only mail should be delivered. For this requirement queue is best choice
        * Collection(I)->Queue(I)(1.5v)->Priority Queue->blocking queue-->priority blocking queue and linked blocking queue.
        * Note:All the above interfaces (Collection,list,set,sorted set,navigable set,queue meant for representing a group of individual objects. If we want to represent a group of objects as key value pairs then we should go for map.
        * Map(I):Map is not child interface of collection. If we won't to represent a group of objects as key value pairs then we should go for Map.
        * Both key and value are objects only duplicate keys are not allowed but values can be duplicated.
        * The implemented of the Map(I) (1.2V) is HashMap child class is LinkedHashMap(1.4V) ,weakHashMap(1.2V) and Identity Hash Map(1.4V),Hashtable(1.0V) child class is properties Hashtable parent class is Dictionary(Abstract class) this hashtable as legacy classes.
        * SortedMap(I):It is the child interface of Map.If we want to  represent a group of key value pairs according to some sorting order of keys then we should go for sorted Map.
        * In sorted Map the sorting should be based on key but not based on value.
        * Navigable Map is the child interface of sorted Map
        * Map(I)->SortedMap(I)->NavigableMap(I):It defines several methods for navigational purposes.
        * Map(I)(1.2V)->SortedMap(I)(1.2V)->NavigableMap(I)(1.6V)->TreeMap(I)(1.2V)
        * The following are legacy characters in collection frame work Enumeration(I),dictionary(ac),vector(c),stack(c),hashtable(c),properties(c).
        * Sorting:comparable(I),comparator(I)
        * cursors:Enumeration(I),Iterator(I),ListIterator(I)
        * Utility class :Collections,array
        *
        * */

    }
}
