import java.util.List;

public class Course {
    private String name;
    private List<Student> students;
    Course course = new Course();

    public Course(){
        this.name = getName();
        this.students = getStudents();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        course.setName(name);
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public List<Student> setStudents(List<Student> students){
       return course.setStudents(students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void listCourseStudents(){
        System.out.println(course.students);
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
