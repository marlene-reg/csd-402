public class Fan {
  public static final int STOPPED = 0;
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3; 

  private int speed;
  private boolean on;
  private int radius;
  private String color;

  public Fan() {
      speed = STOPPED;
      on = false;
      radius = 6;
      color = "white";
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
        return "Fan on with speed: " + speed + ", color: " + color + ", and radius: " + radius;
     }
     	else {
	   return "Fan off, color: " + color + ", radius: " + radius;
        }
  }
  


  public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(SLOW);
        fan.setOn(true);
        fan.setRadius(4);
        fan.setColor("red");

        System.out.println(fan.toString());
    }
}