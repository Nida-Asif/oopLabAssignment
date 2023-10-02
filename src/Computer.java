public class Computer implements Cloneable {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer() {
        // Default constructor
    }

    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    // Getter and Setter methods for all attributes
    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean hasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return ramSize == computer.ramSize &&
                hddSize == computer.hddSize &&
                hasGPU == computer.hasGPU &&
                computerNumber.equals(computer.computerNumber) &&
                lcdModel.equals(computer.lcdModel);
    }

    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported");
        }
    }
}


