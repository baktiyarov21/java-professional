package srp.employee_architecture;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXML(o);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(o);
                break;
        }
    }

    private String convertObjectToXML(Object o) {
        return "converted to XML" + o.toString();
    }

    private String convertObjectToCSV(Object o) {
        return "converted to CSV" + o.toString();
    }
}
