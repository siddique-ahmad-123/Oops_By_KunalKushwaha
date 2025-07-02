package StaticExample;

//outer class cannot be static
public class InnerClass {
    //test is dependept on InnerClass thats is whys if we dont use static in class test then it will give an error
   static class test{

        String Name;
         public test(String Name){
             this.Name = Name;
         }

    }


    public static void main(String[] args) {
        test obj = new test("siddique");
        test obj2 = new test("ahmad");

        System.out.println(obj.Name);
        System.out.println(obj2.Name);
    }
}
