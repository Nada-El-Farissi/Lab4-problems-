package student;

public class Test {
    public static void main(String[] args) {
        Major m1=new Major("20", "Arts");
        Major m2=new Major("19", "Philosophy");
        Major m3=new Major("15", "Mathematics");
        Student s1=new Student( "Lola",  "Chu",  "2126382736",  "lolaChu@gmail.com",  "2639619", m1);
        Student s2=new Student( "mila",  "lu",  "2126383436",  "milalu@gmail.com",  "3456789", m2);
        //default major computer science
        Student s3=new Student("SAFI","amal","212666936355","safiamal@gmail.com","22885676");
        Student s4=new Student("ALAMI","Samir","212666936355","safiamal@gmail.com","23585976");
        // Display computer science students
        System.out.println("Computer Science students:");
        System.out.println(s3.getFullNameFormatted());
        System.out.println(s4.getFullNameFormatted());
        // Test getStudentListAsString()
        System.out.println("Arts students:");
        System.out.println(m1.getStudentListAsString());
        // Test findStudentByCNE()
        System.out.println(m1.findStudentByCne("2639619"));
        // Test getStudentCount()
        System.out.println("Arts student count: " + m1.getStudentCount());
        // Test getOccupancyRate()
        m1.getOccupancyRate();
        // Test removeStudent()
        System.out.println("Removing Lola: " + m1.removeStudent("2639619"));
        // Verify removal
        System.out.println("Updated student count: " + m1.getStudentCount());
        System.out.println(m1.getStudentListAsString());
        // Test unsuccessful search
        System.out.println(m1.findStudentByCne("9999999"));





    }
}

