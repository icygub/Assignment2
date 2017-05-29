package cs115;

import java.util.Arrays;

/**
 * Created by icyhot on 22/05/2017.
 */
public class CourseOfferingConflictDetector {

    public boolean isRoomConflict(CourseOffering first, CourseOffering second) {
        if(first.getRoom().equals(second.getRoom())) {
            return true;
        }
        return false;
    }

    public boolean isTimeDayConflict(CourseOffering first, CourseOffering second) {
        if(first.getTime() == second.getTime() && Arrays.equals(first.getDays(), second.getDays())) {
            boolean roomConflict = isRoomConflict(first, second);
            if(roomConflict) {
                System.out.println(first.toString());
                System.out.println(second.toString());
                System.out.println();
            }
            return true;
        }
        return false;
    }
}