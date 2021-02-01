package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {
        ifEmptyOrNullThrowException(str);
        ifInvalidStringThrowException(str);
        boolean[] booleanArray = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                booleanArray[i] = false;
            } else {
                booleanArray[i] = true;
            }
        }
        return booleanArray;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans.length == 0) {
            throw new IllegalArgumentException("Array of booleans is empty");
        }
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i] == false) {
                binaryString.append('0');
            } else {
                binaryString.append('1');
            }
        }
        return binaryString.toString();
    }

    private void ifEmptyOrNullThrowException(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            throw new NullPointerException("binaryString null");
        }
    }

    private void ifInvalidStringThrowException(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {
                throw new IllegalArgumentException("binaryString not valid");
            }
        }
    }
}
