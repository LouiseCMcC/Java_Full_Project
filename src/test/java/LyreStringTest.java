import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LyreStringTest {

    LyreString lyreString;

    @Before
    public void before(){
        lyreString=new LyreString("large", 50, 100);
    }

    @Test
    public void lyreStringHasDescription(){
        assertEquals("large", lyreString.getDescription());
    }

    @Test
    public void canTestPlayLyreString(){
        assertEquals("test play", lyreString.playInstrument());
    }
}