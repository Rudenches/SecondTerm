import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    @Test
    void main() {
    }
    @Test
    void getIdTest() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "10.54");
        assertThrows(IllegalArgumentException.class,  () -> {pricelist.getId("Чай");});
    }
    @Test
    void addTest() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "10.54");
        assertEquals("10.54", pricelist.getProduct(pricelist.getId("Молоко")).getPrice());
    }
    @Test
    void priceReplaceTest() {
        PriceList pricelist = new PriceList();
        pricelist.add( "Молоко", "56.0");
        pricelist.priceReplace(pricelist.getId("Молоко"),  "50.00");
        assertEquals("50.00",pricelist.getPrice(pricelist.getId("Молоко")));
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getPrice(pricelist.getId("Яблоко"));});
    }
    @Test
    void nameReplaceTest() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "56.25");
        pricelist.nameReplace(pricelist.getId("Молоко"), "Яблоко");
        assertEquals("Яблоко",pricelist.getName(pricelist.getId("Яблоко")));
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getName(pricelist.getId("Чай"));});
    }
    @Test
    void deleteTest() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "56.15");
        pricelist.add("Хлеб", "10.20");
        pricelist.delete(pricelist.getId("Молоко"));
       assertThrows(IllegalArgumentException.class, () ->
            pricelist.getId("Молоко"));
        assertThrows(IllegalArgumentException.class,
                () -> {pricelist.productPrices.containsKey(pricelist.getId("Молоко"));});
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getId("Чай");});
    }
    @Test
    void goodsCostTest() {
        PriceList pricelist = new PriceList();
        pricelist.add("Хлеб", "20.50");
        pricelist.goodsCost(pricelist.getId("Хлеб"),5);
        assertEquals(102.5, pricelist.goodsCost(pricelist.getId("Хлеб"),5));
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getId("Масло");});
    }
    @Test
    void getId() {
    }
    @Test
    void setId() {
    }
    @Test
    void getName() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "56.15");
        pricelist.getName(pricelist.getId("Молоко"));
        assertEquals("Молоко",pricelist.getName(pricelist.getId("Молоко")));
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getId("Хлеб");});
    }
    @Test
    void setName() {
    }
    @Test
    void getPrice() {
        PriceList pricelist = new PriceList();
        pricelist.add("Молоко", "56.74");
        pricelist.getPrice(pricelist.getId("Молоко"));
        assertEquals("56.74",pricelist.getPrice(pricelist.getId("Молоко")));
        assertThrows(IllegalArgumentException.class, () -> {pricelist.getId("Хлеб");});
    }
    @Test
    void setPrice() {
    }
}