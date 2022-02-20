import java.util.HashMap;
import java.util.Map;


public class PriceList {
        Map<Integer, Product> productPrices = new HashMap<>();
        public void add(int id,String name, Double price) {
            productPrices.put(id, new Product(name,price));

        }
            public Double getPrice(int id) {
                return (productPrices.get(id)).getPrice();
            }
            public String getName(int id) {
            return (productPrices.get(id)).getName();
            }

        public void priceReplace(int id, Double price) {

            (productPrices.get(id)).setPrice(price);
        }
        public void nameReplace (int id, String name) {
            (productPrices.get(id)).setName(name);
        }

        public void delete(int id) {
            productPrices.remove(id);

        }

        public Double goodsCost (int id, int quanity) {
            String tmp = (productPrices.get(id).getPrice()).toString();
         Double costs = Double.parseDouble(tmp);
         return costs*quanity;

        }
    }


