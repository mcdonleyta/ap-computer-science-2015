package worker;

public class Employee extends Person {

    protected int paygrade;
    protected float baseSalary;
    protected float stockPercent;
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

    public float getStockPercent() {
        return stockPercent;
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

    public void setStockPercent(float newStockPercent) {
        stockPercent = newStockPercent;
    }

    public Employee(String newName, int pgrade, float bSalary, float sPercent, Boolean sOptions) {
        name = newName;
        setPaygrade(pgrade);
        setBaseSalary(bSalary);
        setStockOptions(sOptions);
        setStockPercent(sPercent);
    }

    public Employee() {
        name = "";
        paygrade = 0;
        baseSalary = 0;
        stockOptions = false;
        stockPercent = 0;
    }

}
