package cs115;

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
        if(first.getTime() == second.getTime() &&
                first.getDays() == second.getDays()) {
            return true;
        }
        return false;
    }


}
