public class Employee {
    private String employeeID;
    private String name;
    private static String designation = "Lab Attendant"; // Static attribute for designation

    public Employee() {
        // Default constructor
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    // Getter and Setter methods for all attributes
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Static getter for designation
    public static String getDesignation() {
        return designation;
    }

    // Static setter for designation (optional)
    public static void setDesignation(String newDesignation) {
        designation = newDesignation;
    }
}
