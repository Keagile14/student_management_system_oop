package system;

import java.util.ArrayList;

public class StudentManager  {

    private ArrayList<Student> students = new ArrayList<>();



    public void addStudent(String name,int studentId,double grade){
        Student newStudent = new Student(name,studentId,grade);
        students.add(newStudent);
        System.out.println("Student added: " + name);
    }

    public Student findStudentId(int studentId){
        for (Student s : students){
            if(s.getStudentId() == studentId){
                return s;
            }

        }
        return null;
    }

    public void listStudent(){
        if (students.isEmpty()){
            System.out.println("No Students found.");
        }else {
            System.out.println("Student list: ");
            for (Student s : students){
                System.out.println(s);
            }
        }
    }

}
