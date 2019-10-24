//import
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Prog3{
    public static void main(String args[]) throws IOException{
        //get the file from the folder
        BufferedReader in = new BufferedReader(new FileReader("input.txt")); // Create BufferedReader object for reading file
        String line; // Variable to hold line read in from the file
        ArrayList<Employee> lineInput = new ArrayList<>();
        while ((line = in.readLine())!= null) { // Read another line of text and store in line. Exit loop if end of file
            //split the line
            //add the words to an array
            String[] tokens = line.split("\\s+");
            Employee newEmployee = Employee.factory(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3]),
            Integer.parseInt(tokens[4]),Double.parseDouble(tokens[5]),Double.parseDouble(tokens[6]) );
            lineInput.add(newEmployee);

        } 
        in.close(); // Close the buffered reader
        double totalPay = 0;
        //make table
        System.out.println("   Name      |  SSN       |   Type   |  Hours | Total pay |" );
        System.out.println("---------------------------------------------------------------");
        for(int x = 0; x<lineInput.size();x++){
            System.out.printf("%-6s",lineInput.get(x).getfname());
            System.out.printf("%-6s |",lineInput.get(x).getlname());
            System.out.printf("%-6s |",lineInput.get(x).getssn());
            System.out.printf(" %-8s |",lineInput.get(x).getType());
            double z =lineInput.get(x).getHours();
            double y =lineInput.get(x).totalPay();
            System.out.printf("%7.2f |",z);
            System.out.printf("\t $%7.2f |",y);
            totalPay += lineInput.get(x).totalPay();


            System.out.println();


        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tTotal Pay = $%.2f \n", totalPay);

    }

}