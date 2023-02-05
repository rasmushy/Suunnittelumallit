public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer);
        timer.tick();
        boolean running = true;
        while (running) {
            if (timer.getSecond() == 10) {
                running = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.tick();
        }
    }
}