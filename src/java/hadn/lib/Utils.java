/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadn.lib;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Utils {
    public static Connection makeConnection() throws Exception{
        Connection cn = null;
        String IP = "localhost";
        String instanceName = "NGANHA";
        String port = "1433";
        String uid = "sa";
        String pwd = "12345";
        String db = "myqnaportal";
        String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://" + IP + "\\" + instanceName +":"+port+";databaseName=" + db + ";username=" + uid + ";password=" + pwd;
        //   jdbc:sqlserver://localhost\NGANHA:1433;databaseName=PlantShop
        Class.forName(drive);
        cn = DriverManager.getConnection(url);
        return cn;
    }
    
    
}
