public class HourlyEmployee extends Employee{
    private double wage;
    //initialize variables
    public HourlyEmployee(String fname, String lname, String ssn, int hours, double wage){
        super(fname,lname,ssn,hours);
        this.wage = wage;
    }
    //override the abstract
    public String getType(){
        return "HOURLY";
    }
    public double totalPay(){
        return (hours * wage);
    }

}
