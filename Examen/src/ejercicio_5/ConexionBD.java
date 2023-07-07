/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author marti
 */
public class ConexionBD {
    
    
    public String resultadosBD(){
       String resultado=""; 
       
    try{
    //jdbc:mysql://localhost/ejemplo?user=root&amp;amp;password=sa
    //jdbc:sqlserver://localhost:1433;databaseName=ventanillaMulti
            StringBuilder connectionUrl = new StringBuilder();
            connectionUrl.append("jdbc:sqlserver://localhost:1433;databaseName=examen");
            connectionUrl.append(";");
            connectionUrl.append("user=root");
            connectionUrl.append(";");
            connectionUrl.append("password=sa");           
            connectionUrl.append(";"); 
//            System.out.println("connectionUrl = " + connectionUrl);
            
            StringBuilder query = new StringBuilder();


                query.append("SELECT cod , nombre FROM datos");
					
//                System.out.println("query = " + query);
            try(Connection connection = DriverManager.getConnection(connectionUrl.toString());
                      PreparedStatement ps = connection.prepareStatement(query.toString());){
                
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    System.out.println("cod: "+rs.getString(1));
                    System.out.println("nombre: "+rs.getString(2));
                }
                
            }catch(Exception ex)
            {
                System.out.println("NO SE PUDO REALIZAR LA CONEXION");
                ex.printStackTrace();
            }        
        }catch(Exception e){
            System.out.println("NO SE PUDO PARAMETIRZAR");
            e.printStackTrace();

        }
    return resultado;
    }
    
}
