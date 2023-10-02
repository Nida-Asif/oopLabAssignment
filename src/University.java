import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Lab> labs;

    public University() {
        this.labs = new ArrayList<>();
    }

    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public void removeLab(Lab lab) {
        labs.remove(lab);
    }

    public Lab fetchLab(String labID) {
        for (Lab lab : labs) {
            if (lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null; // Lab not found
    }

    // Fetch details about a specific lab
    public String getLabDetails(String labID) {
        Lab lab = fetchLab(labID);
        if (lab != null) {
            StringBuilder details = new StringBuilder();
            details.append("Lab ID: ").append(lab.getLabID()).append("\n");
            details.append("Lab Status: ").append(lab.getStatus()).append("\n");
            if (lab.getLabAttendant() != null) {
                details.append("Lab Attendant: ").append(lab.getLabAttendant().getName()).append("\n");
            }
            details.append("Computers in the Lab:\n");
            for (Computer computer : lab.getComputers()) {
                details.append("Computer Number: ").append(computer.getComputerNumber()).append("\n");
                details.append("LCD Model: ").append(computer.getLcdModel()).append("\n");
                details.append("RAM Size (GB): ").append(computer.getRamSize()).append("\n");
                details.append("HDD Size (GB): ").append(computer.getHddSize()).append("\n");
                details.append("Has GPU: ").append(computer.hasGPU()).append("\n");
            }
            return details.toString();
        } else {
            return "Lab not found.";
        }
    }

    // Fetch details about a specific computer in a lab
    public String getComputerDetails(String labID, String computerID) {
        Lab lab = fetchLab(labID);
        if (lab != null) {
            Computer computer = lab.fetchComputer(computerID);
            if (computer != null) {
                StringBuilder details = new StringBuilder();
                details.append("Lab ID: ").append(lab.getLabID()).append("\n");
                details.append("Computer Number: ").append(computer.getComputerNumber()).append("\n");
                details.append("LCD Model: ").append(computer.getLcdModel()).append("\n");
                details.append("RAM Size (GB): ").append(computer.getRamSize()).append("\n");
                details.append("HDD Size (GB): ").append(computer.getHddSize()).append("\n");
                details.append("Has GPU: ").append(computer.hasGPU()).append("\n");
                return details.toString();
            } else {
                return "Computer not found in the specified lab.";
            }
        } else {
            return "Lab not found.";
        }
    }
}


