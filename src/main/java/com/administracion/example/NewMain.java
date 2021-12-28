
package com.administracion.example;

import com.administracion.config.Conexion;
import com.administracion.dao.ProductoDAO;
import com.administracion.models.Venta;
import java.util.List;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        ProductoDAO product = new ProductoDAO();
        List<Venta> ventas = product.getProductosMasVendidos();
        for(int i = 0; i< ventas.size(); i++){
            System.out.println(ventas.get(i).getProduct_name());
        }
    }
    
}
