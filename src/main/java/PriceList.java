import java.util.HashMap;
import java.util.Map;


public class PriceList {
    Map<Integer, Product> productPrices = new HashMap<>();

    public void add(int id, Product product) {
        productPrices.put(id, product);
    }

    public Price getPrice(int id) {
        if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
        return (productPrices.get(id)).getPrice();
    }

    public String getName(int id) {
        if (!productPrices.containsKey(id))
            throw new IllegalArgumentException();
        return (productPrices.get(id)).getName();
    }

    public void priceReplace(int id, Price price) {
        if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
        (productPrices.get(id)).setPrice(price);
    }

    public void nameReplace(int id, String name) {
        if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
        (productPrices.get(id)).setName(name);
    }

    public void delete(int id) {
        if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
        productPrices.remove(id);
    }

    public Price goodsCost(int id, int quanity) {
        if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
        int Rub = productPrices.get(id).getPrice().getRub() * quanity +
                productPrices.get(id).getPrice().getKopek() * quanity / 100;
        int Kopek = productPrices.get(id).getPrice().getKopek() * quanity % 100;
        return new Price(Rub, Kopek);
    }
}


