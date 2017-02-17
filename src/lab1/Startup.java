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
          OutputService outputService = new OutputService();
     
            AdvancedJavaCourse advJava = new AdvancedJavaCourse(343, 4.0);
            IntroToProgrammingCourse introProgramCourse = new IntroToProgrammingCourse(15642, 2.0);
            IntroJavaCourse introJava = new IntroJavaCourse(2000, 4.0);
           
            advJava.displayCourseInfo();
               outputService.outputSeperatationLine();
                 
            introProgramCourse.displayCourseInfo();
              outputService.outputSeperatationLine();
                 
            introJava.displayCourseInfo();
            
            
       }

}
 
        
  
