package lab8;

public class Task5 {
    static class Device {
        public void turnOn() {
            System.out.println("Device is turning on...");
        }
    }

    static class Phone extends Device {
        public void makeCall() {
            System.out.println("Making a phone call...");
        }
    }

    static class Tablet extends Device {
        public void watchVideo() {
            System.out.println("Watching a video...");
        }
    }

    static class SmartPhone extends Phone {
        @Override
        public void turnOn() {
            super.turnOn();
            System.out.println("SmartPhone is ready.");
        }

        public void browseInternet() {
            System.out.println("Browsing the internet...");
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.turnOn();
        phone.makeCall();

        Tablet tablet = new Tablet();
        tablet.turnOn();
        tablet.watchVideo();

        SmartPhone smartphone = new SmartPhone();
        smartphone.turnOn();
        smartphone.makeCall();
        smartphone.browseInternet();
    }
}
