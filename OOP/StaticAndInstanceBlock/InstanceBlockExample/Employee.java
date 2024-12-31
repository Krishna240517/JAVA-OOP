public class Employee{
    String name;
    float Base_salary;
    int id;

    //instance block
    /*
     * instance blocks are executed first rather than any constructor call
     * you can also use a debugger to better understand the flow of program
     * when using instance block.
     */
    {
        this.Base_salary = 50000;
    }
    public Employee(String name,float salary,int id){
        this.name = name;
        this.Base_salary = salary;
        this.id = id;
    }
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
}