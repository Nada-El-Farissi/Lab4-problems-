package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;
    private Subject subject;
    //getter
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeNumber(String num){
        employeeNumber=num;
    }
    public String cleanEmployeeNumber(){
        String newEmployeeNum=employeeNumber.trim().replace(" ","");
        employeeNumber=newEmployeeNum;
        return employeeNumber;
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,secondName,firstName);
    }
    public String toCard(){
        StringBuilder sb=new StringBuilder("Instructor\n --------");
        sb.append("\n Employee #: ").append(employeeNumber);
        sb.append("\n Name: ").append(secondName).append(" , ")
        .append(firstName);
        sb.append("\n email: ").append(email);
        sb.append("\n phone: ").append(phone);
        return sb.toString();
    }
    public String displayName(){
        StringBuilder name=new StringBuilder();
        if (firstName==null){
            name.append(secondName);
        }
        else{
            name.append(firstName).append(" ").append(secondName);
        }
        return name.toString();
    }

}
