package Business;

import Entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ArrayList<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void creaate(Course course) {
        try {
        for (Course courses1 : courses) {
            if (courses1.getName().equals(course.getName()) ) {
                throw new Exception("Name already exist!!");
                }
            }
            courses.add(course);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
