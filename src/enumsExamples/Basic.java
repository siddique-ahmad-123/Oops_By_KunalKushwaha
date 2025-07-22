package enumsExamples;

public class Basic{

    enum weekDays implements A{
        Monday,Tuesday,wednesday,Thursday,Friday,saturday,sunday

        //these are enums constants
        //public static final
        //type is week
        //since it is final you can create child enums
    }

    public static void main(String[] args) {
//        weekDays week;
//        week = weekDays.Monday;

        for(weekDays days : weekDays.values()){
            System.out.println(days);
        }
    }
}
