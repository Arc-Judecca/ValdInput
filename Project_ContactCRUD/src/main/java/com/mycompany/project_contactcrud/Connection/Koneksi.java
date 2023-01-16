/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_contactcrud.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class Koneksi {
    public static Connection connect;
    public static Statement st;
    public static ResultSet rs;
    
    public static Connection getConnection(){
        if(connect==null){
            try{
                System.out.println("Membuat koneksi...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bukutelepon",
                        "root",
                        "");
                st = (Statement) connect.createStatement();
                JOptionPane.showMessageDialog(null,"Connected");
                System.out.println("Koneksi berhasil.");
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Not Connected");
                System.out.println("Koneksi berhasil.");
            }
        }
        return connect;
    }

    
}
