package cs115;

import java.time.LocalTime;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 27/05/2017.
 */
public class CourseOfferingConflictDetectorTest {
    @org.junit.Test
    public void isRoomConflict() throws Exception {
        CourseOfferingConflictDetector detector = new CourseOfferingConflictDetector();
        CourseOffering co1 = new CourseOffering(12345, "Algebra", "Spencer", 'A', "101", LocalTime.MIDNIGHT, 2, 100);
        CourseOffering co2 = new CourseOffering(54321, "History", "Anderson", 'B', "101", LocalTime.NOON, 1, 100);
        boolean shouldBeTrue = detector.isRoomConflict(co1, co2);
        assertTrue("There should be a room conflict", shouldBeTrue);

        CourseOffering co3 = new CourseOffering(54321, "History", "Anderson", 'B', "555", LocalTime.NOON, 1, 100);
        boolean shouldBeFalse = detector.isRoomConflict(co1, co3);
        assertFalse("There should not be a room conflict", shouldBeFalse);
    }

    @org.junit.Test
    public void isTimeDayConflict() throws Exception {
        
    }

}