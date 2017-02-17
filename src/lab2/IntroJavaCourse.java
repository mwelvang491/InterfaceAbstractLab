package lab2;

import java.util.StringJoiner;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements CollegeCourse {
    
    private final String  courseName = "Intro To Programming"; //All Courses Have A Name. 
    OutputService menu = new OutputService();
     
    private double courseNumber; //All Courses Have A Number or comparable Id. 
    //Changed courseNumber to a double from a string. 
    //CourseNumber Should be always be a number, making it a double allows for more flexibily. 
    private double courseCredits = 0.0;     //All Courses Have a value for credits. 
    private String[] prerequisiteCourseNames = {"Intro To Programming"};
    
    public IntroJavaCourse(double courseNumber, double credits ) {
        setCourseNumber(courseNumber);
        setCourseCredits(credits);
    }
      public void displayCourseInfo(){
        menu.handleOutput("Course Name: " + getCourseName() );
        menu.handleOutput("Course Number: " + getCourseNumber() );
        menu.handleOutput("Course Credits: " + getCourseCredits() );
        menu.handleOutput("Course Prerequisites: ");
             displayCoursePrequisites( );
          
      }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    
    public void displayCoursePrequisites(){
        StringJoiner sj = new StringJoiner(", ","",".");
            for (String courseName : prerequisiteCourseNames) {
                sj.add(courseName);
            }
            
            String output = sj.toString();
            menu.handleOutput(output);
                 
    }

    public String getCourseName() {
        return courseName;
    }


    public double getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(double courseNumber) {
    
        this.courseNumber = courseNumber;
    }

    public double getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(double courseCredits) {
        if(courseCredits < 0 || courseCredits > 5.0) {
            System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.courseCredits = courseCredits;
    }

    public String[] getPrerequisiteCourseNames() {
        return prerequisiteCourseNames;
    }

    public void setPrerequisiteCourseNames(String[] prerequisiteCourseNames) {
        this.prerequisiteCourseNames = prerequisiteCourseNames;
    }

  

}
