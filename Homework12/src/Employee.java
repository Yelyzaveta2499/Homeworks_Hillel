import java.util.Scanner;

public class Employee {

    private String fullName;
    private String email;
    private String position;
    private String phoneNumber;
    private int age;

    public Employee(String fullName, String email, String position, String phoneNumber, int age) {
        this.fullName = fullName;
        if (email == null || !email.contains("@")) {
            System.out.println("Note: Invalid email address");
        }
        this.email = email;
        this.position = position;
        this.phoneNumber = phoneNumber;
        if (age < 0) {
            System.out.println("Note: Age cannot be negative");
        }
        this.age = age;
        System.out.println("Note: Employee created successfully");
    }

    @Override
    public String toString() {
        return "Employee" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age
                ;
    }

}
