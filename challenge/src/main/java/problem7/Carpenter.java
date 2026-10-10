package problem7;

public class Carpenter extends Person{
    Carpenter(String name){
        super(name);
    }
    public void display(){
        System.out.println("I am "+getName()+" the Carpenter");
    }
}
