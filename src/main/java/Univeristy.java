import java.util.*;

public class Univeristy {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();

        for(int i=0;i<15;i++){
            studentList.add(new Student());
            studentList.get(i).setName("student"+i);
            studentList.get(i).setCourses(new LinkedList<>());
        }



        int offset = 0;
        for(int i=0;i<5;i++){
            courseList.add(new Course());
            courseList.get(i).setName("course"+i);
            courseList.get(i).setStudents(new LinkedList<>());

            for(int ii=0;ii<6;ii++){
                int x = (ii+offset)%studentList.size();
                courseList.get(i).addStudent(studentList.get(x));
                studentList.get(x).addCourse(courseList.get(i));
            }
            offset += 3;
        }

        Dept depart0 = new Dept();
        depart0.setCourses(courseList.subList(0,2));


        Dept depart1 = new Dept();
        depart1.setCourses(courseList.subList(3,4));


        List<Dept> deptList = new ArrayList<>();
        deptList.add(depart0);
        deptList.add(depart1);

        College college0 = new College();
        college0.setDepts(deptList);

        System.out.println("Total number of students in college 0: " + college0.countStudentsInCourses());
        System.out.println("========= Department Breakdown =========");
        for(int i=0;i<deptList.size();i++){
            System.out.println("Department "+i+" has " + deptList.get(i).countStudentsInDeptCourses() + " students.");
        }

        System.out.println("Total number of courses in college 0: "+ college0.countCourses());
        System.out.println("========= Department Breakdown =========");
        for(int i=0;i<deptList.size();i++){
            System.out.println("Department "+i+" has " + deptList.get(i).countCourses() + " courses.");
        }

        System.out.println("========== Some Student Examples ==========");
        for(int i=0;i<5;i++){
            System.out.println("Student "+i+" is enrolled in " + studentList.get(i).getCourses().size() + " courses.");
        }

    }

}
