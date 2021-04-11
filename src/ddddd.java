/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author IRFAN
 */
public class ddddd {
     public static Connection Connect()
    {
        Connection conn=null;
        try
        {
            String dbURL="jdbc:postgresql://127.0.0.1:5432/new_db";
            String userName="postgres";
            String password="reenoip";   
            conn=DriverManager.getConnection(dbURL,userName,password);
        }
        catch (Exception ex)
        {
        
        ex.printStackTrace();
        
        }
       return conn;
    }
    
}
        
    
    

    
    
    
    /*public void CityQuery()
    {
        try
        {
        String query="select * from testdb.\"Students\"";
            Statement st;
            st=conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> nameList = new ArrayList<String>();
                nameList.add(rs.getString("Name"));
                System.out.println(nameList);
               //nameList.addItem(rs.getString("Name"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }*/

}
