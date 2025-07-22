package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(23);
        list2.add(23);
        list2.add(23);
        list2.add(23);
        System.out.println(list2);


        List<Integer> vector = new Vector<>();

        vector.add(30);
        System.out.println(vector);


    }
}
