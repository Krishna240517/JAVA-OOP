import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Employee> employeeDetails = new ArrayList<>();
        employeeDetails.add(new Employee("Krishna",60000.56f,101));
        employeeDetails.add(new Employee("Om",60000.14f,102));
        //in the above two lines we added the employee object
        //details manually.
        //but what if i don't want to enter any details about
        //the salary of the employee considering a predefined base salary
        
        employeeDetails.add(new Employee("SOUMIK", 103));

        for(Employee e : employeeDetails){
            System.out.println("NAME: "+e.name+" SALARY: "+e.Base_salary+" ID: "+e.id);
        }

        
    }

}