package controlselection.accents;

import java.util.Arrays;
import java.util.List;

public class WithoutAccents {

    private final List<String> LETTERS = Arrays.asList("a-á", "e-é", "i-í", "o-ó", "o-ö", "o-ő", "u-ú", "u-ü", "u-ű");

    public char convertToCharWithoutAccents(char parameter) {
        for(String charPair : LETTERS) {
            if(Character.isUpperCase(parameter)) {
                parameter = charPair.toUpperCase().charAt(0);
            }
            else if(charPair.charAt(2) == parameter) {
                parameter = charPair.charAt(0);
            }
        }
        return parameter;
    }
}
