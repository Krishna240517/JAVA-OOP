import java.util.ArrayList;
public class MainforStudent{
    public static void main(String[] args){
        ArrayList<Student> studentInfo = new ArrayList<>();

        studentInfo.add(new Student("Krishna",96.3f,54));
        studentInfo.add(new Student("Divyanshu",97.8f,19));
        studentInfo.add(new Student("Ankur",95.6f,35));
        studentInfo.add(new Student("Hritam",95,54));

        System.out.println("STUDENT INFORMATION");
        for(Student s : studentInfo){
            System.out.println("Name: "+s.name+" Marks: "+s.marks+" Roll No."+s.rno);
        }
    }
}