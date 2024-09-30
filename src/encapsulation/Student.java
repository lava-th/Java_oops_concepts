package encapsulation;
/*Every java class is an example of encapsulation
* The process of grouping/combining data members and the corresponding methods are behaviour into a single unit is called encapsulation
* If any component follow hiding the data and abstraction that component is said to be encapsulation
* encapsulation=Data hiding + Abstraction
* In encapsulation the data hiding take place where the variable is declared as private
* And the abstraction is takes place they never highlighted the methods(set and get) functionality to the outside user directly they provide the GUI screen to the user by using buttons
* End user could not know internally which code is executing and which methods(get and set) is executive, so it is called abstraction
* Disadvantage is performance is going down because of time-consuming and length of the code always going increases because of validation logic is executed
* Advantage is security, enhancement and maintainability
* In a class each and every variable contain the private such type of class is tightly encapsulated
* If parent class is not tightly encapsulated and the no child class tightly encapsulated */

//below is the encapsulation example
public class Student {
    String name;
    int roll_no;
    int age;
    int marks;
    public void read(){
        System.out.println("reading the books");
    }
    public void write(){
        System.out.println("writing the books");
    }
}
