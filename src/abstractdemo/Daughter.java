package abstractdemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to become a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love chin chan");
    }
}
