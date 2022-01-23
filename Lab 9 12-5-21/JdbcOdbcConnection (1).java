import java.sql.*; 
import java.lang.String;
class JdbcOdbcConnection 
{ 
    public static void main(String[] args)
    { 
        Connection con=null; 
        Statement stmt=null; 
        ResultSet rs=null; 
    String sql="select * from student"; 
        try 
        { 
           
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Driver to connect the ODBC JDBC BridgeC
            con=DriverManager.getConnection("jdbc:odbc:csedsn"); //Connect the Data Source Name 
            System.out.println("Database Created"); 
            stmt=con.createStatement(); 
            rs=stmt.executeQuery(sql); 
            while(rs.next())  //till the ResultSet becomes null, fetch all the records 
            { 
        System.out.println("In while loop"); 
                int n=rs.getInt("Sno"); 
                String i=rs.getString("Sname"); 
		String x=rs.getString("City");
                //Double j=rs.getDouble("Marks"); 
                 
System.out.println(n);
System.out.println(i);
System.out.println(x);
//System.out.println(j);

} 
        } 
        catch(Exception e) 
        { 
            System.out.println("Unable to create Database"); 
        }
    } 
}
