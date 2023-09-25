import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Passport passport11 = new Passport(LocalDate.of(1990, 5,15), "Dubai", "Female");
        Passport passport1=new Passport(LocalDate.of(2010, 3, 8), "Japan", "Male");
        Passport passport=new Passport(LocalDate.of(2008, 4, 7), "Korea", "Male");

        Bank bank = new Bank("AdelZh", 12345, 150);
        Bank bank1=new Bank("AzizZh", 5678, 200);


        Product product11 = new Product("Coca Cola", "Beverage", 234, 100, LocalDate.of(2023, 9, 10), false);
        Product product12 = new Product("Fanta", "Beverage", 89, 890, LocalDate.of(2023, 6,10), true);
        Product product13=new Product("Pepsi", "Beverage", 89, 456, LocalDate.of(2022, 9, 10), true);
        Product product14=new Product("KFC", "Beverage", 77, 5, LocalDate.of(2023, 5, 10), true);
        Product product15=new Product("Mac", "Beverage", 90, 67, LocalDate.of(2022, 9, 10), false);


        Product [] products={product11, product14};
        Product[] products1={product12};
        Product [] products11={product13};


        Customer customer=new Customer("Elina", products, bank, passport11);
        Customer customer2=new Customer("Alibek", products1, bank1, passport1);
        Customer customer1=new Customer("Alina", products11, bank1, passport);
        Customer[] customers={customer, customer2, customer1};
        DataBase dataBase=new DataBase(customers);
        

    }
}