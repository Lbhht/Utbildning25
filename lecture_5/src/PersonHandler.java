public class PersonHandler {
    public static void main(String[] args) {
        System.out.println("Person handler");

        Person person1 = new Person("Anders", 19);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());


        person1.setName("Anna");
        person1.setAge(42);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
}
