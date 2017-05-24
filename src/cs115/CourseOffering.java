package cs115;

import javax.management.DynamicMBean;
import java.time.LocalTime;

/**
 * Created by icyhot on 22/05/2017.
 */
public class CourseOffering {

    private int courseNumber;
    private String courseName;
    private String instructor;
    private char[] section = new char[2];
    private String room;
    private LocalTime time;
    private int capacity;

    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY

    }

    public Days getDays() {
        return
    }


    public CourseOffering(int courseNumber, String courseName, String instructor,
                          char[] section, String room, LocalTime time, int capacity) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.instructor = instructor;
        this.section = section;
        this.room = room;
        this.time = time;
        this.capacity = capacity;
    }

    public String toStringg() {
        return Days.MONDAY.toString();
    }


    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public char[] getSection() {
        return section;
    }

    public void setSection(char[] section) {
        this.section = section;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
