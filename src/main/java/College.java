import java.util.List;

public class College {
    private String collegeName;
    private List<Dept> depts;

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int countCourses(){
        int courses = 0;
        for(int i=0;i<depts.size();i++){
            courses += depts.get(i).countCourses();
        }
        return courses;
    }

    public int countStudentsInCourses(){
        int students = 0;
        for(int i=0;i<depts.size();i++){
            students += depts.get(i).countStudentsInDeptCourses();
        }

        return students;
    }
}
