import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Student> set = new HashSet<Student>();
        for(int i=0;i<courses.size();i++){
            //students += courses.get(i).getStudents().size();
            for(int ii=0;ii<courses.get(i).getStudents().size();ii++) {
                set.add(courses.get(i).getStudents().get(ii));
            }
        }

        return set.size();
    }
}