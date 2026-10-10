package student;
//
public class Student extends Person {//student inherits from person
      private String cne;
      private Major major; //each student only has one major
      // the no-args constructor
      public Student(){
          major= new Major("23","Computer Science"); //default major
      };
   public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom,prenom,telephone,email);
        this.cne=cne;
        this.major=major;
        major.addStudent(this);
   }
   public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,new Major("23","Computer Science"));
       this.major.addStudent(this);}
//
//    // Getters
     public String getCne(){
       return cne;
     }
     public Major getMajor(){
       return major;
     }
     //it inherits the other getters from the parent class Person
//
//    // Setters
    public void setCne(String cne){
       this.cne=cne;
    }
    public void setMajor(Major m){
       major=m;
    }
    //toString method
    public String toString(){
        return (id+".  "+cne+" "+firstName+" "+secondName);
    }
    public String getFullNameFormatted(){
       return String.format("%s, %s",secondName.toUpperCase(),firstName);
    }



}
//
