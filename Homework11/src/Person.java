public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, String profession, int age) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void displayInfo() {
        System.out.printf("Name: %s, Profession: %s, Age: %d%n", this.name, this.profession, this.age);
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }


}

