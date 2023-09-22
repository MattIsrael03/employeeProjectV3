package employeeproject.v3;

import employee.Name;
import employee.employee;
import java.util.Date;

public class HourlyEmployee extends employee {
    private final double totalHoursWorked;
    private final double ratePerHour;

    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalHoursWorked, double ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        double salary = totalHoursWorked * ratePerHour;
        if (totalHoursWorked > 40) {
            salary += (totalHoursWorked - 40) * ratePerHour * 1.5;
        }
        return salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: $" + ratePerHour);
        System.out.println("Salary: $" + computeSalary());
    }
}