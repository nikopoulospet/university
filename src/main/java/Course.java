import java.util.List;

public class Course {
    private String name;
    private List<Student> students;

    public Course(){
        this.name = getName();
        this.students = getStudents();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + this.name + '\'' +
                ", students=" + this.students +
                '}';
    }

    public void listCourseStudents(){
        System.out.println(name +"'s students: ");
        for(int i =0; i<students.size();i++) {
            System.out.println(students.get(i));
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
