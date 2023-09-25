import java.time.LocalDate;

public class Product {
    private String name;
    private String description;
    private int price;
    private int count;
    private LocalDate madeInDate;
    private boolean isAlcoholic;


    public Product() {

    }

    public Product(String name, String description, int price, int count, LocalDate madeInDate, boolean isAlcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madeInDate = madeInDate;
        this.isAlcoholic = isAlcoholic;
    }

    public LocalDate getMadeInDate() {
        return madeInDate;
    }


    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", madeInDate=" + madeInDate +
                ", isAlcoholic='" + isAlcoholic + '\'' +
                '}';
    }

}



