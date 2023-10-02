public class Main {
    public static void main(String[] args) {
        // Create some computer objects
        Computer computer1 = new Computer("C001", "LCD Model 1", 8, 500, true);
        Computer computer2 = new Computer("C002", "LCD Model 2", 16, 1000, false);

        // Create an employee for lab attendant
        Employee labAttendant = new Employee("E001", "John Doe");

        // Create a lab
        Lab lab1 = new Lab("L001", labAttendant);
        Lab lab2 = new Lab("L002", null); // Lab without an attendant

        // Add computers to labs
        lab1.addComputer(computer1);
        lab2.addComputer(computer2);

        // Create a University
        University university = new University();

        // Add labs to the university
        university.addLab(lab1);
        university.addLab(lab2);

        // Fetch lab details
        String labDetails = university.getLabDetails("L001");
        System.out.println("Lab 1 Details:\n" + labDetails);

        // Fetch computer details
        String computerDetails = university.getComputerDetails("L002", "C002");
        System.out.println("\nComputer 2 Details:\n" + computerDetails);
    }
}
