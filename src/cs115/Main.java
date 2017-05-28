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

        EnumDays days[];
        for(int i = 0; i < 2; i++) {
            days = new EnumDays[3];
            days[0] = EnumDays.MONDAY;
            days[1] = EnumDays.TUESDAY;
            if(i == 0) {
                days[2] = EnumDays.WEDNESDAY;
                co1.setDays(days);
            }

            else {
                days[2] = EnumDays.FRIDAY;
                co2.setDays(days);
            }

        }

        for(EnumDays ed : co1.getDays()) {
            System.out.println(ed.toString());
        }
        for(EnumDays ed : co2.getDays()) {
            System.out.println(ed.toString());
        }

        CourseOfferingConflictDetector detector = new CourseOfferingConflictDetector();

        boolean result = detector.isTimeDayConflict(co1, co2);
        if(result)
            System.out.println("Conflict");
        else
            System.out.println("No conflict");

        boolean rmConflict = detector.isRoomConflict(co1, co2);
        if(rmConflict)
            System.out.println("Room conflict");
        else
            System.out.println("No room conflict");



    }
}
