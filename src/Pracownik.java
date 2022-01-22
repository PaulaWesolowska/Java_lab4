public class Pracownik implements PracownikI{

    private int age;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;
    private String task;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getTask() {
        return task;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Information about employee: " +
                "age = "  + age +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", position = '" + position + '\'' +
                ", salary = " + salary +
                ", task = '" + task + '\'' ;
    }

    public Pracownik(int age, String firstName, String lastName, String position, double salary, String task) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.task = task;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public void getPosition(String position) {
        this.position = position;
    }
    @Override
    public void getSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void setTask(String task) {
        this.task = task;
    }
}
