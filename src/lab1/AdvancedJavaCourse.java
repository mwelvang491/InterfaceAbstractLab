package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends CollegeCourse {
    

    public AdvancedJavaCourse(double courseNumber, double credits) {
        super("Advanced Java", courseNumber, credits, null);
        String[] advancedJavaPrereq = {"Intro To Programming " , "Intro To Java" , "Database Concepts"};
        setPrerequisiteCourseNames(advancedJavaPrereq);
    }
  
  

 
  
}
