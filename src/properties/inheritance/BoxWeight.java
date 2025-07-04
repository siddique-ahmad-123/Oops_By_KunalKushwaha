package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);  // what is this? call the parent class constructor
        //used to initialise values present in parent class
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){

        this.weight = weight;

    }

    public BoxWeight(double cost,double weight){
        super(cost);
        this.weight = weight;
    }

}
