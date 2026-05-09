package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProductDAO {

    public boolean addProduct(String name, double price, String ecoRating) {

        try {

            Connection con = DBConnection.getConnection();
            if(con == null) {

    System.out.println("Database connection failed!");

    return false;
}

            String sql = "INSERT INTO products(name, price, eco_rating) VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setDouble(2, price);
            pst.setString(3, ecoRating);
            int rowsInserted = pst.executeUpdate();
            return rowsInserted > 0;


        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());

    e.printStackTrace();

    return false;
        }
    }
}