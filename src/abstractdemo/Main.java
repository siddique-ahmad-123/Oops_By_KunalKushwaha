package abstractdemo;

public class Main {
    public static void main(String[] args) {
      son son1 = new son(21);
      son1.career();
      Daughter daughter = new Daughter(23);
      daughter.partner();

      Parent parent = new Daughter(23);   //runtime polymorphism
      parent.career();

      Parent parent1  = new son(21);  // runtime polymorphism
      parent1.partner();

      // Parent mom  = new Parent(); // cannot create object of an abstract class
    }
}
