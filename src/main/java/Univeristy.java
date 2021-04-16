import java.util.List;



public class Univeristy {
    public static void main(String[] args){
        List<Student> studentList = null;
        List<Course> courseList = null;

        for(int i=0;i<15;i++){
            studentList.add(new Student());
            studentList.get(i).setName("student"+i);
        }

        int offset = 0;
        for(int i=0;i<5;i++){
            courseList.add(new Course());
            courseList.get(i).setName("course"+i);
            for(int ii=0;i<6;i++){
                int x = (i+offset)%studentList.size();
                courseList.get(i).addStudent(studentList.get(x));
            }
            offset += 3;
        }

        Dept depart0 = new Dept();
        depart0.setCourses(courseList.subList(0,2));


        Dept depart1 = new Dept();
        depart1.setCourses(courseList.subList(3,4));


        List<Dept> deptList = null;
        deptList.add(depart0);
        deptList.add(depart1);

        College college0 = new College();
        college0.setDepts(deptList);

        System.out.println("total number of students in college 0: " + college0.countStudentsInCourses());
        System.out.println("========= department breakdown =========");
        for(int i=0;i<deptList.size();i++){
            System.out.println("depart"+i+" has " + deptList.get(i).countStudentsInDeptCourses() + "students");
        }

        System.out.println("total number of courses in college 0: "+ college0.countCourses());
        System.out.println("========= department breakdown =========");
        for(int i=0;i<deptList.size();i++){
            System.out.println("depart"+i+" has " + deptList.get(i).countCourses() + "courses");
        }

        System.out.println("==== some student examples ====");
        for(int i=0;i<5;i++){
            System.out.println("student"+i+" is enrolled in " + studentList.get(i).getCourses().size() + " courses");
        }

    }

}
