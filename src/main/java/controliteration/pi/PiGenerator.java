package controliteration.pi;

public class PiGenerator {

    private String vers = "Nem a régi s durva közelítés, mi szótól szóig így kijön betűiket számlálva. Ludolph eredménye már, ha itt végezzük húsz jegyen. De rendre kijő még tíz pontosan, azt is bízvást ígérhetem.";

    public String getPi() {
        String pi = "";
        int counter = 0;
        for(int i = 0; i < vers.length(); i++) {
            while(Character.isLetter(vers.charAt(i))) {
                counter++;
                i++;
            }
            if(counter != 0) {
                pi = pi + counter;
                if(i == 3) {
                    pi = pi + ".";
                }
            }
            counter = 0;
        }
        return pi;
    }
}
