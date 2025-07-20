package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void Add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        //copy the current item in new array
        for(int i=0;i< data.length;i++){
            temp[i] = (T)(data[i]);
        }
        data = temp;
    }
    private boolean isFull() {
        if(data.length == size){
            return true;
        }
        return false;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public  void set(int index,int value){
         data[index]=value;
    }

    public T remove () {
        T removed = (T)(data[size--]);
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) +
         ", size = " + size + '}';
    }

    public static void main(String[] args) {
//        CustomGenericsArrayList List  = new CustomGenericsArrayList();
//        //It can store only integer data type
//        for(int i=0;i<14;i++){
//            List.Add(i*2);
//        }
//        System.out.println(List);
//
//        ArrayList<Integer> List2 = new ArrayList<>(); //this is original array list and primitive cannot be added here in generics

        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();
        list.Add(30);

        System.out.println(list);


    }

}
