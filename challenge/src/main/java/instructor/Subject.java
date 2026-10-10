package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        StringBuilder newTitle=new StringBuilder("");
        newTitle.append(Character.toUpperCase(title.charAt(0)));
        for (int i=1;i<title.length();i++){
            if (title.charAt(i-1)==' '){
                newTitle.append(Character.toUpperCase(title.charAt(i)));
            }
            else{
                newTitle.append(title.charAt(i));
            }
        }
        return newTitle.toString();
    }
    public boolean isIntroCourse(){
        title=properTitle();
        String[] arr=title.split(" ");
        for (String s:arr){
            if (s.equals("Intro")){
                return true;
            }
        }
        if (code.length()>=6){
            if (code.substring(0, 6).equals("INTRO-")) {
                return true;
            }
        }
        return false;
    }
    public String syllabusLine(Instructor instructor){
        StringBuilder sb=new StringBuilder();
        sb.append(code).append(" ").append(title)
                .append("(Instructor: ").append(instructor.getSecondName())
                .append(" ").append(instructor.getFirstName()).append(" )");
        return sb.toString();
    }



}
