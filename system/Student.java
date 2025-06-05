package system;

public  class Student {

    private String name;
    private int studentId;
    private double grade;

    public Student(String name, int studentId, double grade){
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public double getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return "Student ID: " + studentId + ", Name: " + name + ", Grade: " + grade;
    }




}
