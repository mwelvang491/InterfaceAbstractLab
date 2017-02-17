package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends CollegeCourse {
    //set prerequisites here. 
    public IntroToProgrammingCourse(double courseNumber, double credits) {
        super("Intro To Programming", courseNumber, credits, null);
        String[] introProgrammingPrereq = {"No Course Preq."};
        setPrerequisiteCourseNames(introProgrammingPrereq);
    }

  
 
}
