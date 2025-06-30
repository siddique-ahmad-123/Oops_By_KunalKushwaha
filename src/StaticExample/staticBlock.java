package StaticExample;

//demo of static initialization

public class staticBlock {

    static int a = 1;
    static int b;

    //will only run once, when the first object is created that is when the class is loaded for the forst time
    static {
        System.out.println("i am in static block !!");
        b = a*5;
    }

    public static void main(String[] args) {
       //   staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " +staticBlock.b);

        staticBlock.b +=1;
        System.out.println(staticBlock.a + " " +staticBlock.b);

       // staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " +staticBlock.b);

    }

}
