public class Person  implements Payable {
    private static int idcouter = 0;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idcouter++;
        this.name = "unknown";
        this.surname = "unknown";

    }

    public Person(String name, String surname) {
        this.id = idcouter++;
        this.name = name;
        this.surname = surname;

    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSurname() {
        return surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;


    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;

    }
}


