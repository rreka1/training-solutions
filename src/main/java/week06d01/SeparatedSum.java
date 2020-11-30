package week06d01;

public class SeparatedSum {

    /*public List<Double> sum(String s) {
        String[] separated = s.replace(",", ".").split(";");
        double sumOfPositive = 0.0;
        double sumOfNegative = 0.0;
        for (String num : separated) {
            double convertedNum = Double.parseDouble(num);
            if (convertedNum < 0) {
                sumOfNegative += convertedNum;
            }
            if (convertedNum >= 0) {
                sumOfPositive += convertedNum;
            }
        }
        return List.of(sumOfPositive, sumOfNegative);
    }*/

    public SumResult sum(String s) {
        String[] separated = s.replace(",", ".").split(";");
        double sumOfPositive = 0.0;
        double sumOfNegative = 0.0;
        for (String num : separated) {
            double convertedNum = Double.parseDouble(num);
            if (convertedNum < 0) {
                sumOfNegative += convertedNum;
            }
            if (convertedNum >= 0) {
                sumOfPositive += convertedNum;
            }
        }
        return new SumResult(sumOfNegative, sumOfPositive);
    }
}
