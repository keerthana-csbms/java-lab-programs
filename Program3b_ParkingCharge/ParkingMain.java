//KEERTHANA G,1WN25CS108, LAB PROGRAM-3b
interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    TwoWheeler(String num, String type, int hours) {
        super(num, type, hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20.0;
        else
            return 2 * 20.0 + (parkingHours - 2) * 10.0;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + vehicleType +
                ", Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    FourWheeler(String num, String type, int hours) {
        super(num, type, hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50.0;
        else
            return 2 * 50.0 + (parkingHours - 2) * 30.0;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + vehicleType +
                ", Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

public class ParkingMain {
    public static void main(String[] args) {
        System.out.println("KEERTHANA G,1WN25CS108, LAB PROGRAM-3b");
        ParkingCharge p1 = new TwoWheeler("KA01AB1234", "Two Wheeler", 5);
        ParkingCharge p2 = new FourWheeler("KA02CD5678", "Four Wheeler", 4);

        p1.displayParkingDetails();
        System.out.println();
        p2.displayParkingDetails();
    }
}