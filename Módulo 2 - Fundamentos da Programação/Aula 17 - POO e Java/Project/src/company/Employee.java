package company;

import java.util.Date;

public class Employee extends Person {
    private Double baseSalary;
    private String sector;
    private Date dismissalDate;
    private Date admissionDate;
    private Double money;

    public void receiveSalary(Double value) {
        this.money += value;
    }

    public void consultPayCheck() {

    }

    public boolean RequestVacation() {


        return true;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public String getSector() {
        return sector;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public Double getMoney() {
        return money;
    }

    protected void setMoney(Double money) {
        this.money = money;
    }
}
