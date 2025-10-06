package education;

public class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    public void addStudent(Student student){
        if(studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Classroom is full");
        }
    }

    public void listStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
}
