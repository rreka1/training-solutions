package week16d01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RentalMain {

    public static void main(String[] args) {
        CanoeOffice canoeOffice = new CanoeOffice();

        //new rentals (active)
        System.out.println("NEW (ACTIVE) RENTALS:");
        canoeOffice.createRental(new CanoeRental("Jack Doe", CanoeType.BLUE, "2021-02-15T15:00"));
        canoeOffice.createRental(new CanoeRental("John Doe", CanoeType.RED, "2021-02-15T14:00"));
        canoeOffice.createRental(new CanoeRental("Jane Doe", CanoeType.RED, "2021-02-15T11:00"));
        System.out.println(canoeOffice.getRentals());

        //Rental 1.
        System.out.println("RENTAL_1:");
        CanoeRental rental1 = canoeOffice.findRentalByName("John Doe");
        double rental1_price = canoeOffice.getRentalPriceByName("John Doe",
                LocalDateTime.of(LocalDate.of(2021, 02, 15), LocalTime.of(14, 30)));
        System.out.println(rental1);
        System.out.println(rental1_price);
        System.out.println(rental1.calculateRentalSum());

        //Rental 2.
        System.out.println("RENTAL_2:");
        CanoeRental rental2 = canoeOffice.findRentalByName("Jack Doe");
        double rental2_price = canoeOffice.getRentalPriceByName("Jack Doe",
                LocalDateTime.of(LocalDate.of(2021, 02, 15), LocalTime.of(17, 30)));
        System.out.println(rental2);
        System.out.println(rental2_price);
        System.out.println(rental2.calculateRentalSum());

        //Rental 3.
        System.out.println("RENTAL_3:");
        CanoeRental rental3 = canoeOffice.findRentalByName("Jane Doe");
        double rental3_price = canoeOffice.getRentalPriceByName("Jane Doe",
                LocalDateTime.of(LocalDate.of(2021, 02, 15), LocalTime.of(20, 30)));
        System.out.println(rental3);
        System.out.println(rental3_price);
        System.out.println(rental3.calculateRentalSum());

        //closed rentals
        System.out.println("CLOSED RENTALS:");
        System.out.println(canoeOffice.listClosedRentals());

        //MAP
        System.out.println("COUNT: ");
        System.out.println(canoeOffice.countRentals());
    }
}
