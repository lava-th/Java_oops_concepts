package inheritance.multipleinhertiance;

interface Child1class extends Parent1Class,Parent2class{//,Parent2class{

    @Override
 default void m1(){
        System.out.println("default class");

    }

    @Override
    void m2();
}
