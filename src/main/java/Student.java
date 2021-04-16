import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;
    private List<Student> students;
    Student student = new Student();

    public Student(){
        this.name = getName();
        this.courses= getCourses();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
           student.setName(name);
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public List<Course> setCourses(List<Course> courses){
        return student.setCourses(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void listStudentCourses(){
        System.out.println(name + "'s courses: " +  student.courses);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

}
