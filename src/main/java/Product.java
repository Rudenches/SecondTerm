import java.util.Objects;

public class Product {
    private String name;
    private Price price;

    Product(String name, Price price) {
        if (name == null) throw  new NullPointerException();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

}


