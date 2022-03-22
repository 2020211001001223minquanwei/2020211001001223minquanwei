package com.minquanwei;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;


//the 4th way to get connection:use @WebServlet()
@WebServlet(
        name = "JDBCDemoServlet",
        urlPatterns = "/jdbc",
        initParams = {
                @WebInitParam(name = "driver",value = "com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name = "url",value = "jdbc:sqlserver://localhost:1433;database=UserTest_DB"),
                @WebInitParam(name = "username",value = "sa"),
                @WebInitParam(name = "password",value = "117215")
        }
        //loadOnStartup = 1
)
public class JDBCDemoServlet extends HttpServlet {
    Connection conn = null;
    @Override
    public void init() throws ServletException {
        super.init();
        //the 2nd way to get connection:within init()
//        String dirver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String url = "jdbc:sqlserver://localhost:1433;database=UserTest_DB";
//        String username = "sa";
//        String password = "117215";

        //the 3rd way to get connection:set servlet config parameter in web.xml
        ServletConfig config = getServletConfig();
        String dirver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");

        try {
            Class.forName(dirver);
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connection -->"+conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //the 1st way to get connection: within doGet()
//        String dirver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String url = "jdbc:sqlserver://localhost:1433;database=UserTest_DB";
//        String username = "sa";
//        String password = "117215";
//
//        try {
//            Class.forName(dirver);
//            Connection conn = DriverManager.getConnection(url,username,password);
//            System.out.println("Connection -->"+conn);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
