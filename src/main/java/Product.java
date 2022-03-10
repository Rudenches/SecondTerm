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

// class Price {
//    private Integer rubles;
//    private Integer penny;
//
////    Price(Integer rubles, Integer penny) {
////        this.rubles = moneyToPrice(rubles,penny);
////        this.penny = penny;
////    }
//
//    private Double moneyToPrice(Integer rubles, Integer penny) {
//        int tmp = (rubles * 100 + penny);
//        double price = (double) tmp / 100;
//        return price;
//    }
//
//     public Integer getRubles() {
//         return rubles;
//     }
//
//     public void setRubles(Integer rubles) {
//         this.rubles = rubles;
//     }
//
//     public Integer getPenny() {
//         return penny;
//     }
//
//     public void setPenny(Integer penny) {
//         this.penny = penny;
//     }
// }
