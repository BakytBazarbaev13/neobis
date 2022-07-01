package com.company;

import com.company.jdbc.connection.ConnJdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Client {

    private static Connection connection=null;
    private static PreparedStatement preparedStatement=null;

    public static void main(String[] args) {
        deleteClient(1);
        getClient();
    }

    private static void addClient(String name,String address,String phone_number){
        try {
            connection= ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("insert into client(name,address,phone_number)" +
                    "values(?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,phone_number);
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

    private static void getClient(){
        try {
            connection=ConnJdbc.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from client");
            while (resultSet.next()){
                System.out.println("id "+resultSet.getInt(1)+" name "+resultSet.getString(2)+
                        " address "+resultSet.getString(3)+" number "+resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateClient(int id,String name, String address, String phone_number){
        try {
            connection=ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("update client set name=? , " +
                    "address=?, phone_number=? where id=?");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,phone_number);
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            }
        }
    }

    private static void deleteClient(int id){
        try {
            connection=ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("delete from client where id=?");
            preparedStatement.setInt(1,id);
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
