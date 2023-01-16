/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_contactcrud.controller;

import com.mycompany.project_contactcrud.Connection.Koneksi;
import com.mycompany.project_contactcrud.Interface.IntKontak;
import com.mycompany.project_contactcrud.models.DaftarKontak;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class KontController implements IntKontak {
    PreparedStatement st;

    @Override
    public DaftarKontak insert(DaftarKontak o) throws SQLException {
        st=Koneksi.getConnection().prepareStatement("Insert into kontak (nama, telepon, alamat) values (?,?,?)");
        st.setString(1, o.getNama());
        st.setString(2, o.getTelepon());
        st.setString(3, o.getAlamat());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(DaftarKontak o) throws SQLException {
       st=Koneksi.getConnection().prepareStatement("Update kontak set  nama=?, telepon=?, alamat=? where id=?,");
        st.setString(1, o.getNama());
        st.setString(2, o.getTelepon());
        st.setString(3, o.getAlamat());
        st.setString(4,o.getId());
        st.executeUpdate();
    }

    @Override
    public void delete(String id) throws SQLException {
        st=Koneksi.getConnection().prepareStatement("Delete from kontak where id=?");
        st.setString(1,id);
        st.executeUpdate();
    }

    @Override
    public List<DaftarKontak> getAll() throws SQLException {
        Statement st=Koneksi.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from kontak");
        List<DaftarKontak>list=new ArrayList<DaftarKontak>();
        while(rs.next()){
            DaftarKontak kontak = new DaftarKontak();
            kontak.setId(rs.getString("id"));
            kontak.setNama(rs.getString("nama"));
            kontak.setTelepon(rs.getString("telepon"));
            kontak.setAlamat(rs.getString("alamat"));
            list.add(kontak);
            
        }
            
        return list;
    }
    
    
}
