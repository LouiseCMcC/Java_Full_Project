import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LyreTest {
    Lyre lyre;

    @Before
    public void before(){
        lyre=new Lyre("Golden Lyre of Ur", 1000.00, 2000.00, "wood", "string",7);
    }

    @Test
    public void lyreHasName(){
        assertEquals("Golden Lyre of Ur", lyre.getName());
    }

    @Test
    public void lyreCanPlay(){
        assertEquals("pluck, pluck, pluck", lyre.playInstrument());
    }

}
