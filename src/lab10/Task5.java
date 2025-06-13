package lab10;

interface Washable {
    void wash();
}

interface Dryable {
    void dry();
}

abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}

class WasherDryer extends Appliance implements Washable, Dryable {

    public WasherDryer(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Пральна машина " + brand + " увімкнена");
    }

    @Override
    public void wash() {
        System.out.println("Прання запущено...");
    }

    @Override
    public void dry() {
        System.out.println("Сушіння запущено...");
    }
}

public class Task5 {
    public static void main(String[] args) {
        WasherDryer wd = new WasherDryer("Samsung");

        wd.turnOn();
        wd.wash();
        wd.dry();

        Appliance appliance = wd;
        Washable washable = wd;
        Dryable dryable = wd;

        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
