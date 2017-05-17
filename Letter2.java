/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter2;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kendrabooker
 */
public class Letter2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
      public static void Printwriter(String[] args) throws IOException 
      {
        
         PrintWriter textfile = new PrintWriter(new FileWriter("letter.txt"));
         
         textfile.println("+---------------------------------+");
         textfile.println("|                              ###|");
         textfile.println("|                              ###|");
         textfile.println("|                              ###|");
         textfile.println("|                                 |");
         textfile.println("|                                 |");
         textfile.println("|                                 |");
         textfile.println("|                 Willie Doe      |");
         textfile.println("|                 555 smith st    |");
         textfile.println("|                 chicago Il 60652|");
         textfile.println("+---------------------------------+");
         textfile.close();
      }
    
}
