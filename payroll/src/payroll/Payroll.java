package payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payroll {

    private String companyName;
    private List<Employee> employees = new ArrayList(0);
    private List<Float> payGradeNums = new ArrayList(0);
    private float stockWorth;

    public int getListSize() {
        return employees.size();
    }

    public void setName(String nName) {
        companyName = nName;
    }

    public String getName() { return companyName; };

    public void setPaygrade(List<Float> nPaygrade) {
        payGradeNums = nPaygrade;
    }

    public void setStockWorth(float nStockWorth) {
        stockWorth = nStockWorth;
    }

    public float getStockWorth() { return stockWorth; }

    public List<Float> getPayGradeNums() { return payGradeNums; }

    public Person getEmployee(int index) {
        return employees.get(index);
    }

    public void removeEmployee(int index) {
        employees.remove(index);
    }

    public void addEmployee(String nName, int nPaygrade, float bSalary, int nStock, Boolean canStock) {
        employees.add(new Employee(nName, nPaygrade, bSalary, nStock, canStock));
    }

    public void addCEO(String nName, int nPaygrade, float bSalary, int nStock, Boolean canStock) {
        employees.add(new CEO(nName, nPaygrade, bSalary, nStock, canStock));
    }

    public int getCEO() {
        int ret = 0;
        if(getListSize() == 0) {
            return -1;
        }
        for(int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getPaygrade() == 7) {
                return i;
            }
        }
        return -1;
    }

    public float getSalary(int index) {
        return (employees.get(index).getbaseSalary() +
                    payGradeNums.get(employees.get(index).getPaygrade() - 1) +
                    (float)employees.get(index).getStockShares() * stockWorth);

    }

    public Payroll() { }

}
