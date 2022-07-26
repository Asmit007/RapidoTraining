package RapidoTraining;
import java.util.Scanner;
public class ConversionDevice {
    public static void main(String []  agrs)
    {
        Scanner sc = new Scanner(System.in) ;

        int inputValue = 1 ;

        while(inputValue!=4){  // this loop will terminate once the user enters 4 as input

            System.out.println("\nCHOOSE CONVERSION SYSTEM : ");
            System.out.println("1.FEET TO INCH\t 2.YARD TO FEET\t  3.INCH TO YARD\t 4.EXIT");
            inputValue = sc.nextInt() ;

            switch(inputValue){
                case 1:
                {
                    System.out.print("Enter Feet : ");
                    float feetInput = sc.nextFloat() ;
                    float feetToInch = utils.feetToInch(feetInput) ;
                    System.out.println(feetInput + " feet = " +  feetToInch + " inch" );
                    break ;
                }

                case 2:{
                    System.out.print("Enter Yard : ");
                    float yardInput = sc.nextFloat() ;
                    float YardToFeet = utils.yardToFeet(yardInput) ;
                    System.out.println(yardInput + " feet = " + YardToFeet + " yard" );
                    break ;
                }

                case 3:{
                    System.out.print("Enter Inches : ");
                    float inchInput = sc.nextFloat() ;
                    float inchToYard = utils.inchToYard(inchInput) ;
                    System.out.println(inchInput + " feet = " + inchToYard + " yard" );
                    break ;
                }

                default: {
                    break;
                }

            }
        }
    }
}
