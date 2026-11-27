//KEERTHANA G,1WN25CS108, LAB PROGRAM-3a

abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceId + ", Source Name: " + sourceName +
                ", Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000.0) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000.0) * 100;
    }
}

public class EnergyMain {
    public static void main(String[] args) {
        System.out.println("//KEERTHANA G,1WN25CS108,Lab Pgm-3a");
        EnergySource e1 = new SolarEnergy(1, "Solar Plant A", 3500);
        EnergySource e2 = new WindEnergy(2, "Wind Farm B", 6000);

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}