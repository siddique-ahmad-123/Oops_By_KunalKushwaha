

public class Student {
   int rno;
   String Name;
   float marks;

   void greetings () {
       System.out.println("Hello my name is " + Name);
   }

   void changeName (String newName) {
      Name = newName;
   }

   // if i want to take data from other object
    //other will be replaced with kunal and this will be replaced with random
   Student (Student other) {
     this.Name = other.Name;
     this.rno = other.rno;
     this.marks = other.marks;
   }

   //when you call student with 0 argument

   Student(){
   //this is how you call constructor form another constructor
       //internally it is : new Student(13,12.4f,"usman")
       this(14,12.4f,"usman");
    }
                                                      //This is called function or sonstructor overloading
    //when you call student  with argument

    Student(int rno,float marks,String Name){
        this.rno = rno;
        this.marks=marks;
        this.Name=Name;
    }
}
