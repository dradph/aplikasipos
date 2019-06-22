package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class config {
    public Connection con;
    public Statement stm;
    
    public void config(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/db_aplikasipos","root","");
        stm=con.createStatement();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Koneksi Gagal\n"+e.getMessage());
        System.exit(0);
    }
    }
}