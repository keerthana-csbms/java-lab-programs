//KEERTHANA G,1WN25CS108, LAB PROGRAM-5
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

class Reservation {
    boolean[] seats = new boolean[5];

    void reserveSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (seatNumber < 1 || seatNumber > 5) {
            throw new IllegalArgumentException("Invalid seat number: " + seatNumber);
        }
        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked.");
        }
        seats[seatNumber - 1] = true;
        System.out.println("Seat " + seatNumber + " reserved successfully.");
    }
}

public class RailwayMain {
    public static void main(String[] args) {
        System.out.println("//KEERTHANA G,1WN25CS108, LAB PROGRAM-5");
        Scanner sc = new Scanner(System.in);
        Reservation res = new Reservation();

        while (true) {
            System.out.print("\nEnter seat number to reserve (1-5) or 0 to exit: ");
            String input = sc.next();

            if (input.equals("0")) {
                System.out.println("Exiting reservation system.");
                break;
            }

            try {
                int seat = Integer.parseInt(input);
                res.reserveSeat(seat);
            } catch (SeatAlreadyBookedException e) {
                System.out.println("Exception: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Transaction completed.");
            }
        }
    }
}