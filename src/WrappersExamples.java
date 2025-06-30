

public class WrappersExamples {

    public static void main(String[] args) {
//       final int a = 10;
//      final  int b = 20;
//        Integer num = 12;

//      final  Integer a = 10;
//      final  Integer b = 20;



        IntWrapper a = new IntWrapper(10);
        IntWrapper b = new IntWrapper(20);


        swap(a,b);
        System.out.println(a.value + " " + b.value);

        final A kunal = new A("Siddique");
        kunal.Name = "other name";

        // when a non primitive is final we cannot reassigned it

//        A obj;
//
//        for(int i=0;i<100000000;i++){
//
//            obj = new A("new object created");
//
//        }
    }

    //swap will not work because it is passed by value
    //when i changed int to integer it will be passed by reference

   static void swap(IntWrapper a, IntWrapper b){
        int temp = a.value;
        a.value=b.value;
        b.value=temp;
    }

    static class IntWrapper{
        int value;
        IntWrapper(int value){
            this.value = value;
        }
      }

    }

 class A {
    final int a = 10;
    String Name;

    public A (String Name){
        System.out.println("object is being created");
        this.Name = Name;
    }

     @Override
     protected void finalize() throws Throwable {
         System.out.println("Object is Destroyed");
     }
 }
