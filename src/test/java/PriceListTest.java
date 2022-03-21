import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    private final PriceList priceList = new PriceList();
    Price price1 = new Price(100, 50);
    Price price2 = new Price(25, 5);
    Price price3 = new Price(125, 54);
    Price price4 = new Price(350, 0);

    Product product1 = new Product("Молоко", price1);
    Product product2 = new Product("Хлеб", price2);
    Product product3 = new Product("Молоко", price3);
    Product product4 = new Product("Торт", price4);


    @BeforeEach
    public void setup() {
        priceList.add(1, product1);
        priceList.add(2, product2);
        priceList.add(3, product3);
        priceList.add(4, product4);

    }

    @Test
    void PriceAndProductTest() {
        assertThrows(IllegalArgumentException.class, () -> new Price(90, 456));
        assertThrows(IllegalArgumentException.class, () -> new Price(-90, 45));
        assertThrows(IllegalArgumentException.class, () -> new Price(90, -45));
        assertThrows(NullPointerException.class, () -> new Price(null, 5));
        assertThrows(NullPointerException.class, () -> new Price(5, null));
        assertThrows(NullPointerException.class, () -> new Product(null, price3));
    }

    @Test
    void main() {
    }

    @Test
    void addTest() {
        assertEquals(price1, priceList.getPrice(1));
        assertTrue(new Price(25, 5).equals(priceList.getPrice(2)));
    }

    @Test
    void priceReplaceTest() {
        priceList.priceReplace(1, price2);
        priceList.priceReplace(2, new Price(95, 5));
        assertEquals(price2, priceList.getPrice(1));
        assertTrue(new Price(95, 5).equals(priceList.getPrice(2)));
        assertThrows(IllegalArgumentException.class, () -> priceList.priceReplace(7, new Price(150, 0)));
    }

    @Test
    void nameReplaceTest() {
        priceList.nameReplace(1, "Яблоко");
        assertEquals("Яблоко", priceList.getName(1));
        assertThrows(IllegalArgumentException.class, () -> priceList.nameReplace(7, "Яблоко"));
    }

    @Test
    void deleteTest() {
        priceList.delete(3);
        assertThrows(IllegalArgumentException.class, () ->
                priceList.getName(3));
        assertThrows(IllegalArgumentException.class, () -> priceList.delete(7));
    }

    @Test
    public void goodsCostTest() {
        assertTrue(new Price(301, 50).equals(priceList.goodsCost(1, 3)));
        assertThrows(IllegalArgumentException.class, () -> priceList.goodsCost(7, 5));
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
        assertEquals("Хлеб", priceList.getName(2));
        assertThrows(IllegalArgumentException.class, () -> priceList.getName(0));
    }

    @Test
    void setName() {
    }

    @Test
    void getPrice() {
        assertEquals(price4, priceList.getPrice(4));
        assertTrue(new Price(100, 50).equals(priceList.getPrice(1)));
        assertThrows(IllegalArgumentException.class, () -> priceList.getPrice(8));
    }

    @Test
    void setPrice() {
    }
}