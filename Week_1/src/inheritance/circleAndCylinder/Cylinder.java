package inheritance.circleAndCylinder;

import inheritance.geometric.Main;

public class Cylinder extends Circle {
        private  double height;
        public Cylinder(){
        }
        public Cylinder( double height,double radius, String color){
            super(radius, color);
            this.height = height;
        }
        public double getVolume(){
                return  Math.pow(getRadius(),2)*Math.PI * height;
        }

        @Override
        public String toString() {
                return "Cylinder{" +
                        "height=" + height +
                        "radius" + getRadius() +
                        "color" + getColor() +
                        super.toString()+
                        '}';
        }

        public static void main(String[] args) {
                Cylinder cylinder = new Cylinder(4,3.5,"blue");
                System.out.println(cylinder);

        }
}
