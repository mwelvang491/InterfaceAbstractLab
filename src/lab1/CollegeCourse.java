/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.StringJoiner;
import javax.swing.JOptionPane;

/**
 *
 * @author mitchell
 */
public abstract class CollegeCourse {
    //Super Class For A Generic College Course. 
    private String courseName; //All Courses Have A Name. 
    OutputService menu = new OutputService();
     
    private double courseNumber; //All Courses Have A Number or comparable Id. 
    //Changed courseNumber to a double from a string. 
    //CourseNumber Should be always be a number, making it a double allows for more flexibily. 
    private double courseCredits = 0.0;     //All Courses Have a value for credits. 
    private String[] prerequisiteCourseNames;  //All Courses Have a value for prerequisites even if they have a value of none.  

    public CollegeCourse(String courseName, double courseNumber, double courseCredits, String[] coursePrerequisites ) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCourseCredits(courseCredits);
        setPrerequisiteCourseNames(coursePrerequisites);
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

    private void setCourseName(String courseName) {
        //you should not be allowed to change the course name. 
        if(courseName == null || courseName.length() == 0) {
          JOptionPane.showMessageDialog(null, "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
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

   
   
//    public String getPrerequisites() {
//        return prerequisites;
//    }
//    
//    
//    public void setPrerequisites(String prerequisites) {
//        if(prerequisites == null || prerequisites.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
//        }
//        this.prerequisites = prerequisites;
//    }



    



    
}
