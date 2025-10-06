import education.Classroom;
import education.Student;
import sw.PodRacer;
import sw.Race;

public class Main {
    public static void main(String[] args) {
        System.out.println("Classroom example");

//        example1();
//        example2();
//        mathRandomDemo();
        racing();

    }

    private static void example1() {
        Student student1 = new Student("Anders");
//        System.out.println(student1.getName());

        Classroom java25 = new Classroom(5);

        java25.addStudent(student1);
        java25.addStudent(new Student("Lisa"));
        java25.addStudent(new Student("Mona"));
        java25.addStudent(new Student("Tobias"));
        java25.addStudent(new Student("Anders"));

        java25.listStudents();
    }

    public static void example2() {
//        String[] names = new String[5];
//        name[0] = "Andreas";

        String[] names = {"Andreas", "Anna", "Hugo", "Alex", "Pelle", "Viktor"};
        Classroom java25 = new Classroom(names.length);

        for (int i = 0; i < names.length; i++) {
            java25.addStudent(new Student(names[i]));
        }

        java25.listStudents();
    }

    private static void mathRandomDemo() {
        System.out.println(Math.random());
        System.out.println(Math.random() * 20);
        System.out.println(Math.round(Math.random() * 20));
    }

    private static void racing() {
        PodRacer anakin = new PodRacer("Anakin Skywalker", 0);
        PodRacer sebulba = new PodRacer("Sebulba", 0);

        // Skapa Race
        Race race = new Race(anakin, sebulba);
        race.start();
    }
}