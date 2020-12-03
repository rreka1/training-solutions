package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode countryCode;

    public SimpleDateFormatter() {
        countryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        int year = simpleDate.getYear();
        int month = simpleDate.getMonth();
        int day = simpleDate.getDay();
        return year + "-" + month + "-" + day;
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        int year = simpleDate.getYear();
        int month = simpleDate.getMonth();
        int day = simpleDate.getDay();
        if (countryCode == CountryCode.EN) {
            return day + "-" + month + "-" + year;
        }
        if (countryCode == CountryCode.US) {
            return month + "-" + day + "-" + year;
        } else {
            return formatDateString(simpleDate);
        }
    }
}
