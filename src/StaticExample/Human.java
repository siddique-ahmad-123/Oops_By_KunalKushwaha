package StaticExample;



public class Human {
    int age;
    String Name;
    int Salary;
    boolean isMarried;
   static long population;

    public Human(int age,String Name,int Salary,boolean isMarried){
        this.age = age;
        this.Name = Name;
        this.Salary = Salary;
        this.isMarried = isMarried;
        Human.population+=1;
    }
}
