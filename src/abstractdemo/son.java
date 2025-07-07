package abstractdemo;

public class son extends Parent {

    public son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become an engineer");
    }

    @Override
    void partner() {
        System.out.println("i love cars");
    }
}
