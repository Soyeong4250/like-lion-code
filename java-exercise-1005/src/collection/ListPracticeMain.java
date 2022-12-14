package collection;

import java.util.List;

public class ListPracticeMain {

    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentsObjs = likeLion2th.getStudentObjsList();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());  // size() : List의 인터페이스

        for (Student s: studentsObjs) {
            System.out.println(s.toString());
        }
    }
    
}
