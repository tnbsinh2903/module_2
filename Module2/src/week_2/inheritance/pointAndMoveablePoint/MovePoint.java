package week_2.inheritance.pointAndMoveablePoint;

public class MovePoint extends Point{
    private float XSpeed = 0.0f;
    private float YSpeed = 0.0f;
    public  MovePoint(){
    }
    public MovePoint(float XSpeed, float YSpeed){
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public MovePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }
    public float getXSpeed(){
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{XSpeed,YSpeed};
    }
    public MovePoint move(){
        setX(getX()+ XSpeed);
        setY(getY()+ YSpeed);
        return this;
    }

    @Override
    public String toString() {
        return  "x =" + super.getX() +
                "y = " + super.getY() +
                ", MovablePoint is:"+
                "XSpeed=" + XSpeed +
                ", YSpeed=" + YSpeed +
                '}';
    }

    public static void main(String[] args) {
        MovePoint movePoint = new MovePoint(3,3,5,6);
        System.out.println(movePoint);
    }
}
