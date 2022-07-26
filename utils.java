package RapidoTraining;
public class utils {
    public static float yardToFeet(float yards)
    {
        return yards * Constants.YARD_TO_FEET_MULTIPLIER;
    }

    public static float feetToYard(float feet)
    {
        return feet * Constants.FEET_TO_YARD_MULTIPLIER ;
    }

    public static float inchToFeet(float inch)
    {
        return inch * Constants.INCH_TO_FEET_MULTIPLIER ;
    }

    public static float feetToInch(float feet)
    {
        return feet * Constants.FEET_TO_INCH_MULTIPLIER ;
    }

    public static float inchToYard(float inch)
    {
        return feetToYard( inchToFeet(inch) ) ;
    }

}
