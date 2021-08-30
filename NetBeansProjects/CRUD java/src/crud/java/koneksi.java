package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class koneksi {
    Connection koneksi;
    public static Connection(){
        try{
            class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/tugascrud")
                    
            return koneksi;
        } catch(Exception e) {
            jOptionpane.showMessageDialog(null, e);
            
            return null;
        }
    }
     
}
