package com.example.padroes.c_singleton.connectionPool.app;

import com.example.padroes.c_singleton.connectionPool.conn.Connection;
import com.example.padroes.c_singleton.connectionPool.conn.ConnectionPool;

public class Client {

    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A2");
//        pool.leaveConnection(conn); /** libera uma conexao */
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();;
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
