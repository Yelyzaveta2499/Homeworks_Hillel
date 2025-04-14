//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Engineer", 30);
        Person person2 = new Person("Mary", "Teacher", 25);
        Person person3 = new Person("Bob", "Doctor", 35);
        System.out.println("1.");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        Person person4 = new Person("Alice", "Architect", 28);
        System.out.println("\n2.");
        person4.displayInfo();
        System.out.println("(After profession change)");
        person4.setProfession("Designer");
        person4.displayInfo();
    }
}