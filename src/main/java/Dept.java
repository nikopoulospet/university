import java.util.List;

public class Dept {
    private String deptName;
    private List<Course> courses;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int countCourses(){
        return courses.size();
    }

    public int countStudentsInDeptCourses() {
        int students = 0;
        for(int i=0;i<courses.size();i++){
            students += courses.get(i).getStudents().size();
        }

        return students;
    }
}