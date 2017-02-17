package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends CollegeCourse {

    public IntroJavaCourse(double courseNumber, double courseCredits) {
        super("Advanced Java", courseNumber, courseCredits, null);
        String[] introJavaPrereq = {"Intro To Programming"};
        setPrerequisiteCourseNames(introJavaPrereq);
    }

 
}
