package RapidoTraining;
import java.util.Scanner;
public class ConversionDevice {
    static final double FEET_TO_INCH_MULTIPLIER = 12 ;
    static final double FEET_TO_YARD_MULTIPLIER = 1.0/3 ;
    static final double YARD_TO_FEET_MULTIPLIER = 3 ;

    static double Convert(double inputValue, double multiplier)
    {
        return inputValue * multiplier ;
    }

    public static void main(String []  agrs)
    {
        Scanner sc = new Scanner(System.in) ;

        int inputValue = 1 ;

        while(inputValue!=4){  // this loop will terminate once the user enters 4 as input

            System.out.println("\nCHOOSE CONVERSION SYSTEM : ");
            System.out.println("1.FEET TO INCH\t 2.FEET TO YARD\t 3.YARD TO FEET\t 4.EXIT");
            inputValue = sc.nextInt() ;
            switch(inputValue){
                case 1:
                {
                    System.out.print("Enter Feet : ");
                    double feetInput = sc.nextFloat() ;
                    System.out.println(feetInput + " feet = " + Convert(feetInput, FEET_TO_INCH_MULTIPLIER) + " inch" );
                    break ;
                }

                case 2:{
                    System.out.print("Enter Feet : ");
                    double feetInput = sc.nextFloat() ;
                    System.out.println(feetInput + " feet = " + Convert(feetInput, FEET_TO_YARD_MULTIPLIER) + " yard" );
                    break ;
                }

                case 3:{
                    System.out.print("Enter Yard : ");
                    double yardInput = sc.nextFloat() ;
                    System.out.println(yardInput + " Yard = " + Convert(yardInput, YARD_TO_FEET_MULTIPLIER) + " feet" );
                    break ;
                }

                default: {
                    break;
                }

            }
        }
    }
}
