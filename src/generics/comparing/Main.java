package generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(23,23.2f);
        Student student2 = new Student(25,29.2f);
        Student student3 = new Student(22,23.2f);
        Student student4 = new Student(2,29.2f);
        Student student5 = new Student(3,23.2f);
        Student student6 = new Student(232,29.2f);


        Student[] list = {student1,student2,student3,student4,student5,student6};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(student1.compareTo(student2)<0){
            System.out.println("student2 has more marks than student1");
        }
    }
}
