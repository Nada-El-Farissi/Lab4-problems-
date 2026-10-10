package problem7;

public class Plumber extends Person {
    Plumber(String name){
        super(name);
    }
    public void display(){
        System.out.println("I am "+getName()+" the Plumber");
    }
}
