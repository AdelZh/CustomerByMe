import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class DataBase {
    private Customer[] customers;
    private Product[] products;


    public DataBase(Customer[] customers) {
        this.customers = customers;

    }

    public void getCustomerOfMyProducts(String name) {
        for (Customer customer : customers) {
            for (Product product : customer.getProduct()) {
                if (product.getName().equals(name))
                    System.out.println(customer.getName());
            }
        }
    }

    public Product[] deleteProductByName(String name, String productName) {

        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                Product[] products = customer.getProduct();
                int indexToRemove = -1;
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getName().equals(productName)) {
                        indexToRemove = i;
                        break;

                    }

                }
                if (indexToRemove != -1) {
                    int j = 0;
                    Product[] products1 = new Product[products.length];
                    for (int i = 0; i < products.length; i++) {
                        if (i != indexToRemove) {
                            products1[j] = products[i];
                            j++;
                        }
                    }
                    products = Arrays.copyOf(products1, products1.length - 1);
                    customer.setProduct(products);
                    return products;
                }
            }
        }
        return null;
    }


    public void checkProduct(Product[] products) {
        for (Customer customer : customers) {
            for (Product product : customer.getProduct()) {
                if (Arrays.asList(products).contains(product)) {
                    Period age2 = Period.between(product.getMadeInDate(), LocalDate.now());
                    if (age2.getMonths() >= 1) {
                        System.out.println("Expired" + product);
                    } else {
                        System.out.println("Not expired" + product);
                    }
                }
            }
        }
    }

    public void getAge(Product[] products) {
        for (Customer customer : customers) {
            for (Product product : customer.getProduct()) {
                if (Arrays.asList(products).contains(product)) {
                    Period age = Period.between(customer.getPassport().getDateOfBirth(), LocalDate.now());
                    if (age.getYears() >= 18) {
                        System.out.println("You can drink" + product + customer.getName());
                    } else {
                        System.out.println("You cannot drink");
                    }
                }
            }
        }
    }


    public void getAllProduct() {
        for (Customer customer : customers) {
            for (Product product : customer.getProduct()) {
                System.out.println(product);
            }

        }

    }

    public String getAllCustomer(String name) {
        for (Customer customer : customers) {
            for (Product product : customer.getProduct()) {
                if (product.getName().equals(name)) {
                    return "Your customers" + customer;
                }
            }
        }
        return null;
    }
}








