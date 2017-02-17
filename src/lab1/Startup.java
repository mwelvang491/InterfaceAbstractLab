/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mitchell
 */
public class Startup {
    public static void main(String[] args) {
     // String advancedJavaPrereq[] = {"Intro To Programming " , "Intro To Java" , "Database Concepts"};
          Menu menu = new Menu();
     
            AdvancedJavaCourse advJava = new AdvancedJavaCourse(12415 , 4.0);
            IntroToProgrammingCourse introProgramCourse = new IntroToProgrammingCourse(15642, 2.0);
            IntroJavaCourse introJava = new IntroJavaCourse(2277, 4.0);
            
            advJava.displayCourse();
                 menu.drawSeperatation();
                 
            introProgramCourse.displayCourse();
                 menu.drawSeperatation();
                 
            introJava.displayCourse();
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//        menu.handleOutput("Course Name: " + advJava.getCourseName() );
//        menu.handleOutput("Course Number: " + advJava.getCourseNumber() );
//        menu.handleOutput("Course Credits: " + advJava.getCourseCredits() );
//        menu.handleOutput( "Course Prerequisites: ");
//                advJava.displayCoursePrequisites( );
//                
//         menu.drawSeperatation();
//

//        menu.handleOutput("Course Name: " + introProgramCourse.getCourseName());
//       menu.handleOutput("Course Number: " + introProgramCourse.getCourseNumber() );
//        menu.handleOutput("Course Credits: " + introProgramCourse.getCourseCredits() );
//       menu.handleOutput( "Course Prerequisites: ");
//                introProgramCourse.displayCoursePrequisites( );
//        
//         menu.drawSeperatation();
//

//        menu.handleOutput("Course Name: " + introJava.getCourseName());
//        menu.handleOutput("Course Number: " + introJava.getCourseNumber() );
//        menu.handleOutput("Course Credits: " + introJava.getCourseCredits() );
//        menu.handleOutput( "Course Prerequisites: ");
//                introJava.displayCoursePrequisites( );
        
  
    }

}
