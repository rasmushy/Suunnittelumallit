import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            tick();
            if (second == 10) {
                running = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        setChanged();
        notifyObservers(this);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

