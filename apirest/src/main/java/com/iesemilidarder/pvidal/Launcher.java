package com.iesemilidarder.pvidal;

import com.iesemilidarder.pvidal.data.Actividades;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Launcher {
    public static void main(String... args){
        Actividades actividades = new Actividades();
        //creo un array de tipo String que coje las actividades de la Clase Actividades
        String activiti[] = Actividades.getActividad();
        //creo un array de tipo String que coje los paises de la Clase Actividades
        String paises[] = Actividades.getPaises();
        //creo 2 bucles para cojer primero todos los paises y por cada pais te de todas la actividades
        for(int aux = 0;aux<paises.length;aux++) {
            for (int aux2 = 0; aux2 < activiti.length; aux2++) {
                //creo el objeto actividades y paises
                Actividades actividad_paises = new Actividades();
                //al objeto le doy un valor para actividades y otro valor para paises
                actividad_paises.setActividades(activiti[aux2]);
                actividad_paises.setPais(paises[aux]);

            }
        }
    }
}
