package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.binarySearch;

public class ArraysPractise {
    public static void main(String[] args){
        /*Arrays class is an utility class to define several utility methods for arrays objects.
        * Sorting elements of array:
        * Arrays class defines the following sort methods to sort elements of primitive and object type arrays.
        * public static void sort(primitive array p)//to sort according to natural sorting order.
        * public static void sort(Object[] o)//To sort according to natural sorting order.
        * public static void sort(Object[] o,Comparator c)//To sort according to customized sorting order.
        * */
        int[] a={10,5,20,11,6};
        System.out.println("Primitive Array before sorting");
        for(int a1:a){
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println("Primitive arrays after sorting");
        for(int a2:a){
            System.out.println(a2);
        }
        String[]s={"A","Z","B"};
        System.out.println("Object Array before sorting");
        for(String s2:s){
            System.out.println(s2);
        }
        Arrays.sort(s);
        System.out.println("Primitive arrays after sorting");
        for(String s1:s){
            System.out.println(s1);
        }
        Arrays.sort(s,new MyComparatorvv());
        System.out.println("Object arrays after sorting by comparator");
        for(String s1:s){
            System.out.println(s1);
        }
        /*We can sort primitive array only based on default natural sorting order we can sort object array either based on default natural sorting order.
        * Based on customized sorting order.
        * Searching the elements of Array:Arrays class defines the following binary search methods.
        * public static int binarySearch(primitive[] p,primitive target)
        * public static int binarySearch(Object[] a,Object target)
        * public static int binarySearch(Object[] a,Object target,Comparator c)
        * Note: All rules of arrays class binary search methods  exactly same collection class binary search methods*/
        int[] b={10,5,20,11,6};
        Arrays.sort(b);
        System.out.println(binarySearch(b,6));
        System.out.println(binarySearch(b,14));
        String[] s1={"A","Z","B"};
        Arrays.sort(s1);
        System.out.println("Example 2");
        System.out.println(binarySearch(s1,"Z"));
        System.out.println(binarySearch(s1,"S"));
        Arrays.sort(s1,new MyComparatorvv1());
        System.out.println(binarySearch(s1,"Z",new MyComparatorvv1()));
        System.out.println(binarySearch(s1,"S",new MyComparatorvv1()));
        System.out.println(binarySearch(s1,"N"));
        /*Conversion of Array to List
        * public static List asList(Object[] a)
        * strictly speaking this method won't create an independent list object for the existing array we are getting list view.
        * String s[]={"A","Z","B"}
        * List l=Arrays.aslist(s);
        * By using array reference if we perform any change automatically that change will be reflected to the List.Similarly by using list reference if we perform any change that change will be reflected automatically to the array.
        * By using list refernce we can't perform any operation which very is the size otherwise we will get run time exception saying unsupported operation exception.
        * l.add("M");//this is not supported
        * l.remove(1);//this is not supported
        * l.set(1,"M")//this is supported.
        * By using list reference we are not allowed to replace with heterogeneous objects otherwise we will get run time exception saying array store exception.
        * l.set(1,new Integer(10));//Array store exception */
        String[] ss={"A","Z","B"};
        List ll=Arrays.asList(ss);
        System.out.println(ll);
        ss[0]="K";
        System.out.println(ll);
        ll.set(1,"L");
        for(String s11:ss){
            System.out.println(s11);
//            ll.add("durga");UsOE
//            ll.remove(2);//UsOE
//            ll.set(1,new Integer(10));//ASE
        }


    }
}
class MyComparatorvv implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);

    }
    }
    class MyComparatorvv1 implements Comparator {
        public int compare(Object o1, Object o2) {
            String s1 = o1.toString();
            String s2 = o2.toString();
            return s2.compareTo(s1);

        }
    }
