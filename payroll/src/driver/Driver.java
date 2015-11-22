package driver;
import payroll.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    private Payroll company;
    private List<String> options = new ArrayList<>(0);
    private Writer write;
    private Scanner intIn = new Scanner(System.in);
    private Scanner stringIn = new Scanner(System.in);
    private Scanner floatIn = new Scanner(System.in);

    public void setOptions() {
        options.add("1: See Employees");
        options.add("2: New Employee");
        options.add("3: Remove Employee");
        options.add("4: See Employee Salary");
        options.add("5: Save And Quit");
    }

    public void Initial() {
        Boolean cont1 = true;
        int choice = 0;
        System.out.print("No Company Currently Loaded:\n\t1: Load Company\n\t2: New Company\n\t");
        do {
            choice = intIn.nextInt();
            switch (choice) {
                case 1:
                    try {
                        loadCompany();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    cont1 = false;
                    break;
                case 2:
                    try {
                        newCompany();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    cont1 = false;
                    break;
                default:
                    System.out.println("Try Again, Smartass");
                    break;
            }
        } while(!cont1 == false);
    }

    public void loadCompany() throws IOException {
        List<String> companies = write.getCompanies();
        int i = 0, choice1;
        for(String company: companies) {
            System.out.println("\t" + (i + 1) + ": " + company);
        }
        System.out.print("Which Company Do You Want To Load:\n\t");
        choice1 = intIn.nextInt();
        company = write.loadCompany(companies.get(choice1 - 1));
    }

    public void newCompany() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("What is the Company's Name:");
        company.setName(stringIn.nextLine());
        System.out.println("Plese Enter New CEO Infortmation:");
        addCEO();
        addPaygrade();
        addStockWorth();
        write.writeCompany(company.getName());
    }

    public void seeOptions() {
        for(int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i));
        }
    }

    public void seeEmployees() {
        Employee curEmployee;
        for(int i = 0; i < company.getListSize(); i++) {
            curEmployee = (Employee) company.getEmployee(i);
            System.out.println("(" + (i + 1) + ")" + curEmployee.getName() + ":");
            if (curEmployee.getPaygrade() == 7) {
                System.out.println("\tCEO!");
            }
            System.out.println("\tPaygrade: " + curEmployee.getPaygrade());
            System.out.println("\tBase Salary: " + curEmployee.getbaseSalary());
            System.out.println("\tCan have stock: " + curEmployee.getStockOptions());
            System.out.println("\tStock Percentage Owned: " + curEmployee.getStockShares() + "\n");
        }
    }

    public void addEmployee() {
        Boolean canStock;
        System.out.print("\tEnter Employee's Name:\n\t");
        String nName = stringIn.nextLine();
        System.out.print("\tEnter Employee's Paygrade:\n\t");
        int nPaygrade = floatIn.nextInt();
        System.out.print("\tEnter Employee's Base Salary:\n\t");
        float bSalary = floatIn.nextFloat();
        System.out.print("\tCan Employee Own Stock:\n\t");
        String boolIn = stringIn.nextLine();
        if(boolIn.equals("Yes") || boolIn.equals("yes")) {
            canStock = true;
        }
        else if(boolIn.equals("No") || boolIn.equals("no")) {
            canStock = false;
        }
        else {
            canStock = false;
        }
        System.out.print("\tEnter Employee's Shares Owned:\n\t");
        int nStock = intIn.nextInt();
        company.addEmployee(nName, nPaygrade, bSalary, nStock, canStock);
    }

    public void addCEO() {
        Boolean canStock;
        System.out.print("\tEnter Employee's Name:\n\t");
        String nName = stringIn.nextLine();
        System.out.print("\tEnter Employee's Paygrade:\n\t");
        int nPaygrade = floatIn.nextInt();
        System.out.print("\tEnter Employee's Base Salary:\n\t");
        float bSalary = floatIn.nextFloat();
        System.out.print("\tCan Employee Own Stock:\n\t");
        String boolIn = stringIn.nextLine();
        if(boolIn.equals("Yes") || boolIn.equals("yes")) {
            canStock = true;
        }
        else if(boolIn.equals("No") || boolIn.equals("no")) {
            canStock = false;
        }
        else {
            canStock = false;
        }
        System.out.print("\tEnter Employee's Shares Owned:\n\t");
        int nStock = intIn.nextInt();
        company.addCEO(nName, nPaygrade, bSalary, nStock, canStock);
    }

    public void addPaygrade() {
        List<Float> paygrades = new ArrayList<>(0);
        System.out.println("Please Enter Paygrade Information Now:");
        for(int i = 1; i <= 7; i++) {
            System.out.print("\tPlease Enter Paygrade Level " + i + " Information:\n\t");
            paygrades.add(floatIn.nextFloat());
        }
        company.setPaygrade(paygrades);
    }

    public void addStockWorth() {
        System.out.print("\tHow Much Are Stocks Worth:\n\t");
        company.setStockWorth(floatIn.nextFloat());
    }

    public void removeEmployee(int index) {
        company.removeEmployee(index);
    }

    public void getPayroll(int index) {
        company.getSalary(index);
    }

    public void options() {
        Boolean cont = true;
        int in = 0, index = 0;
        Initial();
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
                    System.out.print("\t");
                    index = intIn.nextInt();
                    removeEmployee(index - 1);
                    break;
                case 4:
                    System.out.println("\tEmployee Index:");
                    System.out.print("\t");
                    index = intIn.nextInt();
                    System.out.println(company.getSalary(index - 1));
                    break;
                case 5:
                    cont = false;
                    try {
                        write.writer(company);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while(!cont == false);
    }

    public Driver() {
        write = new Writer();
        company = new Payroll();
        setOptions();
    }

}
