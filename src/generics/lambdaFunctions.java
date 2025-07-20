package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunctions {

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for(int i=0;i<5;i++){
//            arr.add(i+1);
//        }
//
//        arr.forEach((item) -> System.out.println(item * 2));
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        arr.forEach(fun);

        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        lambdaFunctions myCalculation = new lambdaFunctions();
        myCalculation.sum(23,23);
        myCalculation.operate(12,12,sum);
        myCalculation.operate(12,12,prod);
        myCalculation.operate(12,12,sub);


    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

    int sum (int a, int b){
        return a+b;
    }
}

interface Operation{
    int operation(int a, int b);
}
