package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuePractise {
    public static void main(String[] args){
        /*1.5 version enhancements (queue interface) it is the child interface of collection->List,set,queue
        * Queue->priority queue,Blocking queue
        * Blocking queue->PriorityBlockingqueue,LinkedBlockingQueue
        * If we want to represent individual objects to prior to processing then we should go for queue for example:before sending sms message all mobile numbers store in some data strucutre in which order we added mobile number in the same order only message should be send or should be delivered for this first in first out requirement queue is the best choice.
        * usually queue follows first in first out order but based on our requirement we can implement our own priority order also(priority queue).
        * From 1.5 version onwards linked list class also implements queue interface.
        * Linked list based implementation always flow first in first out order.
        *Queue interface specific methods:
        * boolean offer(Object o) //to add an object into the queue
        * Object peek()//to return head element of the queue.If queue is empty then this method returns null.
        * Object element() //to return head element of the queue.If queue is empty then this method raises RE:NosuchElementException.
        * Object poll()// to remove and return head element of the queue.if queue is empty then this method returns null.
        * Object remove()//to remove and return head element of the queue.If queue is empty then this method raises RE:No such Element Exception.
        * PriorityQUEUE:If want to represent a group of individual objects prior to processing according to some priority then we should go for priority queue the priority can be either default natural sorting order or customized sorting order define by comparator.Insertion order is not preserved and some priority and duplicate objects are not allowed.
        * If we are depending on default natural sorting order compulsory objects should be homogenous and comparable otherwise we will get classcast exception.
        * If we are defining our own sorting then objects needs not be homogenous and comparable.
        * Null is not allowed even as the first element also.
        * Constructor:
        * PriorityQueue q=new PriorityQueue()//creates with empty priority queue with default initial capacity 11 and all objects will be inserted according to default natural sorting order.
        * PriorityQueue q=new PriorityQueue(int intialCapacity) ;
        * PriorityQueue q=new PriorityQueue(int initialCapacity,Comparator c);
        * PriorityQueue q=new PriorityQueue(SortedSet s);
        * PriorityQueue q=new PriorityQueue(Collection c);
        *  */
        PriorityQueue q=new PriorityQueue();
        //System.out.println(q.peek());
        //System.out.println(q.element());
        for(int i=0;i<=10;i++){
            q.offer(i);
        }
        System.out.println(q);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(q.poll());//0
        System.out.println(q);//[1, 3, 2, 7, 4, 5, 6, 10, 8, 9]//some  platforms won't provide proper support for thread priorities and priorityQueue.
PriorityQueue q1=new PriorityQueue(15,new MyComparatorss());
q1.offer("A");
        q1.offer("Z");
        q1.offer("L");
        q1.offer("B");
        System.out.println(q1);

    }
}
class MyComparatorss implements Comparator {
    public int compare(Object obj1,Object obj2){
        String s1=(String)obj1;
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }

}
