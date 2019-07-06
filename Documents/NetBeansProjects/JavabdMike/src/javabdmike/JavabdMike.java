
package javabdmike;

import java.sql.*;
public class JavabdMike {
    
    public static void main(String[] args) throws SQLException {
        try{//Get a connction
             Connection myConn = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/me","root","cool@1230****");
            //Create statment
            Statement myStmt = myConn.createStatement();
            //Execute SQL Query
            ResultSet myRe = myStmt.executeQuery("select* from workers1");
            //Process the result set
    while(myRe.next()){
        System.out.println(myRe.getString("First Name") +" , "+myRe.getString("LastName"));
    }
    
     /*  catch(Exception exc){
               exc.printStackTrace();
               }finally{
                       if(myRe != null){myRe.close();}
                       if(myStmt != null){myRe.close();}
                       if(myConn != null){myRe.close();}
                       }*/
        }
        System.out.println("Dude Sucess!!");        
            
        
    
            }
    }
    

