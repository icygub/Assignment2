package cs115;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CourseOffering> list = new ArrayList<>();
        CourseOfferingConflictDetector detector = new CourseOfferingConflictDetector();
        list.add(new CourseOffering(12345, "Algebra", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "History", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "English", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Computer Science", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Art", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Gym", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Physics", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Chemistry", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Calculus", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));
        list.add(new CourseOffering(12345, "Marketing", "Teacher", 'A',
                "101", LocalTime.MIDNIGHT, 3, 100));

        for( int x = 0; x < list.size(); x++) {
            for(int i = x + 1; i < list.size(); i++) { //cannot compare to self itself.
                detector.isTimeDayConflict(list.get(x), list.get(i));
            }
        }

    }
}
