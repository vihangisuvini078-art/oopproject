package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Client;

public class ClientDAO {

    public boolean addClient(Client client) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO clients(name, contact, address) VALUES(?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, client.getClientName());
            pst.setString(2, client.getPhone());
            pst.setString(3, client.getAddress());

            int rowsInserted = pst.executeUpdate();

            return rowsInserted > 0;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}