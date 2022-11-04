public class Person {

    private String name;
    private String email;
    private int age;
    private double height;
    private int grade;

    public Person(){
        System.out.println("person Hello");
    }

    public Person(String name, String email, int age, double height, int grade) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.height = height;
        this.grade = grade;
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Person( int age, double height, int grade) {
        this.age = age;
        this.height = height;
        this.grade = grade;
    }
    
    public Person( int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void eat(){
        System.out.println("I'm Eating");
    }

    public String sayHello(){
        return "hello im person";
    }
}
