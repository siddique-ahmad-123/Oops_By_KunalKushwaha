package Interfaces.extendDemo;

public interface A {

    //static method should have a body
    static void greet(){
        System.out.println("static method should have a body");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
