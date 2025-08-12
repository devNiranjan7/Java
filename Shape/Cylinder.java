package Shape;

import java.lang.Math;

public class Cylinder extends threeDShape{
    protected double radius;
    protected  double height;

    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height=height;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}