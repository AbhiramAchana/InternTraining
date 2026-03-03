import java.util.ArrayList;
import java.util.List;

class Teacher {

    private String name;
    private String subject;
    private List<Course> courses;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public List<Course> getCourses() {
        return courses;
    }
}