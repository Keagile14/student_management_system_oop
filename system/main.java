package system;

public class main {

    public static void main(String[] args){
        StudentManager manager = new StudentManager();

        manager.addStudent("Keagile",405, 15);
        manager.addStudent("Sean",103,11);
        manager.addStudent("Mandisi",406,11);


        System.out.println("\n All students:");
        manager.listStudent();
    }
}
