package com.iesemilidarder.pvidal.controlador;

import com.iesemilidarder.pvidal.data.Actividades;
import com.iesemilidarder.pvidal.data.Producto;
import org.apache.commons.lang3.StringUtils;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPIController {
    public static List<Producto>getFinish() {
        List<Producto> finish = new ArrayList<>();
        return null;
    }
    
    public static final String REST_GROUP = "/rest";

    @GetMapping(REST_GROUP + "/getAllProducts")
    public List<Producto> getActividades(@RequestParam(value = "area", defaultValue = StringUtils.EMPTY) String area) {
        List<Producto> items = Actividades.getActividadList();
        return items;
    }

    @GetMapping(REST_GROUP + "/getProductTypes")
    public List<Producto> getObjetosProductos() {
        List<Producto> items2 = Producto.getObjetosProductos();
        return items2;
    }

    @GetMapping(REST_GROUP + "/getProduct")
    public List<Producto> getProductos(@RequestParam(value = "id", defaultValue = StringUtils.EMPTY) String id) {
        List<Producto> items3 = Producto.getProductos();
        return items3;
    }

    @GetMapping(REST_GROUP + "/getProduct1")/* no consigo terminar esto y se me han acabado las ideas*/
    public Producto getProduct(@RequestParam(value = "id", defaultValue = StringUtils.EMPTY) String id) {
        Producto product = new Producto();
        List<Producto> items = Actividades.getActividadList();
        for (Producto producto: Actividades.getActividadList()
             ) {
            if(producto.getId()== Integer.parseInt(id)){
                return product = producto;
            }
        }
       return product;

    }
}