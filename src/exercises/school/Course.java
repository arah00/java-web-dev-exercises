package exercises.school;
import java.util.*;


public class Course {
    private String courseName;
    private int courseId;
    private int courseCredits;
    private ArrayList<Student> students;

    public Course(String courseName, int courseId, int courseCredits, ArrayList<Student> students) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCredits = courseCredits;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId && Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseId);
    }
}
