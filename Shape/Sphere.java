package Shape;

import java.lang.Math;

public class Sphere extends threeDShape{
    protected double radius;

    public Sphere(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }
}