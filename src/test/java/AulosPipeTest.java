import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AulosPipeTest {

    AulosPipe aulosPipe;

    @Before
    public void before(){
        aulosPipe=new AulosPipe("long pipe", 50, 100);
    }

    @Test
    public void aulosPipeHasDescription(){
        assertEquals("long pipe", aulosPipe.getDescription());
    }

    @Test
    public void canTestPlayAulosPipe(){
        assertEquals("test play", aulosPipe.playInstrument());
    }
}
