

public class Engineering {
	static String course = "Engineering";
    static int durationInYears = 0;
    static double Percentage = 100.00;

    String department;
    int batchStrength;
    int students;
    boolean hasInternship;

    Engineering(String department, int batchStrength, int students, boolean hasInternship) {
        this.department = department;
        this.batchStrength = batchStrength;
        this.students = students;
        this.hasInternship = hasInternship;
    }

    // Method to display engineering program information
    public void displayProgramInfo() {
        System.out.println("Course: " + course);
        System.out.println("Department: " + department);
        System.out.println("Batch Strength: " + batchStrength);
        System.out.println("Duration: " + durationInYears );
        System.out.println("Students: " + students);
        System.out.println("Internship: " + (hasInternship ? "Yes" : "No"));
        System.out.println("Percentage: " + Percentage + "%");
    }
}
