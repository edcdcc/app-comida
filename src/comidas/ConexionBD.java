/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_pedidos";
    private static final String USUARIO = "root"; 
    private static final String CONTRASEÑA = "root"; 

    public static Connection conectar() {
        try {
           
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("conexion exitosa!");
            return conexion;
        } catch (SQLException e) {
            System.err.println("error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
    
    
    public static void guardarPedido(String nombre, String tipoPedido, String direccion, String tipoProducto, String producto, String detalles, int cantidad, double total) {
    
    Connection conexion = conectar();
    if (conexion == null) {
        System.err.println("no se pudo realizar la conexion");
        return;
    }
    
    
    String sql = "INSERT INTO pedidos (nombre_cliente, tipo_pedido, direccion, tipo_producto, producto_escogido, detalles, cantidad, total)"
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement pst = conexion.prepareStatement(sql)) {
        
        pst.setString(1, nombre);           
        pst.setString(2, tipoPedido);     
        pst.setString(3, direccion);
        pst.setString(4, tipoProducto);       
        pst.setString(5, producto);
        pst.setString(6, detalles);
        pst.setInt(7, cantidad);           
        pst.setDouble(8, total);            
            
            
            pst.executeUpdate();
            
            System.out.println("pedido guardado exitosamente.");
        } catch (SQLException e) {
            System.err.println("error al guardar el pedido: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.err.println("error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    

}

