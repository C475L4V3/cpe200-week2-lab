/**
 * Implement grading system.
 */
public class GPA {
    private float avg = 0;
    private float ag = 0;
    public void addGrade(int credit, float grade) {
        avg += credit*grade;
        ag += credit;
    }

    public float get() {
        float average = avg/ag;
        if (average > 0) return average;
        else return 0;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
