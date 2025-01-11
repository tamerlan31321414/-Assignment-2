public class Student extends Person {
    private double gpa;

    public Student() {
        this.gpa = 0.0;
    }

    public Student(String name, String Surname, double gpa) {
        super(name, Surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.0;
        }
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

}

