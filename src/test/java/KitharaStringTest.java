import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KitharaStringTest {

    KitharaString kitharaString;

    @Before
    public void before(){
        kitharaString=new KitharaString("large", 50, 100);
    }

    @Test
    public void kitharaStringHasDescription(){
        assertEquals("large", kitharaString.getDescription());
    }

    @Test
    public void canTestPlayKitharaString(){
        assertEquals("test play", kitharaString.playInstrument());
    }
}
