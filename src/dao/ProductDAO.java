package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {

    public void addProduct(String name, double price, int rating) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO products(name, price, eco_rating) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setDouble(2, price);
            pst.setInt(3, rating);

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}