package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Properties;

public class HashTablePractise {
    public static void main(String[] args) throws IOException, SQLException {
        /*Hashtable: The underlying data structure is hashtable
        * Insertion order is not preserved and it is based on hashcode of keys.
        * Duplicate keys are not allowed and values can be duplicated.
        * Heterogenous objects are allowed for both keys and values.
        * Null is not allowed for both key and value otherwise we will get run time exception saying null pointer exception.
        * It implements serializable and cloneable interfaces but not random access.
        * Every method present in hash table is synchronized and hence hashtable object is thread safe.
        * Hashtable is the best choice if every frequent operation is  search operation.
        * Constructors:HashTable h=new Hashtable();//creates an empty hashtable object with default intial capacity is 11 and default fill ratio is 0.75
        * Hashtable h1=new Hashtable(int initial capacity)//
        Hashtable h2=new Hashtable(int initialCapacity,float fill ratio)
        Hashtable h3=new Hashtable(Map m);*/
       // Hashtable h=new Hashtable();
        Hashtable h=new Hashtable(25);//{23 =E, 16 =F, 15 =D, 6 =C, 5 =A, 2 =B}
        h.put(new Tempe(5),"A");
        h.put(new Tempe(2),"B");
        h.put(new Tempe(6),"C");
        h.put(new Tempe(15),"D");
        h.put(new Tempe(23),"E");
        h.put(new Tempe(16),"F");
        //h.put("hello",null);//NPE
        System.out.println(h);//
        /*From top to bottom and right to left
        * If we change hashcode temp code as */

/*Properties:In our program with changes frequently like user name password, mail Id , mobile number etc are not recommended to hard code in java program because if there is any change to refelct that change recomplication, rebuild and redeploy application are required even sometimes server restart also required which creates a big bussiness impact to the client.
* we can over come this problem by using properties file. such type variable things we have to configure in the properties file from the properties file we have to read into java program and we can use those properties. The main advantage of this approach is if there is a change in properties file to reflect that change just read deployment is enough which wont create any business impact to the client.
* we can use java properties objects to hold properties which are coming from properties file.
* In normal map(like hashmap ,hashtable,treemap) key and value can be any type but in the case of properties key and value should be String type.
* Constructor: Properties p=new Properties()
* Properties methods:
* String setProperty(String pname,String pvalue)
* to set a new property.If the specified property already available then old value will be replaced with new value and returns old value
* String getProperty(String pname);
* to get value associated with the specified property.If the specified property is not available then this method returns null.
* Enumearation propertyNames() //returns all property names present in property objects.
* void load(InputStream is)// to load properties from properties file into java properties object.
* void store(OutputStream os,String comment)//to store properties from java properties objects into properties file.*/
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("C://Users//DELL//Lavanya//Automation//JavaOopsConcept//src//collections//abc.properties");
        p.load(fis);
        System.out.println(p);
        String s=p.getProperty("Hello");
        System.out.println(s);
        p.setProperty("nag","8888");
        FileOutputStream fos=new FileOutputStream("C://Users//DELL//Lavanya//Automation//JavaOopsConcept//src//collections//abc.properties");
        p.store(fos,"updated by lava for java program");
        /*Example 2:*/
        Properties p1=new Properties();
        FileInputStream fis1=new FileInputStream("db.properties");
        p.load(fis1);
        String url=p1.getProperty("url");
        String user=p1.getProperty("user");
        String pwd=p1.getProperty("pwd");
        Connection con= DriverManager.getConnection(url,user,pwd);
    }
}
class Tempe{
    int i;
    Tempe(int i){
        this.i=i;

    }
    public int hashCode(){
        return i;//{6 =C, 16 =F, 5 =A, 15 =D, 2 =B, 23 =E}
        // If we change hashcode temp code as */
        //return i%9;//{16 =F, 15 =D, 6 =C, 23 =E, 5 =A, 2 =B}
    }
    public String toString(){
        return i+" ";
    }
}
