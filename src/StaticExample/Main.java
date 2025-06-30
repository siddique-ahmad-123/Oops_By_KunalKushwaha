package StaticExample;

public class Main {

    public static void main(String[] args) {
        Human siddique = new Human(20,"Siddique",200,false);
        Human ahmad = new Human(22,"Ahmad",201,true);

        System.out.println(siddique.Name);
        System.out.println(ahmad.Salary);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }




}
