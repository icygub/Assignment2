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
            return true;
        }
        return false;
    }


}
