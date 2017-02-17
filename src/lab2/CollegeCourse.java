/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.StringJoiner;
import javax.swing.JOptionPane;

/**
 *
 * @author mitchell
 */
public interface CollegeCourse {
    //Super Class For A Generic College Course. 

   //public CollegeCourse(String courseName, double courseNumber, double credits, String[] prerequisites );
    
    public void displayCourseInfo();
    
    public String getCapitalizedCourseName();

    public void displayCoursePrequisites();

    public String getCourseName();

  //  public void setCourseName(String courseName);

    public double getCourseNumber();
    
    public void setCourseNumber(double courseNumber);

    public double getCourseCredits();

    public void setCourseCredits(double courseCredits);

    public String[] getPrerequisiteCourseNames();

    public void setPrerequisiteCourseNames(String[] prerequisiteCourseNames);
   
   
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
