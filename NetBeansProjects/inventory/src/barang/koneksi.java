/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang;

/**
 *
 * @author Acer e14
 */
public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3360//crudmysql";
        String user = "root";
        String password = "";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        koneksi = DriverManager.getConnection(url, user, password);
        System.out.println("berhasi terhubung");
            }catch (Exception e) {
                System.out.println("error");
            }
        }
        return koneksi;
    }
    public static void main(string args[]){
        getkoneksi();
    }}
