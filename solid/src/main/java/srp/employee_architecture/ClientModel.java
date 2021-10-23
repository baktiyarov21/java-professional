package srp.employee_architecture;

public class ClientModel {

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Sam", "IT", true);
        ClientModel.hireNewEmployee(employee);
        ClientModel.printEmployeeReport(employee, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }
}
