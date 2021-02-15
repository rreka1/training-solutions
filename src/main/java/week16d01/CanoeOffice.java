package week16d01;

import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {

    //Írj egy CanoeOffice osztályt, mely tárolja, hogy milyen kölcsönzések történtek (List<CanoeRental>).
    //A következő metódusokat implementáld:
    //* createRental(CanoeRental) - létrehoz egy kölcsönzést
    //* findRentalByName(String name) - megkeres egy AKTÍV kölcsönzést név alapján
    //* closeRentalByName(String name, LocalDateTime endTime) - megkeres egy AKTÍV kölcsönzést név alapján, beállítja az endTime értékét
    //* double getRentalPriceByName(String name, LocalDateTime endTime) - kikeresi az AKTÍV kölcsönzést név alapján, és kiszámolja, hogy
    //a megadott kölcsönzés mennyibe kerülne. A számolás úgy történik, hogy 5000 Ft-ot a szín alapján megszoroz egy értékkel, piros,
    //zöld és kék esetén rendre 1, 1,2 és 1,5 értékkel.
    //* List<CanoeRental> listClosedRentals() - Add vissza a lezárt kölcsönzéseket a startTime alapján sorbarendezve!
    //* Map<CanoeType, Integer> countRentals() - Számold meg, hány kölcsönzés volt színenként! (edited)

    private List<CanoeRental> rentals = new ArrayList<>();
    private static final double BASE_HOURPRICE = 5000.0;

    public void createRental(CanoeRental canoeRental) {
        //létrehoz egy kölcsönzést
        rentals.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name) {
        //megkeres egy AKTÍV kölcsönzést név alapján
        for (CanoeRental rental : rentals) {
            if (rental.getName().equals(name)) {
                if (rental.getEndTime() == null) { //aktív, mert endtime még nincs beállítva
                    return rental;
                }
            }
        }
        throw new IllegalArgumentException("Rental by name " + name + " not found, or not active!");
    }

    public CanoeRental closeRentalByName(String name, LocalDateTime endTime) {
        //megkeres egy AKTÍV kölcsönzést név alapján, beállítja az endTime értékét
        CanoeRental rental = findRentalByName(name);
        rental.setEndTime(endTime);
        return rental;
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime) {
        //kikeresi az AKTÍV kölcsönzést név alapján, és kiszámolja, hogy a megadott kölcsönzés mennyibe kerülne.
        // A számolás úgy történik, hogy 5000 Ft-ot a szín alapján megszoroz egy értékkel,
        // piros, zöld és kék esetén rendre 1, 1,2 és 1,5 értékkel.
        CanoeRental rental = closeRentalByName(name, endTime);
        double multiplierByColor = rental.getCanoeType().getMultiplier();
        double price = BASE_HOURPRICE * multiplierByColor * rental.calculateRentalSum();
        return price;
    }

    public List<CanoeRental> listClosedRentals() {
        //Add vissza a lezárt kölcsönzéseket a startTime alapján sorbarendezve!
        List<CanoeRental> closedRentals = new ArrayList<>();
        for (CanoeRental rental : rentals) {
            if (rental.getEndTime() != null) { //lezárt, mert az endtime már be van állítva
                closedRentals.add(rental);
            }
        }
        Collections.sort(closedRentals);
        return closedRentals;
    }

    public Map<CanoeType, Integer> countRentals() {
        //Számold meg, hány kölcsönzés volt színenként!
        Map<CanoeType, Integer> rentalsMap = new HashMap<>();
        for (CanoeRental rental : rentals) {
            if (!rentalsMap.containsKey(rental.getCanoeType())) {
                rentalsMap.put(rental.getCanoeType(), 1);
            } else {
                rentalsMap.put(rental.getCanoeType(), rentalsMap.get(rental.getCanoeType()) + 1);
            }
        }
        return rentalsMap;
    }

    public List<CanoeRental> getRentals() {
        return new ArrayList<>(rentals);
    }
}
