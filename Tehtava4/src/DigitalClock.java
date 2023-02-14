import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock() {
    }

    private void draw() {
        System.out.println("DigitalClock: " + timer.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        timer = (ClockTimer) o;
        draw();
    }
}
