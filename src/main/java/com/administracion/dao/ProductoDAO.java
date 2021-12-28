package com.administracion.dao;

import com.administracion.config.Conexion;
import com.administracion.models.Venta;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    private Conexion conexion = new Conexion();
    private ResultSet resultSet;

    public List<Venta> getProductosMasVendidos() {
        List<Venta> productosMasVendidoses = new ArrayList<>();
        String sql = String.format("SELECT * from public.get_top_sales();");
        try {
            conexion.conectar();
            resultSet = conexion.ejecutarSql(sql);
            //Llena la lista de los datos
            while (resultSet.next()) {
                Venta productos = new Venta(resultSet.getInt("id"),
                        resultSet.getInt("sales_quantity"), 
                        resultSet.getString("product_name"), 
                        resultSet.getDouble("product_price"));
                productosMasVendidoses.add(productos);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            conexion.desconectar();
        }
        return productosMasVendidoses;
    }
}
