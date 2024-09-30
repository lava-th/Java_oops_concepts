package inheritance.multipleinhertiance;
/*Parent class is multiple that is more than one parent class at a time is called multiple inheritance
* multiple inheritance not support in java for interface is support
* what is the reason if parent1 class contain one m1 method and parent2 class contain m1 method on the child object any one calling m1 method which m1 method should execute either parent1 or parent2 so there is no way to resolve this method there is a chance of ambiguity problem
* Because of this ambiguity problem with extends more than one parent class simultaneously
* Other way is called as Diamond access problem because this problem java not provide multiple inheritance simultaneously
* In interface it is possible
* If one parent1 interface is having m1 method without implementation only declaration and parent2 interface having m2 method without implementation  only declaration the m1 and m2 declaration comes to child the person who is going to implements the child interface that is called implementation class
* This implementation class is provide the implement to the one m1 method implementation or unique implementation*/
interface Parent1Class {
    public void m1();
}
