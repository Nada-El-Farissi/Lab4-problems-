package problem6;

public class Square extends Forme{
    private double side;
    Square(double c){
        side=c;
    }
    public double getSurface(){
        return side*side;
    }
    public String toString(){
        return "Square (side "+side+" cm)";
    }
}
