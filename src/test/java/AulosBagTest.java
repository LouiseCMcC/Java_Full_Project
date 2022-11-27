import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AulosBagTest {

    AulosBag aulosBag;

    @Before
    public void before(){
        aulosBag=new AulosBag("large", 50, 100, "checked");
    }

    @Test
    public void aulosBagHasDescription(){
        assertEquals("large", aulosBag.getDescription());
    }

    @Test
    public void canTestPlayAulosBag(){
        assertEquals("test play", aulosBag.playInstrument());
    }
}
