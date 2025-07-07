package polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Shapes shape1 = new Square();

        shape1.Area();

    }
}
