import java.util.HashMap;
import java.util.Map;




public class PriceList {
        Map<Integer, Product> productPrices = new HashMap<>();
//        private int id = 0;
        public void add(int id, String name, Double price) {
//          if (price < 0.0) throw new IllegalArgumentException();
            productPrices.put(id, new Product(name,price));
        }

            public double getPrice(int id) {
            if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
            if ((productPrices.get(id)).getPrice() == null ) throw new IllegalArgumentException();
            if(((productPrices.get(id)).getPrice() < 0.0)) throw new IllegalArgumentException();
                return (productPrices.get(id)).getPrice();
            }

            public String getName(int id) {
            if (productPrices.containsKey(id))
            return (productPrices.get(id)).getName();
            throw new IllegalArgumentException();
            }

        public void priceReplace(int id, double price) {
            if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
             (productPrices.get(id)).setPrice(price);

        }

        public void nameReplace (int id, String name) {
            if (!productPrices.containsKey(id)) throw  new IllegalArgumentException();
            (productPrices.get(id)).setName(name);

        }

        public void delete(int id) {
            if(!productPrices.containsKey(id)) throw new IllegalArgumentException();
             productPrices.remove(id);
        }

        public int getId(String name)  {
            for (Integer key : productPrices.keySet()) {
                if (name.equals(productPrices.get(key).getName())) {
                    return key;
                }
            }
            throw new IllegalArgumentException();
        }
        public Product getProduct(int id) {
            if (!productPrices.containsKey(id)) throw new IllegalArgumentException();
            return productPrices.get(id);
        }

        public double goodsCost (int id, int quanity) {
//            if(productPrices.containsKey(id))
//         return Double.parseDouble(productPrices.get(id).getPrice())*quanity;
//            else throw new IllegalArgumentException();

            if(!productPrices.containsKey(id)) throw new IllegalArgumentException();
                return productPrices.get(id).getPrice() * quanity;
        }
    }


