package inheritence;

public class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void info() {
        System.out.println("Animal name is: " + name + ", and age is: " + age);
    }
}
