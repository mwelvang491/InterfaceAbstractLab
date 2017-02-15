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
       String arrayPrereq[] = {"Intro To Programming " , "Intro To Java" , "Database Concepts"};
      AdvancedJavaCourse advJava = new AdvancedJavaCourse(12415 , 2.0 , arrayPrereq  );

        System.out.println("Course Name: " + advJava.getCourseName());
        System.out.println("Course Number: " + advJava.getCourseNumber() );
        System.out.println("Course Credits: " + advJava.getCourseCredits() );
        System.out.print( "Course Prerequisites: ");
        advJava.displayCoursePrequisites( );
        
    }

}
