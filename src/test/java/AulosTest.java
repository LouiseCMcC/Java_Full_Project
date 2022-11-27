import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AulosTest {
    Aulos aulos;




    @Before
    public void before(){
        aulos=new Aulos("Bacchic Aulos", 1000.00, 2000.00, "silver", "woodwind", "Marsyas");
    }

    @Test
    public void aulosHasName(){
        assertEquals("Bacchic Aulos", aulos.getName());
    }

    @Test
    public void aulosCanPlay(){
        assertEquals("blow, blow, blow", aulos.playInstrument());
    }

}