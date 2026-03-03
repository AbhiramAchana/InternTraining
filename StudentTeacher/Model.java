public class Model {

    public static void main(String[] args) {

        // Create Teacher
        Teacher teacher1 = new Teacher("Mr. Sharma", "Mathematics");

        // Create Course
        Course mathCourse = new Course("Mathematics 101", teacher1);

        // Create Students
        Student student1 = new Student("Abhi", 101);
        Student student2 = new Student("Rahul", 102);

        // Enroll students
        student1.enrollCourse(mathCourse);
        student2.enrollCourse(mathCourse);

        // Print Details
        System.out.println(student1.getName() + " enrolled in " + mathCourse.getCourseName());
        System.out.println(student2.getName() + " enrolled in " + mathCourse.getCourseName());
        System.out.println("Teacher for the course: " + mathCourse.getTeacher().getName());

        System.out.println("\nStudents in the course:");
        for (Student s : mathCourse.getStudents()) {
            System.out.println("- " + s.getName());
        }
    }
}