import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    private  final PriceList priceList = new PriceList();
    @BeforeEach
    public void setup () {
        priceList.add(1,"Молоко", 55.0);
        priceList.add(2,"Хлеб",25.5);
        priceList.add (3, "Шоколад", 125.54);
        priceList.add(4,"Торт",353.90);
        priceList.add(5,"Молоко",90.0);
        priceList.add(6,"Чай", -45.0);

    }
    @Test
    void main() {
    }
    @Test
    void getIdTest() {
        assertThrows(IllegalArgumentException.class,  () -> {priceList.getId("Кекс");});
    }
    @Test
    void addTest() {
        assertEquals(55.0, priceList.getPrice(1));

    }
    @Test
    void priceReplaceTest() {

        priceList.priceReplace(5,  110.0);
        assertEquals(110.00,priceList.getPrice(5));
        assertThrows(IllegalArgumentException.class, () -> priceList.priceReplace(7, 150.0));
    }
    @Test
    void nameReplaceTest() {
        priceList.nameReplace(1, "Яблоко");
        assertEquals("Яблоко",priceList.getName(1));
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
    void goodsCostTest() {
//        priceList.goodsCost(1,5);
        assertEquals(275.0, priceList.goodsCost(1,5));
        assertThrows(IllegalArgumentException.class, () -> priceList.goodsCost(7,5));
    }
    @Test
    void getId() {
    }
    @Test
    void setId() {
    }
    @Test
    void getName() {
        assertEquals("Хлеб",priceList.getName(2));
        assertThrows(IllegalArgumentException.class, () -> priceList.getName(0));
    }
    @Test
    void setName() {
    }
    @Test
    void getPrice() {
        assertEquals(90.0,priceList.getPrice(5));
        assertThrows(IllegalArgumentException.class, () -> priceList.getPrice(8));
        assertThrows(IllegalArgumentException.class, () -> priceList.getPrice(6));
//        assertThrows(IllegalArgumentException.class, () -> priceList.getPrice(null);
    }
    @Test
    void setPrice() {
    }
}