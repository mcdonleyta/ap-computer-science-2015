package driver;
import worker.*;
import java.util.*;

public class Driver {

    private List<String> options = new ArrayList<>(0);
    private List<Employee> employees = new ArrayList(0);
    private Scanner intIn = new Scanner(System.in);
    private Scanner stringIn = new Scanner(System.in);
    private Scanner floatIn = new Scanner(System.in);

    public void setOptions() {
        options.add("1: See Employees");
        options.add("2: New Employee");
        options.add("3: Remove Employee");
        options.add("4: Quit");
    }

    public void seeOptions() {
        for(int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i));
        }
    }

    private void seeEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("(" + (i + 1) + ")" + employees.get(i).getName() + ":");
            if(i == 0) {
                System.out.println("\tCEO!");
            }
            System.out.println("\tPaygrade: " + employees.get(i).getPaygrade());
            System.out.println("\tBase Salary: " + employees.get(i).getbaseSalary());
            System.out.println("\tCan have stock: " + employees.get(i).getStockOptions());
            System.out.println("\tStock Percentage Owned: " + employees.get(i).getStockPercent() + "\n");
        }
    }

    private Person getEmployee(int index) {
        return employees.get(index);
    }

    private void removeEmployee(int index) {
        employees.remove(index);
    }

    private void addEmployee() {
        Boolean canStock;
        System.out.println("Enter Employee's Name:");
        String nName = stringIn.nextLine();
        System.out.println("Enter Employee's Paygrade");
        int nPaygrade = intIn.nextInt();
        System.out.println("Enter Employee's Base Salary:");
        float bSalary = floatIn.nextFloat();
        System.out.println("Enter Employee's Stock Options, Yes or No:");
        String boolIn = stringIn.nextLine();
        if(boolIn.equals("Yes") || boolIn.equals("yes"))
            canStock = true;
        else if(boolIn.equals("No") || boolIn.equals("no"))
            canStock = false;
        else
            canStock = false;
        System.out.println("Enter Employee's Stock Percent Owned");
        float nStock = floatIn.nextFloat();
        employees.add(new Employee(nName, nPaygrade, bSalary,nStock, canStock));
    }

    private void addCEO() {
        Boolean canStock;
        System.out.println("Enter CEO's Name:");
        String nName = stringIn.nextLine();
        System.out.println("Enter CEO's Paygrade");
        int nPaygrade = intIn.nextInt();
        System.out.println("Enter CEO's Base Salary:");
        float bSalary = floatIn.nextFloat();
        System.out.println("Enter CEO's Stock Options, Yes or No:");
        String boolIn = stringIn.nextLine();
        if(boolIn.equals("Yes") || boolIn.equals("yes"))
            canStock = true;
        else if(boolIn.equals("No") || boolIn.equals("no"))
            canStock = false;
        else
            canStock = false;
        System.out.println("Enter CEO's Stock Percent Owned");
        float nStock = floatIn.nextFloat();
        employees.add(new CEO(nName, nPaygrade, bSalary,nStock, canStock));
    }

    public void write() {

    }

    public void read() {
        
    }

    public void run() {
        Boolean cont = true;
        int in = 0, index = 0;
        System.out.println("No CEO Detected, Please Make New CEO:");
        addCEO();
        do {
            seeOptions();
            in = intIn.nextInt();
            switch(in) {
                case 1:
                    seeEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    System.out.println("\tEmployee Index:");
                    System.out.println("\t");
                    index = intIn.nextInt();
                    removeEmployee(index - 1);
                    break;
                case 4:
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while(!cont == false);
    }

    public Driver() {
        setOptions();
    }

}
