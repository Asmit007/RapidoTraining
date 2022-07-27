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
    public void shouldReturnFizzForInput3()
    {
        int input = 3 ;
        String expectedOutput = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals(expectedOutput, "Fizz");
    }

    @Test
    public void shouldReturnBuzzForInput5()
    {
        int input = 5 ;
        String expectedOutput = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals(expectedOutput, "Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzForInput15()
    {
        int input = 15 ;
        String expectedOutput = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals(expectedOutput, "FizzBuzz");
    }

    @Test
    public void shouldReturnEmpytStringForInput4()
    {
        int input = 4 ;
        String expectedOutput = fizzBuzz.fizzBuzzAnswer(input) ;

        assertEquals(expectedOutput, "Not a FizzBuzz");
    }

}
