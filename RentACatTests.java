import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;

public class RentACatTests{
    RentACat rac;


    @Before
    public void setup(){
        rac = new RentACat();
        rac._cats.add(new Cat(1, "Cat1"));
        rac._cats.add(new Cat(2, "Sleepy Gary"));
        rac._cats.add(new Cat(3, "jo"));
    }


    // Test to make sure that rentCat() method returns false
    // for unavailable cats
    // uses a mock cat that is already rented
    @Test
    public void rentUnavailableCat(){
        //mock a cat
        Cat mockCat = Mockito.mock(Cat.class);

        //mockCat.when(mockCat.getRented()).thenReturn(false);
        assertTrue(rac.rentCat(mockCat));
    }





    @Test
    public void testCatExists(){
        assertTrue(rac.catExists(2, rac._cats));
    }

    @Test
    public void testCatNotExists(){
        assertFalse(rac.catExists(100, rac._cats));
    }



    @Test
    public void tautology(){
        assertTrue(true);
    }
}
