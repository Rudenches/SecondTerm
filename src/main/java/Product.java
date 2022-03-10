public class Product {
    private String name;
    private  String price;
    Product(String name, String price) {
            this.name = name;
            this.price = strCorrect(price);
    }

    public String strCorrect(String price) {
        String [] newPrice = price.split("\\.");
        if (price.contains("-")) throw  new IllegalArgumentException();
        if (newPrice[1].length() > 2) {
            throw new IllegalArgumentException();
        }
        if (newPrice[1].length() < 2) {
            price += "0";
        }
        if (newPrice.length < 2) {
            price +=".00";
        }
        return price;
    }
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = strCorrect(price);
    }
}


