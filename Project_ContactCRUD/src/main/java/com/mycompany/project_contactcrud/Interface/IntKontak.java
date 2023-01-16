/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.project_contactcrud.Interface;

import com.mycompany.project_contactcrud.models.DaftarKontak;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public interface IntKontak {
    DaftarKontak insert (DaftarKontak o) throws SQLException;
    
    void update (DaftarKontak o) throws SQLException;
    
    void delete (String id) throws SQLException;
    
    List<DaftarKontak> getAll() throws SQLException;
}
