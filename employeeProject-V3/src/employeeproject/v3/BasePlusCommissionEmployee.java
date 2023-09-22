package employee;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private final double baseSalary;

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {

        return super.computeSalary() + baseSalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + computeSalary());
    }
}


