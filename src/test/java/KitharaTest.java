import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KitharaTest {
    Kithara kithara;

    @Before
    public void before(){
        kithara=new Kithara("Apollo's Kithara", 1000.00, 2000.00, "gold", "string", "gold");
    }

    @Test
    public void kitharaHasName(){
        assertEquals("Apollo's Kithara", kithara.getName());
    }

    @Test
    public void kitharaCanPlay(){
        assertEquals("strum, strum, strum", kithara.playInstrument());
    }

    @Test
    public void canGetKitharaMarkup(){
        assertEquals(1000.00, kithara.calculateMarkup(), 0.0);
    }

}
