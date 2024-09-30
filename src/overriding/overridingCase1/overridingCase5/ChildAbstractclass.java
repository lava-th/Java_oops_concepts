package overriding.overridingCase1.overridingCase5;

public abstract class ChildAbstractclass extends ParentAbstractClass{
    @Override
    public void m1() {
        System.out.println("child method is non-abstract");

    }
    public abstract void m2();
}
