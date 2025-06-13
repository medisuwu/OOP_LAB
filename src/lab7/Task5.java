package lab7;

public class Task5 {
    static class Clock {
        private int hours;
        private int minutes;
        private int seconds;

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            if (hours >= 0 && hours < 24) {
                this.hours = hours;
            }
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            if (minutes >= 0 && minutes < 60) {
                this.minutes = minutes;
            }
        }

        public int getSeconds() {
            return seconds;
        }

        public void setSeconds(int seconds) {
            if (seconds >= 0 && seconds < 60) {
                this.seconds = seconds;
            }
        }

        public void displayTime() {
            System.out.printf("Час: %02d:%02d:%02d\n", hours, minutes, seconds);
        }

        public void tick() {
            seconds++;
            if (seconds >= 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes >= 60) {
                minutes = 0;
                hours++;
            }
            if (hours >= 24) {
                hours = 0;
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(23);
        clock.setMinutes(59);
        clock.setSeconds(58);
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();
    }
}
