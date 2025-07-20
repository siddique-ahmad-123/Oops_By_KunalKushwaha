package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human siddique = new Human(23,"ahmad");
       // Human twin = new Human(siddique);

        Human twin = (Human)siddique.clone();

        System.out.println(twin.age + " " + twin.name);


        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(siddique.arr));


    }
}
