package week_1.opp.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public Fan(){}

    @Override
    public String toString() {
        if(this.on){
            return "Fan is on: { speed: " + speed + ", color: " + color + ", radius: " + radius + " }"; }
        else {
            return "Fan is off: { speed: " + speed + ", color: " + color + ", radius: " + radius + " }";
        }
    }

    public static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
