package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String str) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(str);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException("Invalid string", exception);
        }
    }

    public int answerTruePercent(String answers) {
        int sum = 0;
        double percent = 0;
        boolean[] answersArray = convert(answers);
        for (int i = 0; i < answersArray.length; i++) {
            if (answersArray[i] == true) {
                sum++;
            }
        }
        percent = Math.round((double) sum / answersArray.length * 100);
        return (int) percent;
    }
}
