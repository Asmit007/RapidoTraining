import org.junit.BeforeClass;
import org.junit.Test ;
import static org.junit.Assert.*;


public class TestFizzBuzz {

    private static FizzBuzz fizzBuzz ;

    @BeforeClass
    public static void beforeClass() throws Exception {
        fizzBuzz = new FizzBuzz() ;
    }

    @Test
    public void shouldReturnFizzForInputDivisibleOnlyBy3()
    {
        int input = 3 ;
        String actual = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals("Fizz",actual);
    }

    @Test
    public void shouldReturnBuzzForInputDivisibleOnlyBy5()
    {
        int input = 5 ;
        String actual = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals( "Buzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzForInputDivisibleByBoth3and5()
    {
        int input = 15 ;
        String actual = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void shouldReturnEmptyStringForAllOtherNumbers()
    {
        int input = 4 ;
        String actual = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals("________", actual);
    }


}
