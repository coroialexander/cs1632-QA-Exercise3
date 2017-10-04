import static org.junit.Assert.*;
import org.junit.*;
public class RentACatTests{
    RentACat rac;

    @Before
    public void setup(){
        rac = new RentACat();
    }

    @Test
    public void tautology(){
        assertTrue(true);
    }
}
