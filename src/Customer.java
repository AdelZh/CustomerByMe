import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Customer {
    private String name;
    private Product[] product;
    private Bank bank;
    private Passport passport;

    public Customer(String name, Product[] product, Bank bank, Passport passport) {
        this.name = name;
        this.product = product;
        this.bank = bank;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }


    public Product[] getCustomerOfMyProducts(String name) {
       for(Product product1:product){
           if(product1.getName().equals(name)){
               System.out.println(product1.getName());
           }
       }
       return product;
    }


    public Product[] addProduct(Product productName) {
       for(Product product1:product){
           if(!product1.equals(productName)){
               Product[] newProduct=Arrays.copyOf(product, product.length+1);
               newProduct[newProduct.length-1]=productName;
               setProduct(newProduct);
               return newProduct;

           }
       }
       return null;
    }


    public Product[] addProduct1(Product productName) {
        for(int i=0; i<product.length; i++){
            Product [] arr=Arrays.copyOf(product, product.length+1);
            arr[arr.length-1]=productName;
            product=arr;
            System.out.println(Arrays.toString(product));
            break;

        }
        return null;
    }



    public String checkProduct3(Product[] products) {
        for (Product product1 : products) {
            System.out.println(product1 + ((product1.getIsAlcoholic()) ? "Alcoholic" : "It is not alcoholic"));
        }
        return null;

    }




    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", product=" + Arrays.toString(product) +
                ", bank=" + bank +
                ", passport=" + passport +

                '}';
    }


}

