package RapidoTraining;

import java.util.Scanner;

public class ConversionDevice {


    static int Convert(int value, int multiplier)
    {
        return value*multiplier ;
    }

    public static void main(String []  agrs)
    {

        System.out.println("Enter Feet :");
        Scanner sc = new Scanner(System.in) ;
        int feet = sc.nextInt() ;

        System.out.println("In INCH = " + Convert(feet,12) );
    }


}
