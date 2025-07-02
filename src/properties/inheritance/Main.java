package properties.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(5);
        Box box2 = new Box(box);
        System.out.println(box.l +" "+ box.h +" "+box.w);
    }
}
