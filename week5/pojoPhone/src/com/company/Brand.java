package com.company;

import com.company.jdbc.connection.ConnJdbc;

import java.sql.*;

public class Brand {
    private static PreparedStatement statement=null;
    private static Connection connection=null;
    public static void main(String[] args) {

        addBrand("test");
        updateBrand(1,"google");
        selectBrand();
        getName("apple");
        deleteBrand(1);

    }

    private  static  void getName(String name){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnJdbc.getConnection();
            preparedStatement=connection.prepareStatement("select * from brand where name=? ");
            preparedStatement.setString(1,name);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("id"+resultSet.getInt("id")+"name"+
                        resultSet.getString("name"));
            }
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

    private static void selectBrand(){
        Connection connection=null;
        try{
             connection=ConnJdbc.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from brand");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void addBrand(String name){
        try {
            connection=ConnJdbc.getConnection();
            statement=connection.prepareStatement("insert into brand(name) values(?) ");
            statement.setString(1,name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (connection!=null){
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void updateBrand(int id,String name){
        try {
            connection=ConnJdbc.getConnection();
            statement=connection.prepareStatement("update brand set name=? where id=?");
            statement.setString(1,name);
            statement.setInt(2,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void deleteBrand(int id){
        try {
            connection=ConnJdbc.getConnection();
            statement=connection.prepareStatement("delete from brand where id=?");
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
