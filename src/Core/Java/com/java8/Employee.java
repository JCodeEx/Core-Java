package Core.Java.com.java8;

public class Employee {
    public Employee(String name, int id, int age, double sal) {

        this.name = name;
        this.Id = id;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    String name;
    int Id;
    int age;
    double sal;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
