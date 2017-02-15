/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author mitchell
 */
public abstract class CollegeCourse {
    //Super Class For A Generic College Course. 
    private String courseName; //All Courses Have A Name. 
    
    private double courseNumber; //All Courses Have A Number or comparable Id. 
    //Changed courseNumber to a double from a string. 
    //CourseNumber Should be always be a number, making it a double allows for more flexibily. 
    
    private double courseCredits = 0.0;     //All Courses Have a value for credits. 
    private String[] prerequisiteCourseNames;  //All Courses Have a value for prerequisites.  

    public CollegeCourse(String courseName, double courseNumber, double credits, String[] prerequisites ) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCourseCredits(credits);
        setPrerequisiteCourseNames(prerequisites);
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    
    public void displayCoursePrequisites(){
                for (String course : prerequisiteCourseNames) {
                 System.out.print(course + ", ");
                }
    }

    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
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
