package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){};//the no-args constructor
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName=secondName;
        phone=telephone;
        this.email=email;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setFirstName(String n){
        firstName=n;
    }
    public void setSecondName(String n){
        secondName=n;
    }
    public void setPhone(String telephone){
        phone=telephone;
    }
    public void setEmail(String m){
        email=m;
    }


}

