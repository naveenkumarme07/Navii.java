

public class Govtschool {
	
	static int schoolHour=8;
	static String uniform="green";
	static int percentagemarks=78;
	
	int numofST;
	String teacherName;
	int classrooms;
	int numofStaff;
	
	 // 
    public Govtschool(int numofST, String teacherName, int classrooms, int numofStaff) {
        this.numofST = numofST;
        this.teacherName = teacherName;
        this.classrooms = classrooms;
        this.numofStaff = numofStaff;
    }

     void printValues() {
        System.out.println("Static Variables:");
        System.out.println("School Hour: " + schoolHour);
        System.out.println("Uniform: " + uniform);
        System.out.println("Percentage Marks: " + percentagemarks);

        System.out.println("Non-Static Variables:");
        System.out.println("Number of Students: " + numofST);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Number of Classrooms: " + classrooms);
        System.out.println("Number of Staff: " + numofStaff);
    }


	

}
