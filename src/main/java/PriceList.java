import java.util.HashMap;
import java.util.Map;




public class PriceList {
        Map<Integer, Product> productPrices = new HashMap<>();
        private int id = 0;
        public void add(String name, String price) {
            productPrices.put(id++, new Product(name,price));
        }

            public String getPrice(int id) {
            if (productPrices.containsKey(id))
                return (productPrices.get(id)).getPrice();
            throw new IllegalArgumentException();
            }

            public String getName(int id) {
            if (productPrices.containsKey(id))
            return (productPrices.get(id)).getName();
            throw new IllegalArgumentException();
            }

        public void priceReplace(int id, String price) {
            if (productPrices.containsKey(id))
            (productPrices.get(id)).setPrice(price);
            else throw new IllegalArgumentException();
        }

        public void nameReplace (int id, String name) {
            if (productPrices.containsKey(id))
            (productPrices.get(id)).setName(name);
            else throw  new IllegalArgumentException();
        }

        public void delete(int id) {
            if(!productPrices.containsKey(id)) throw new IllegalArgumentException();
            else productPrices.remove(id);
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

        public Double goodsCost (int id, int quanity) {
            if(productPrices.containsKey(id))
         return Double.parseDouble(productPrices.get(id).getPrice())*quanity;
            else throw new IllegalArgumentException();
        }
    }


