package properties.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

     BoxPrice(){
         super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
         super(other);
         this.cost = other.cost;
    }

    public BoxPrice(double cost,double weight,double l,double h,double w){
        super(weight,l,h,w);
         this.cost = cost;

    }

    public BoxPrice(double side,double cost,double weight){
      super(side,weight);
      this.cost = cost;
    }

}
