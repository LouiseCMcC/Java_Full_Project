import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Lyre lyre;
    Stock stock;

    @Before
    public void before(){
        lyre=new Lyre("Golden Lyre of Ur", 1000.00, 2000.00, "wood", "string",7);
        stock=new Stock();
    }

    @Test
    public void canAddStock(){
        shop.addStock(stock);
        assertEquals(1, shop.checkStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(stock);
        shop.addStock(stock);
        assertEquals(1, shop.checkStock());
    }
}
