import java.util.Collection;
import java.util.List;

public class UseFans {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private int radius;
    private String color;

    
    public UseFans() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

   
    public UseFans(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public String toString() {
        if (on) {
            return "Fan on with speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            return "Fan off, color: " + this.color + ", radius: " + this.radius;
        }
    }

    public static void displayFans(Collection<UseFans> fans) {
        for (UseFans fan : fans) {
            System.out.println(fan);
        }
    }

    public static void main(String[] args) {
        Collection<UseFans> fans = List.of(
            new UseFans(SLOW, true, 15, "red"),
            new UseFans(STOPPED, false, 2, "yellow"),
            new UseFans(FAST, true, 32, "purple")
        );

        displayFans(fans);
    }
}