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


    // Test to make sure that returnCat() returns true
    // for a rented cat
    // use a doubled cat that is already rented
    @Test
    public void returnRentedCat(){
        //double a cat
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getRented()).thenReturn(true);

        assertTrue(rac.returnCat(mockCat));
    }

    // Test to make sure that returnCat() returns false
    // for an available cat
    // use a doubled cat that is not rented
    @Test
    public void returnAvailableCat(){
        //double a cat
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getRented()).thenReturn(false);

        assertFalse(rac.returnCat(mockCat));
    }

    // Test to make sure that rentCat() method returns false
    // for unavailable cats
    // uses a doubled cat that is already rented
    @Test
    public void rentUnavailableCat(){
        //double a cat
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getRented()).thenReturn(true);

        assertFalse(rac.rentCat(mockCat));
    }

    // Test to make sure that rentCat() method returns true
    // for available cats
    // uses a doubled cat that is not rented
    @Test
    public void rentAvailableCat(){
        //double a cat
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getRented()).thenReturn(false);

        assertTrue(rac.rentCat(mockCat));
    }


    // Test to make sure that a cat in ._cats returns true
    // for a cat with an ID of the passed ID in .catExists()
    @Test
    public void testCatExists(){
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getId()).thenReturn(10);

        rac._cats.add(mockCat);
        assertTrue(rac.catExists(10, rac._cats));
    }

    // Test to make sure that a cat in ._cats returns false
    // for no cats with an ID of the passed ID in .catsExists()
    @Test
    public void testCatNotExists(){
        Cat mockCat = Mockito.mock(Cat.class);
        Mockito.when(mockCat.getId()).thenReturn(99);

        rac._cats.add(mockCat);
        assertFalse(rac.catExists(100, rac._cats));
    }
}
