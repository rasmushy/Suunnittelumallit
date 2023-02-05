public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        this.timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }
    }

    public void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("DigitalClock: " + hour + ":" + minute + ":" + second);
    }
}
