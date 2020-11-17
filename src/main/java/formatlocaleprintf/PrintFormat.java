package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {

    //...
    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j) {
        try {
            return String.format(formatString, i, j);
        }
        catch(Exception ex) {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }
    }

    public String printFormattedText(Double number) {
        String format = "Total is: %,.2f Ft";
        return String.format(format, number);
    }

    public String printFormattedText(int counter, String fruit) {
        String format = "We counted %d %s in the basket";
        return String.format(format, counter, fruit);
    }

    public String printFormattedText(int number) {
        String format = "Right edge of numbers set at 4 spaces from text:%4d";
        return String.format(format, number);
    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        String format = "Multiple objects containing text:%d\t%d\t%d";
        return String.format(format, i, j, k);
    }
}
