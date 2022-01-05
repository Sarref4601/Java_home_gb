/**
 *   Java 1. Homework #5
 *
 *   @author Andrei Boiko
 *   @version 05/01/2022
 */
class FifthHomework {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Svetlakov Petr", "Manager", "Svet@mailbox.com", "124151166", 30000, 42);
        persArray[2] = new Person("Petr", "Manager", "petya@mailbox.com", "6666666666", 40000, 30);
        persArray[3] = new Person("Volodya AMR", "Superman", "neputin@mailbox.com", "4953219960", 40000, 72);
        persArray[4] = new Person("Newman Newmanovich", "Cleaner", "UNKNOWN", "9239239233", 10000, 18);

            for (int i = 0; i < 5; i++) {
                if (persArray[i].getAge() > 40) {
                    System.out.println(persArray[i]);
                }
            }
    }
}

class Person {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + mail + ", " + phone + ", " + salary + ", " + age;
    }
}