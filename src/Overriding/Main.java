package Overriding;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();  //Reference and Object both of Animal
        a.Sound();

        Dog d = new Dog();  //Reference and object both of Dog
        d.Sound();

        Animal ad = new Dog();  //Refernce Animal object Dog
        ad.Sound();
    }
}
