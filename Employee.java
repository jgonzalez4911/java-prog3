
public abstract class Employee{
    private String fname;
    private String lname;
    private String ssn;
    protected int hours;
    //constructor - initializes the variables
    public Employee(String fname, String lname, String ssn, int hours){
        this.fname = fname;
        this.lname = lname;
        this.ssn = ssn;
        this.hours = hours;

    }
    //getters for variables
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String getssn(){
        return ssn;

    }
    public int getHours(){
        return hours;
    }
    

    //abstract methods
    public abstract String getType();
    public abstract double totalPay();
    //check which method to run
    public static Employee factory(String fname, String lname, String ssn, int type, int hours, double wage, double salary){
        //determine the class to use
        if(type == 1){
            return new HourlyEmployee(fname, lname, ssn, hours, wage);
        }
        else if(type == 2){
            return new SalariedEmployee(fname, lname, ssn, hours,salary);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}


