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

    public static void setName(String name){
       try {
           Student.setName(name);
       }
       catch(Exception e){
           e.printStackTrace();
        }
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public static List<Course> setCourses(List<Course> courses){
        return Student.setCourses(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void listStudentCourses(){
        System.out.println(student.courses);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

}
