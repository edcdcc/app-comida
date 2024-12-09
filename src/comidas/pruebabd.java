/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidas;

import java.sql.Connection;

public class pruebabd {
    public static void main(String[] args) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            System.out.println("conexion realizada correctamente");
        } else {
            System.out.println("error al conectar con la base de datos");
        }
    }
}

