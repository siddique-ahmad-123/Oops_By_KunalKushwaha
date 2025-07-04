//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


   Student siddique = new Student(13,13.5f,"ali");
   Student kunal = new Student();

   Student random = new Student(kunal);

   Student random1 = new Student();

        System.out.println(random1.Name);

        Student one = new Student();
        Student two = one;

        one.Name = "asdasdasidnhsajdj";
        System.out.println(one.Name);

//   siddique.changeName("umar");
//
//   siddique.greetings();

        System.out.println(siddique.rno);
        System.out.println(siddique.marks);
        System.out.println(siddique.Name);

    }
}