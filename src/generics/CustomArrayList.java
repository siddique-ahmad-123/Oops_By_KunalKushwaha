package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {
    private int[] data;
    static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void Add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int[data.length*2];
        //copy the current item in new array
        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        if(data.length == size){
            return true;
        }
        return false;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public  void set(int index,int value){
         data[index]=value;
    }

    public int remove () {
        int removed = data[size--];
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) +
         ", size = " + size + '}';
    }

    public static void main(String[] args) {
        CustomArrayList List  = new CustomArrayList();
        //It can store only integer data type
        for(int i=0;i<14;i++){
            List.Add(i*2);
        }
        System.out.println(List);

        ArrayList<Integer> List2 = new ArrayList<>(); //this is original array list and primitive cannot be added here in generics


    }

}
