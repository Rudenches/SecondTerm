public class Product {
    private String name;
    private  Double price;
    Product(String name, Double price) {
            this.name = name;
            this.price = price;
    }

//    public String strCorrect(String price) {
//        String [] newPrice = price.split("\\.");
//        if (price.contains("-")) throw  new IllegalArgumentException();
//        if (newPrice[1].length() > 2) {
//            throw new IllegalArgumentException();
//        }
//        if (newPrice[1].length() < 2) {
//            price += "0";
//        }
//        if (newPrice.length < 2) {
//            price +=".00";
//        }
//        return price;
//    }
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}


