package access;

public class Main {
    public static void main(String[] args) {
          A obj = new A(12,"Siddiqe");

          obj.getNum();

          Objectdemo obj1 = new Objectdemo(23);
        System.out.println(obj1.hashCode());

        System.out.println(obj instanceof A);

    }
}
