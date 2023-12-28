

public class Institution {
	static String institutionName = "Xwork";
    static int durationmonth = 6;
    static String location = "bang";

    String courseName;
    int students;
    int numofrooms;
    
    Institution(String courseName, int students, int numofrooms){
    	 this.courseName = courseName;
         this.students = students;
    	this.numofrooms=numofrooms;
    }
    void displayInstitutionInfo() {
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Duration (months): " + durationmonth);
        System.out.println("Location: " + location);
        System.out.println("Course Name: " + courseName);
        System.out.println("Students Enrolled: " + students);
        System.out.println("Number of Rooms: " + numofrooms);
    }


}
