package Interfaces;

public class NiceCar {

    CDPLayer player = new CDPLayer();
    private Engine engine;

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
       this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void StopMusic(){
        player.stop();
    }

}
