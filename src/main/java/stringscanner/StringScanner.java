package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimeter) {
        for(int i = 0; i < intString.length(); i++) {
            if(Character.isLetter(intString.charAt(i))) {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        if((delimeter == null || delimeter.equals(" ")) && intString.contains(" ")) {
            delimeter = " ";
        }
        else if(delimeter == null) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(intString).useDelimiter(delimeter);
        int sum = 0;
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        for(int i = 0; i < intString.length(); i++) {
            if(Character.isLetter(intString.charAt(i))) {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        Scanner scanner = new Scanner(intString);
        int sum = 0;
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if(isEmpty(text) || isEmpty(word) || text.trim().equals("")) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(text);
        String filteredStr = "";
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains(word)) {
                filteredStr += line + '\n';
            }
        }
        return filteredStr.stripTrailing();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
