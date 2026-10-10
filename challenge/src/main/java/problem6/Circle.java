package problem6;

public class Circle extends Forme{
    private double radius;
    Circle(double r){
        radius=r;
    }
    public double getSurface(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "Circle (radius "+radius+" cm)";
    }
}
