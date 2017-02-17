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
public class OutputService {

   public void handleOutput(String msg) {
        System.out.println(msg);
   }
    
   public void drawSeperatationLine(){
       handleOutput("\n\n---------------------\n");
   }
}
