package Assignments;

public class StudentMark {

    private int marks1;
    private int marks2;
    private int marks3;

    // Parameterized constructor to initialize the student's marks
    public StudentMark(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to determine the grade based on total marks
    public String getGrade() {
        int totalMarks = getTotalMarks();
        if (totalMarks >= 90) {
            return "A";
        } else if (totalMarks >= 80) {
            return "B";
        } else if (totalMarks >= 70) {
            return "C";
        } else if (totalMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Creating instances of Student with marks for each student
    	StudentMark student1 = new StudentMark(85, 78, 92); // Student 1 marks
    	StudentMark student2 = new StudentMark(70, 65, 80); // Student 2 marks

        // Getting total marks and grade for each student
        int totalMarks1 = student1.getTotalMarks();
        String grade1 = student1.getGrade();
        int totalMarks2 = student2.getTotalMarks();
        String grade2 = student2.getGrade();

        // Printing the total marks and grade of each student
        System.out.println("Student 1 Total Marks: " + totalMarks1);
        System.out.println("Student 1 Grade: " + grade1);
        System.out.println("Student 2 Total Marks: " + totalMarks2);
        System.out.println("Student 2 Grade: " + grade2);
    }
}

