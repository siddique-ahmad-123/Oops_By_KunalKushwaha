package abstractdemo;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void career();
    abstract void partner();

    static void greetings(){
        System.out.println("hello good morning !!");
    }






}
