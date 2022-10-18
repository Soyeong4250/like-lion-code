package com.dbexercise.dao;

import com.dbexercise.domain.User;
import com.dbexercise.util.DBClose;
import com.dbexercise.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class UserDaoAbstract {

    public abstract Connection getConnection() throws SQLException;

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConnection();// db 연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        /*ps.setString(1, "1");
        ps.setString(2, "Soyeong");
        ps.setString(3, "1123");*/
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        int status = ps.executeUpdate();// ctrl + enter
        if(status == 1) {
            System.out.println("데이터 추가 성공");
        }
        DBClose.close(conn, ps);
    }

    public User selectById(String sId) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user= null;

        try {
            conn = DBConnection.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
            ps.setString(1, sId);

            rs = ps.executeQuery();
            if(rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                System.out.println("id = " + user.getId() + ", name = " + user.getName() + ", password = " + user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(conn, ps, rs);
        }
        return user;
    }

    public void selectAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();  // db 연결
            ps = conn.prepareStatement("SELECT id, name, password FROM users");

            rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                System.out.println("id = " + user.getId() + ", name = " + user.getName() + ", password = " + user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(conn, ps, rs);
        }
    }
}