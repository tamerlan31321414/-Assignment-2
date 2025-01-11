import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<>();
        payables.add(new Employee("John", "Lennon", "Manager",50000));
        payables.add(new Student("Paul", "McCartney", 3.5));
        payables.add(new Student("George", "Harrison", 3.4));
        payables.add(new Employee("Ringo", "Starr", "Developer", 70000) );

        // Выводим данные
        printData(payables);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}