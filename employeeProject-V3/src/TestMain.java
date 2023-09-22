import employeeproject.v3.HourlyEmployee;
import employee.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Name empName1 = new Name("Matt", "Israel");
        Name empName2 = new Name("JR", "Mendoza");
        Name empName3 = new Name("Cecil", "Gwapo");

        employee employee1 = new HourlyEmployee(1, empName1, dateFormat.parse("2022-04-11"), dateFormat.parse("1999-03-31"), 23, 50);
        employee employee2 = new CommissionEmployee(2, empName2, dateFormat.parse("2022-10-12"), dateFormat.parse("1999-01-24"), 4000);
        employee employee3 = new HourlyEmployee(3, empName3, dateFormat.parse("2022-05-4"), dateFormat.parse("1999-04-6"), 31, 45);

        System.out.println("Employee 1:");
        employee1.displayInfo();
        System.out.println();
        System.out.println("Employee 2:");
        employee2.displayInfo();
        System.out.println();
        System.out.println("Employee 3:");
        employee3.displayInfo();
        System.out.println();
    }
}
