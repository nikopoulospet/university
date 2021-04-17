import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(){
        this.name = getName();
        this.courses= getCourses();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
           this.name = name;
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public void setCourses(List<Course> courses){
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student: [" + this.name + ']';
    }

    public void listStudentCourses(){
        System.out.print(name +"'s courses: ");
        for (Course course : courses) {
            System.out.print(course);
        }
    }

    public void addCourse(Course course){
        courses.add(course);
    }

}
