package com.administracion.models;

public class Venta {

    private int id, sales_quantity;
    private String product_name;
    private double product_price;

    public Venta(int id, int sales_quantity, String product_name, double product_price) {
        this.id = id;
        this.sales_quantity = sales_quantity;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSales_quantity() {
        return sales_quantity;
    }

    public void setSales_quantity(int sales_quantity) {
        this.sales_quantity = sales_quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
    
}
