package worker;

public class CEO extends Employee{

    public void setPaygrade(int newPaygrade) {
        if(newPaygrade > 7) {
            paygrade = 7;
        }
        else {
            paygrade = newPaygrade;
        }
    }

}
