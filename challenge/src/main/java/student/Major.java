package student;
import java.util.Arrays;//need it to copy arrays faster+add space

public class Major {
       private static int nextId = 1;//belongs to the class itself
       private int id;
       private String code;
       private String name;
      private Student[] students=new Student[0]; //one major has many students
      private int studentCount;

      //the no -args constructor
      public Major(){}
      public Major(String code, String name) {
        nextId++;//increments each time an instance of the class is created
        id=nextId; //nextId keeps track of the Ids so that each major has a different Id
        this.code=code;
        this.name=name;
  }
         // Method to add a student
    public void addStudent(Student s) {
          if (studentCount<50){
              Student[] updatedStudents= Arrays.copyOf(students, students.length + 1);
              updatedStudents[updatedStudents.length-1] =s;
              students =updatedStudents;
              studentCount++;
          }
          else {
              System.out.println("Number of students per major exceeded");
          }


    }
//
//    //Getters
        public String getCode(){
              return code;
        }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
        public Student[] getStudents(){
            return students;
        }
        public int getStudentCount(){
            return studentCount;
        }


   //Display all students in the major
  public void displayStudents() {
      System.out.println("The list of students in the "+name+" major is:");
    for (int i=0;i<students.length;i++) {
        System.out.println(id+". "+code+" "+students[i].toString());
    }
  }
  //setters:
    public void setCode(String c){
          code=c;
    }
    public void setName(String n){
        name=n;
    }
    public Student findStudentByCne(String cne){
          for (Student s: students) {
              if (s!=null && s.getCne().equals(cne)){
                  return s;
              }
          }
          return null;
    }
    public boolean removeStudent(String cne){
          if (findStudentByCne(cne)==null){// if the student is not found
              return false;
          }
          int index=-1;
          for (int i=0;i<students.length;i++) {
              if (cne.equals(students[i].getCne())){
                  index=i;
                  break;
              }
          }
          for (int i=index;i<students.length-1;i++){
            students[i]=students[i+1];
          }
          students[students.length-1]=null;
          studentCount--;
          return true;
    }
    public void getOccupancyRate(){
          int c=0;
          for (Student s:students){
              if (s!=null){
                  c++;
              }
          }
          System.out.println("Occupancy rate= "+(double) c/50*100+"%");
    }
    public String getStudentListAsString() {
        StringBuilder output = new StringBuilder();
        for (Student s:students){
            if (s!=null) {
                output.append(s.getFirstName()).append(" ").append(s.getSecondName()).append(" \n");
            }
        }
        return output.toString();

    }

}
