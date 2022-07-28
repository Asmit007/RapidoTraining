import java.util.InputMismatchException;
import java.util.Scanner;
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

        if(answer.isEmpty()) return "________";

        return answer ;
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in) ;

        int choice = 1;

        do{
            System.out.println("\n1. Try FizzBuzz ");
            System.out.println("2. Exit ");
            System.out.print("\nEnter your choice :");

            try {
                choice = scanner.nextInt() ;

                switch (choice) {
                    case 1: {
                        System.out.print("\nEnter any number : ");
                        try {
                            int input = scanner.nextInt();
                            String answer = fizzBuzzAnswer(input);
                            System.out.println("Answer for input " + input + " = " + answer);
                        } catch (InputMismatchException e) {

                            System.out.println("Wrong Input! Integer was expected !!");
                        }
                        break;
                    }
                    case 2: {
                        System.exit(0);
                    }

                    default: {
                        System.out.println("\nInvalid choice " + choice + ", choices available are : 1 or 2");
                        break;
                    }
                }
            }
            catch(InputMismatchException e){
                    System.out.println("Wrong Input! Integer was expected !!" );
            }
            finally{
                scanner.nextLine();
                choice = 1;
            }

        }
        while(choice!=2) ;

    }

}
