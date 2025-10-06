package education;

public class Student {
    private String name;

    public Student(String name) {
        int minLength = 3;
        if(name.length() < minLength) {
            System.out.println("Name " + name + " is too short, min length is " + minLength);
        } else {
        this.name = name;
        }
    }

    public String getName() {
        return name;
    }
}
