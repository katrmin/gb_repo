package ru.sbrf.mea;

/**
 * @author Ekaterina M
 * Home work of lesson 5
 */
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("A Ivanov", "director", "1@11.ru",
                "+7(916)1234567", 55000, 25);
        employee.printInfo();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan0", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Ivanov Ivan1", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[2] = new Employee("Ivanov Ivan2", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[3] = new Employee("Ivanov Ivan3", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 80);
        persArray[4] = new Employee("Ivanov Ivan4", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);

        for (Employee e : persArray) {
            if (e.getAge() > 40) {
                e.printInfo();
            }
        }
    }
}

/**
 * Simple class employee
 */
class Employee {

    private String fio;

    private String role;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String fio, String role, String email, String phone, int salary, int age) {
        this.fio = fio;

        this.role = role;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return fio;
    }

    public void setFirstName(String firstName) {
        this.fio = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /**
     * Print information about employee
     */
    public void printInfo() {

        System.out.println(this);
    }


}
