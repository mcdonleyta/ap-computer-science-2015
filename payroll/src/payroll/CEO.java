package payroll;

public class CEO extends Employee{

    public void setPaygrade(int newPaygrade) {
        if(newPaygrade > 7) {
            paygrade = 7;
        }
        else {
            paygrade = newPaygrade;
        }
    }

    public CEO(String newName, int pgrade, float bSalary, int sShares, Boolean sOptions) {
        name = newName;
        setPaygrade(pgrade);
        setBaseSalary(bSalary);
        setStockOptions(sOptions);
        setStockPercent(sShares);
    }

}