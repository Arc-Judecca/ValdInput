/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_contactcrud;

import com.mycompany.project_contactcrud.Connection.Koneksi;
import com.mycompany.project_contactcrud.Frame.KontakFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class Project_ContactCRUD {

    public static void main(String[] args) {
        
        //Koneksi.getConnection();
    
     SwingUtilities.invokeLater(() -> {
         KontakFrame form = new KontakFrame();
         form.setLocationRelativeTo(null);
         form.setVisible(true);
     }); 
          
}
}    

