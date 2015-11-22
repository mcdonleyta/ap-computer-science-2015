package payroll;

public class Employee extends Person {

    protected int paygrade;
    protected float baseSalary;
    protected int stockShares;
    protected Boolean stockOptions;


    public int getPaygrade() {
        return paygrade;
    }

    public float getbaseSalary() {
        return baseSalary;
    }

    public Boolean getStockOptions() {
        return stockOptions;
    }

    public int getStockShares() {
        return stockShares;
    }

    public void setPaygrade(int newPaygrade) {
        if(newPaygrade >= 7) {
            paygrade = 6;
        }
        else
            paygrade = newPaygrade;
    }

    public void setBaseSalary(float newBaseSalary) {
        baseSalary = newBaseSalary;
    }

    public void setStockOptions(Boolean newStockOptions) {
        stockOptions = newStockOptions;
    }

    public void setStockPercent(int newStockPercent) {
        stockShares = newStockPercent;
    }

    public Employee(String newName, int pgrade, float bSalary, int sShares, Boolean sOptions) {
        name = newName;
        setPaygrade(pgrade);
        setBaseSalary(bSalary);
        setStockOptions(sOptions);
        setStockPercent(sShares);
    }

    public Employee() {
        name = "";
        paygrade = 0;
        baseSalary = 0;
        stockOptions = false;
        stockShares = 0;
    }

}
