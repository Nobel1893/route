package route.com.routesurvey.Abstract;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 3/31/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class CourseItem {

    String courseName;
    String CourseInstructor;

    public CourseItem(){

    }

    public CourseItem(String courseName, String courseInstructor) {
        this.courseName = courseName;
        CourseInstructor = courseInstructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return CourseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        CourseInstructor = courseInstructor;
    }
}
