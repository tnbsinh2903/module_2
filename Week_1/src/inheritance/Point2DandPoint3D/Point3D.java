package inheritance.Point2DandPoint3D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
       super.getXY();
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr1 = new float[3];
        arr1[0]= getX();
        arr1[1]= getY();
        arr1[2]= z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D =new Point3D(2,3,4);
        System.out.println(point3D);
    }
}
