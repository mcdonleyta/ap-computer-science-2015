import payroll.*;
import java.util.Scanner;

public class Driver {
    
    static Payroll pr;
    static Scanner scanner;
    
    private static void makePayroll() {
        System.out.println("Setup the payroll:");
        System.out.println("Enter CEO name:");
        String ceoName = scanner.nextLine();
        System.out.println("Enter CEO yearly salary:");
        float ceoSalary = scanner.nextFloat();
        System.out.println("Does the CEO have stock options (true/false)?");
        boolean ceoStockOptions = scanner.nextBoolean();
        System.out.println("How many shares does the CEO have?");
        int shares = scanner.nextInt();
        System.out.println("Enter company yearly profit:");
        float yearlyProfit = scanner.nextFloat();
        System.out.println("Enter total # company shares:");
        long numShares = scanner.nextLong();
        pr = new Payroll(ceoName, ceoSalary, ceoStockOptions, shares, yearlyProfit, numShares);
    }
    
    private static void addEmployee() {
        System.out.println("Enter new employee name:");
                String name = scanner.nextLine();
                System.out.println("Enter new employee salary:");
                float salary = scanner.nextFloat();
                System.out.println("Enter new employee pay grade:");
                int payGrade = scanner.nextInt();
                System.out.println("Does the new employee have stock options (true/false)?");
                boolean stockOptions = scanner.nextBoolean();
                System.out.println("How many shares (not including stock options bonus) does the new employee have?");
                int shares = scanner.nextInt();
                pr.employees.add(new Employee(name, salary, payGrade, stockOptions, shares));
    }
    
    private static void removeEmployee() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0)
            pr.employees.remove(index);
        else
            System.out.println("Employee not found");
    }
    
    private static void getInfo() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0)
            System.out.println(pr.employees.get(index).getInfo(pr.yearlyProfit, pr.totalShares));
        else if(index == -2) {
            System.out.println(pr.ceo.getInfo(pr.yearlyProfit, pr.totalShares));
        }
        else
            System.out.println("Employee not found");
    }
    
    private static void setSalary() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0) {
            System.out.println("Enter new salary:");
            float salary = scanner.nextFloat();
            pr.employees.get(index).setSalary(salary);
        }
        else if(index == -2) {
            System.out.println("Enter new salary:");
            float salary = scanner.nextFloat();
            pr.ceo.setSalary(salary);
        }
        else
            System.out.println("Employee not found");
    }    
    
    private static void setPayGrade() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0) {
            System.out.println("Enter new pay grade:");
            int payGrade = scanner.nextInt();
            pr.employees.get(index).setPayGrade(payGrade);
        }
        else if(index == -2) {
            System.out.println("Enter new pay grade:");
            int payGrade = scanner.nextInt();
            pr.ceo.setPayGrade(payGrade);
        }
        else
            System.out.println("Employee not found");
    }
    
    private static void setStockOptions() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0) {
            System.out.println("Enter new stock options (true/false):");
            boolean stockOptions = scanner.nextBoolean();
            pr.employees.get(index).setStockOptions(stockOptions);
        }
        else if(index == -2) {
            System.out.println("Enter new stock options (true/false):");
            boolean stockOptions = scanner.nextBoolean();
            pr.ceo.setStockOptions(stockOptions);
        }
        else
            System.out.println("Employee not found");
    }
    
    private static void setShares() {
        System.out.println("Enter employee name:");
        int index = pr.findEmployee(scanner.nextLine());
        if(index >= 0) {
            System.out.println("Enter new shares (before stock options bonus):");
            int shares = scanner.nextInt();
            pr.employees.get(index).setShares(shares);
        }
        else if(index == -2) {
            System.out.println("Enter new shares (before stock options bonus):");
            int shares = scanner.nextInt();
            pr.ceo.setShares(shares);
        }
        else
            System.out.println("Employee not found");
    }
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        makePayroll();
        
        scanner.nextLine();
        
        boolean done = false;
        while(!done) {
            System.out.println("\nWhat would you like to do?");
            
            String input = scanner.nextLine();
            if(input.equals("addEmployee")) {
                addEmployee();
            }
            else if(input.equals("removeEmployee")) {
                removeEmployee();
            }
            else if(input.equals("getInfo")) {
                getInfo();
            }
            else if(input.equals("setSalary")) {
                setSalary();
            }
            else if(input.equals("setPayGrade")) {
                setPayGrade();
            }
            else if(input.equals("setStockOptions")) {
                setStockOptions();
            }
            else if(input.equals("setShares")) {
                setShares();
            }
            else if(input.equals("done")) {
                done = true;
            }
            else {
                System.out.println("commands: done, addEmployee, removeEmployee, getInfo, setSalary, setPayGrade, setStockOptipons, setShares");
            }
        }
    }
}
