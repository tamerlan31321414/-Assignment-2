public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        this.position = "";
        this.salary = 0;
    }

    public Employee(String Name, String surname, String position, int salary) {
        super(Name, surname);
        this.position = position;
        this.salary = salary;


    }

    public String getPosition() {
        return position;

    }

    public void setPosition(String position) {

        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

}


