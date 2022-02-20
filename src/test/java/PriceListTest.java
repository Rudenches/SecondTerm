import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    @Test
    void main() {
    }

    @Test
    void add() {
        PriceList pricelist = new PriceList();
        pricelist.add(1,"Молоко", 10.5);

        assertEquals(10.5, pricelist.getPrice(1));
    }

    @Test
    void priceReplace() {
        PriceList pricelist = new PriceList();
        pricelist.add(1 , "Молоко", 56.0);
        pricelist.priceReplace(1,  50.0);

        assertEquals(50.0,pricelist.getPrice(1));
    }

    @Test
    void nameReplace() {
        PriceList pricelist = new PriceList();
        pricelist.add(1,"Молоко", 56.0);
        pricelist.nameReplace(1, "Яблоко");
        assertEquals("Яблоко",pricelist.getName(1));
    }

    @Test
    void delete() {
        PriceList pricelist = new PriceList();
        pricelist.add(1,"Молоко", 56.0);
        pricelist.add(2,"Хлеб", 10.0);
        pricelist.delete(1);
        assertTrue(!pricelist.productPrices.containsKey(1));
    }

    @Test
    void goodsCost() {
        PriceList pricelist = new PriceList();
        pricelist.add(1,"Хлеб", 20.0);
        pricelist.goodsCost(1,5);
        assertEquals(100.0, pricelist.goodsCost(1,5));
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }
}