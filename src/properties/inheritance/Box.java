package properties.inheritance;

public class Box {
    double h;
    double l;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
       this.l = side;
       this.h = side;
       this.w = side;
    }

    Box(double l,double h,double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void DisplayInformation(){
        System.out.println("Print the box !");
    }


}
