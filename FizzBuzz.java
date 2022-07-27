
public class FizzBuzz {

    public static String fizzBuzzAnswer(int integerInput)
    {
        String answer = "" ;

        if(integerInput % 3 == 0 ) {
          answer +=  "Fizz" ;
        }

        if(integerInput % 5 == 0){
            answer += "Buzz" ;
        }

        return answer ;
    }

}
