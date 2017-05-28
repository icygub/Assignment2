package cs115;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        char[] c = new char[2];
//        c[0] = 'A';
//        c[1] = 'B';
        CourseOffering co1 = new CourseOffering(12345, "Math", "Teacher", 'A', "101", LocalTime.MIDNIGHT, 3, 100);
        CourseOffering co2 = new CourseOffering(12345, "Math", "Teacher", 'A', "101", LocalTime.MIDNIGHT, 3, 100);

        EnumDays days[] = new EnumDays[3];
        days[0] = EnumDays.MONDAY;
        days[1] = EnumDays.TUESDAY;
        days[2] = EnumDays.WEDNESDAY;
        co1.setDays(days);
        for(EnumDays ed : co1.getDays()) {
            System.out.println(ed.toString());
        }
        byte b = 0b01000;
        System.out.println(b);



    }
}
