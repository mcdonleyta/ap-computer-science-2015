package driver;
import worker.*;
import java.util.*;

public class Driver {

    private List<String> options = new ArrayList<>(0);
    private List<Employee> employees = new ArrayList(0);
    private Scanner input = new Scanner(System.in);

    public void setOptions() {
        options.add("1: See Employees");
        options.add("2: New Employee");
        options.add("3: Remove Employee");
    }

    private void seeEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i + ":");
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
        String nName = input.nextLine();
        System.out.println("Enter Employee's Paygrade");
        int nPaygrade = input.nextInt();
        System.out.println("Enter Employee's Base Salary:");
        float bSalary = input.nextFloat();
        System.out.println("Enter Employee's Stock Options, Yes or No:");
        String boolIn = input.nextLine();
        if(boolIn.equals("Yes") || boolIn.equals("yes"))
            canStock = true;
        else if(boolIn.equals("No") || boolIn.equals("no"))
            canStock = false;
        else
            canStock = false;
        System.out.println("Enter Employee's Stock Percent Owned");
        float nStock = input.nextFloat();
        employees.add(new Employee(nName, nPaygrade, bSalary,nStock, canStock));
    }

    public Driver() {

    }

}
