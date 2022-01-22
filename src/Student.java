public class Student implements StudentI{

    private int age;
    private String firstName;
    private String lastName;
    private int indexNumber;
    private double assessment;
    private String course;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public double getAssessment() {
        return assessment;
    }

    public String getCourse() {
        return course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int age, String firstName, String lastName, int indexNumber, double assessment, String course) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.assessment = assessment;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Information about student: " +
                " age = " + age +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", indexNumber = " + indexNumber +
                ", assessment = " + assessment +
                ", course = '" + course + '\'' ;
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
    public void getIndex(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    @Override
    public void getCourse(String course) {
        this.course = course;
    }
}
