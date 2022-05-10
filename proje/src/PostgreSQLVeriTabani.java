import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLVeriTabani implements IVeriTabani{

    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kullanicilar",
                    "postgres", "123456");

            System.out.println("Veritabani Baglantisi Basarili...");

        } catch (Exception e) {
            System.out.println("Baglanti Basarisiz...");
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, String sifre) {
        Connection conn=this.baglan();

        String sql= "SELECT \"id\",\"sifre\" FROM \"kullanicilar\" WHERE \"id\"="+"'"+kullaniciAdi+"'"+"AND \"sifre\"="+"'"+sifre+"'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            if(!rs.next()){
                return false;
            }
            else{
                System.out.println("Kullanici Dogrulama Basarili...");
                return true;
            }

        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
