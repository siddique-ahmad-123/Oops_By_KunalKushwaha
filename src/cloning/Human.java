package cloning;

public class Human implements Cloneable{
       int age;
       String name;
       int[] arr;


    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,4,5};
    }

//    public Human(Human other){
//
//        this.name = other.name;
//        this.age = other.age;
//
//    }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone(); //it is actually shallow copy

        //make a deep copy

        twin.arr = new int[twin.arr.length];

        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
