package cs115;

/**
 * Created by icyhot on 22/05/2017.
 */
public class CourseOfferingConflictDetector {

    public boolean isRoomConflict(CourseOffering first, CourseOffering second) {

        return false;
    }

    public boolean isTimeDayConflict(CourseOffering first, CourseOffering second) {
        if(first.getTime() == second.getTime()) {
            return true;
        }
        return false;
    }


}
