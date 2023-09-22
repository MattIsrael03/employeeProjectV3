package employee;

import java.util.Date;

public class employee {
    protected int empID;
    protected Name empName;
    protected Date empDateHired;
    protected Date empBirthDate;

    public employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName;
    }
}
