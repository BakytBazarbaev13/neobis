package com.company;

import com.company.jdbc.connection.ConnJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Price {
    private int id;
    private double price;
    private Phone phone_id;

    private static Connection connection=null;
    private static PreparedStatement preparedStatement=null;

    public static void main(String[] args) {
        addPrice(18000.0,1);
    }

    private static void addPrice(double price,int id_phone){
        try {
            connection= ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("insert into price (price,id_phone) values (?,?)");
            preparedStatement.setDouble(1,price);
            preparedStatement.setInt(2,id_phone);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            }
        }

    }

}
