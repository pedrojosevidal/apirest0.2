package com.iesemilidarder.pvidal.data;



import java.util.ArrayList;
import java.util.List;


public class Producto {

    static String[] productTipe = {"vuelos","actividades","Restaurantes"};
    static String[] productos = {"vuelo a Berlin","vuelo a roma","vuelo a madrid","cena en don caracol(mallorca)","paracaidismo en suecia"};


    private String descripcion;
    private int id;
    private Double precio;
    private String name;
    public static List<Producto>getObjetosProductos() {
        List<Producto> objetosProductos = new ArrayList<>();


        for (int aux = 0; aux < productTipe.length; aux++) {
            Producto product = new Producto();
            product.setName(productTipe[aux]);
            product.setPrecio((double)20+aux*2);
            product.setId(aux +1);
            if (productTipe[aux] == "vuelos"){
                product.setDescripcion("En este tipo de producto podremos encontrar los diferentes vuelos que tenemos");
            }
            else if(productTipe[aux] == "actividades"){
                product.setDescripcion("En este tipo de producto podremos encontrar los diferentes tipos de actividades que tenemos");
            }
            else{
                product.setDescripcion("este tipo de producto nos dira los diferentes restaurantes a los que podemos acudir");
            }
            objetosProductos.add(product);

        }
        return objetosProductos;
    }
    public static List<Producto>getProductos(){
        List<Producto> aux2 = new ArrayList<>();
        for(int aux = 0;aux < productos.length;aux++){
            Producto producto = new Producto();
            producto.setName(productos[aux]);
            producto.setId(aux +1);
            producto.setPrecio(null);
            producto.setDescripcion(null);
            aux2.add(producto);
        }
        return aux2;
    }



    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
