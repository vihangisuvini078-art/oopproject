package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientDAO {

    public void addClient(String name, String contact, String address) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO clients(name, contact, address) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, address);

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

