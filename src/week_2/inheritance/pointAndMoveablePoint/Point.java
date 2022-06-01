package week_2.inheritance.pointAndMoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(){}
    public Point(float x, float y){
        this.x =x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
     return new float[2];
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);
    }
}
