package com.company;

import com.company.jdbc.connection.ConnJdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Phone {
    private static Connection connection=null;
    private static PreparedStatement preparedStatement=null;

    public static void main(String[] args) {
        addPhone("A40","black",64,4,new Date(1),1);
    }

    private static void addPhone(String name,String color,int memory,int ram,
                                Date year_of_issue,int id_brand){
        try {
            connection=ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("insert into phone " +
                    "(name,color,memory,ram,id_brand values(?,?,?,?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,color);
            preparedStatement.setDouble(3,memory);
            preparedStatement.setDouble(4,ram);
            preparedStatement.setDate(5,year_of_issue);
            preparedStatement.setInt(6,id_brand);
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
