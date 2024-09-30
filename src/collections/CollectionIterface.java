package collections;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionIterface {
    public static void main(String[] args){
        /*1.Collection:Is an interface
         * If we want to represent a group of individual objects as a single entity then we should go for collection.
         * Collection interface defines the most common methods which are applicable for any collection object
         * Below are the methods present in the collection interface
         * boolean add(Object o)
         * boolean addAll(Collection c)
         * boolean remove(Object o)
         * boolean removeAll(Collection c)
         * boolean retainAll(Collection c)
         * To remove all objects except those present in c
         * void clear()
         * boolean contains(Object o)
         * boolean containsAll(Collection c)
         * boolean isEmpty()
         * int size();
         * Object[] toArray();
         * Iterator iterator()
         *There is no concert class which implements collection interface directly.
         *  List (I) :It is the child interface of collection. If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for list.
         * we can preserve insertion order via index, and we can differentiate duplicate objects by using index.
         * Hence, index will play very important role in list
         * List interface defines the following specific methods only available in list implement classes and also parent methods is available that is collection methods
         * void add(int index,Object o)
         * boolean addAll(int index,Collection c)
         * Object get(int index)
         * Object remove(int index)
         * Object set(int index,Object new)
         * to replace the element present at specified index with provided Object and returns old object
         * int indexOf(Object o)
         * returns index of first occurrence of 'o'
         * int lastIndexOf(Object o)
         * ListIterator listIterator();
         * ArrayList:The under lying data structure is resizable array or growable array, duplicates are allowed,insertion order is preserved, Heterogeneous objects are allowed(Except treeSet and treeMap every where heterogeneous objects are allowed), Null insertion is possible
         * Constructor:ArrayList l=new ArrayList(); creates an empty  arraylist object with default intial capacity is 10.Once array list reaches its max capacity then a new array list object will be created with new capacity =(current capacity * 3/2 +1)
         * ArrayList l=new ArrayList(int intialCapacity) creates an empty  arraylist object with  intial capacity
         * ArrayList l=new ArrayList(Collection c) creates a equivalent array list object for the given collection*/
        System.out.println("Array list---------------------------");
        ArrayList l=new ArrayList();
        l.add('a');
        l.add(null);
        l.add(10);
        l.add("hello");
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(3,'M');
        l.add(8);
        System.out.println(l);
        /*Usually we used collection to hold and transfer objects from one location to another location(container) to provide supports for this requirement every collection class by default implements serializable and cloneable interface
        *Array list and vector classes implements random access interface so that any random element we can access with the same speed
        * Random Access interface present in java.util Package, and it doesn't contain any methods, and it is a marker interface where required ability will be provided automatically by the JVM.
        * ArrayList classes and vector classes implements random access but linked list class doesn't implement random access
        * ArrayList is the best choice if ever frequent operation is retrieval operation(Because array list implements random access interface)
        * Arraylist is the worst choice if ever frequent operation is insertion or deletion in the middle in this requirement linked list is the best choice
        * Difference between array list and vector
        * ArrayList is non synchronized and vector is synchronized

        * At a time multiple threads are allowed to operate on array list object and hence it is not thread safe.
        * At a time only one thread allowed to operate on In vector object each thread is performing one by one, so it is a thread safe.
        * In arraylist the relative performance is high
        * In vector the relative performance is low.
        *  Array list comes into 1.2v, and it is non legacy
        * vector comes into 1.2 v, and it is legacy
        * How to get synchronized version of array list object
        * By default array list is non synchronized, but we can get synchronized version of array list object by using synchronized list method of collections class
        * */
        List l1= Collections.synchronizedList(l);//l is non synchronized and l1 is synchronized

        //public static List synchronizedList(List l)
        //similarly we can get synchronized version of set and Map objects by using the following methods of collection class
        /*public static Set synchronizedSe(Set s)
        * public static Map synchronizedSe(Map m)
        * linked list :The underlying data structure is double linked list insertion order is preserved.Duplicates objects are allowed.hetergenous objects are allowed null insertion is possible
        * linked list implements serializable and cloneable interfaces but not random access
        * linked list is the best choice if ever frequent operation is insertion and deletion operation
        * linked list is the worst choice if ever frequent operation retrieval operations
        * linked list capacity is not required
        * */
        LinkedList p=new LinkedList();//creates an empty linked list object
        //LinkedList p1=new LinkedList(Collection p);//creates an equivalent linked list object for the given collections
        /*Linked list have specific methods usually we can use linked list to develop stacks and queues to provide support for this requirement linked list class defines the following specific methods
        * */
//        void addFirst(Object o)
//        void addLast(Object o)
//        Object getFirst()
//                Object getLast()
//                Object removeFirst()
//                Object removeLast()
        System.out.println("linked list---------------");
        p.add('d');
        p.add(null);
        p.add(30);
        p.add("software");
        p.set(0,"hello");
        p.add(0,"venky");
        p.removeLast();
        p.addFirst("hi");
        System.out.println(p);
        /*Different between arraylist and linked list
        * Array list is the best choice if ever frequent operation is retrieval operation.
        * Linked list is the best choice if ever frequent operation insertion and middle
        * Array list is the worst choice if ever frequent operation is insertion or deletion middle because internally several shift operations are performed
        * Linked list is the worst choice if ever frequent operation is retrieval operation.
        * In array list the elements will be stored in consecutive memory location and hence retrieval operation will become easy.
        * In linked list the elements won't be stored in consecutive memory location and hence retrieval will be difficult
        *
        *
        *  Vector:The underlying data structure is resizable array or growable array.
        * Insertion order is preserved.
        * duplicates are allowed.
        * Heterogeneous objects are allowed
        * null insertion is possible.
        * It implements serializable ,cloneable and random access interfaces
        * Every method is present in the vector is synchronized and Hence vector object thread safe
        * */
        //Vector v=new Vector();//creates an empty vector object with default initial capacity 10 ones vector reaches its max capacity then a new vector object will be created with new capacity=current capacity *2
        /*Vector v=new Vector(int initialCapacity); creates an empty vector with specified initial capacity
        * Vector v=new Vector(int initialCapacity,int incrementalCapacity); non
        * Vector=new Vector(Collection c); creates an equivalent vector for the given collection this construction meant for interconversion between collection object
        * Vector specific methods
        * add(Object o)---collectionInterface
        * add(int index,Object o)--ListInterface
        * addElement(Object o)-----VectorInterface
        * remove(Object o)---collectionInterface
        * removeElement(Object o)---VectorInterface
        * remove(int index)---ListInterface
        * removeElementAt(int index)---VectorInterface
        * clear()----collectionInterface
        * removeAllElements()----VectorInterface
        * Object get(int index)---ListInterface
        * Object elementAt(int index)----VectorInterface
        * Object firstElement()-----VectorInterface
        * Object lastElement()-----VectorInterface
        * int size()
        * int capacity()
        * Enumeration elements()*/
        System.out.println("vector------------------");
        Vector v1=new Vector(5,24);
        System.out.println(v1.capacity());
        for(int i=1;i<=10;i++) {
            v1.addElement(i);
        }
            System.out.println(v1.capacity());
        v1.addElement("A");
        System.out.println(v1.capacity());
        System.out.println(v1);
        /*Stack:It is the child class of vector it is a specially designed class for last in first out order
        * Stack s=new Stack()
        * Methods in Stack
        * Object push(Object o)
        * to insert an object into the stack
        * Object pop() to remove and return top of the stack
        * Object peek() to return top of the stack without removal
        * boolean empty() returns true if the stack is empty
        * int search(Object o) returns offset if the element is available otherwise returns -1
        * */
        System.out.println("stack--------------------");
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("v"));

        /*The three cursors of java*/
        /*If we want to get objects one by one from the collection then we should go for cursor there are three types of cursors available in java
        * 1.Enumeration
        * 2.Iterator
        * 3.List Iterator
        * Enumeration:we can use enumeration to get objects one by one from legacy collection object.
        * we can create enumeration object by using elements method of vector class.
        * */
//        public Enumeration elemenets();
        Enumeration e= v1.elements();//v1 is vector objects
        /*Methods in Enumeration
        * public boolean hasMoreElements()
        * public Object nextElement()*/
        System.out.println("Enumeration-------------------------------");
        Vector v2=new Vector();
        for(int i=0;i<=10;i++){
            v2.addElement(i);
        }
        System.out.println(v2);
        Enumeration e1=v2.elements();
        while(e1.hasMoreElements())
        {
            Integer I=(Integer) e1.nextElement();
            if(I%2==0)
                System.out.println(I);
        }
        System.out.println(v2);
        /*Limitation of Enumeration(1.0v)
        Enumeration only for legacy classes
        * 1.we can apply enumeration concept only for legacy classes, and it is not a universal cursor
        2.By using enumeration we can get only read access, and we can't perform remove operation
        3.To overcome above limitation we should go for iterator.
        Iterator(1.2v):we can apply iterator concept for any collection object and hence it is universal cursor
        2.By using iterator we can perform both read and remove operations
        3.How we can get iterator operation
        we can create iterator object by using iterator method of collection iterface*/
        //public Iterator iterator();
        //Iterator itr=c.iterator();//c is any collection objects.
        /*Methods of Iterator
        * public boolean hasNext()
        * public Object next()
        * public void remove()
        * */
        System.out.println("ITERATOR----------------------------------------");
        ArrayList l2=new ArrayList();
        for(int i=0;i<=10;i++){
            l2.add(i);

        }
        System.out.println(l2);
        Iterator itr=l2.iterator();
        while(itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if (I % 2 == 0) {
                System.out.println(I);
            } else {
                itr.remove();
            }

        }
        System.out.println(l2);
        /*Limitation of Iterator:
        * By using enumeration and iterator we can always move only towards forward direction and we can't move towards backward direction these are single direction cursors but not bidirectional cursors
        * By using Iterator we can perform only read and remove operations and we can't perform replace and addition of new objects
        * To overcome above limitation we should go for list iterator.
        * List Iterator:By using list iterator we can move either to the forward direction or to the backward direction and hence it is bidirectional cursor
        * By using list iterator we can perform replacement and addition of new objects in addition to read and remove operations
        * By using list iterator method using list interface
        * public ListIterator listIterator()
        * ListIterator list=l.listIterator//here l is any list object
        * Methods of List Iterator.
        * List Iterator is the child interface of iterator and hence all methods present in iterator by default available to the list iterator.
        * Iterator(I)--->ListIterator(I)
        * ListIterator defines the following 9 methods.
        * public boolean hasNext();
        * public Object next();
        * public int nextIndex();
        * above three methods meant for forward methods
        * public boolean hasPrevious()
        * public object previous()
        * public int previousIndex()
        * above three is backward movement
        * public void remove()
        * public void add(Object o)
        * public void set(Object o)
        * the above three are extra operations
        * */
        System.out.println("ListIterator-----------");
        LinkedList k=new LinkedList();
        k.add("balakrishna");
        k.add("venki");
        k.add("chiru");
        k.add("nag");
        System.out.println(k);
        ListIterator itr2=k.listIterator();
        while(itr2.hasNext()){
            String s1=(String) itr2.next();
            if(s1.equals("venki")){
                itr2.remove();
            }
            else if(s1.equals("nag")){
                itr2.add("chaitu");

            }
            else if(s1.equals("chiru")){
                itr2.set("charan");
            }
        }
        System.out.println(k);
        /*the most powerful cursor is listIterator but its limitation is it is applicable only for list objects
        * Comparison of three cursors
        * 1.Enumeration
        * 2.Iterator
        * 3.List Iterator
        * Internal implementaion of cursors
        * */
        Vector v3=new Vector();
        Enumeration e3=v3.elements();
        Iterator itr3= v3.iterator();
        ListIterator litr=v3.listIterator();
        System.out.println(e3.getClass().getName());
        System.out.println(itr3.getClass().getName());
        System.out.println(litr.getClass().getName());







    }
}
