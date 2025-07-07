package Interfaces;

public class Car implements Engine,Brake {    //can inherit the property of more than one classes


    @Override
    public void brake() {
        System.out.println("Take Brake !!");
    }

    @Override
    public void start() {
        System.out.println("Take Start !!");
    }

    @Override
    public void stop() {
        System.out.println("Take Stop !!");
    }

    @Override
    public void acclrt() {
        System.out.println("Take Acclrt !!");
    }
}
