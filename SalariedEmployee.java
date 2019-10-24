public class SalariedEmployee extends Employee{
    private  double salary;
    //initialize variables
    public SalariedEmployee(String fname, String lname, String ssn, int hours, double salary){
        super(fname, lname, ssn,hours);
        this.salary = salary;
    }
    //override abstract
    public String getType(){
        return "SALARIED";
    }
    public double totalPay(){
        return (salary/52.0);
    }

}