import java.util.ArrayList;
import java.util.List;

public class Lab {
    private String labID;
    private List<Computer> computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab() {
        this.computers = new ArrayList<>();
        this.status = LabStatus.INACTIVE;
    }

    public Lab(String labID, Employee labAttendant) {
        this.labID = labID;
        this.computers = new ArrayList<>();
        this.status = LabStatus.INACTIVE;
        this.labAttendant = labAttendant;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer fetchComputer(String computerID) {
        for (Computer computer : computers) {
            if (computer.getComputerNumber().equals(computerID)) {
                return computer;
            }
        }
        return null; // Computer not found
    }

    public void changeLabStatus(LabStatus newStatus) {
        this.status = newStatus;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    // Getter and setter for labID
    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    // Getter for status
    public LabStatus getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Computer[] getComputers() {
        return getComputers();
    }
}
